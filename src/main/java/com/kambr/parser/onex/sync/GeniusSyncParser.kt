package com.kambr.parser.onex.sync

import com.kambr.kambrlogger.Logger
import com.kambr.parser.onex.sync.dataClasses.GeniusFlight
import com.kambr.parser.onex.sync.generated.SyncLexer
import com.kambr.parser.onex.sync.generated.SyncParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.IOException

object GeniusSyncParser {
    var logger = Logger(GeniusSyncParser::class.java)
    @JvmStatic
    fun parse(charStream: CharStream?): List<GeniusFlight> {
        val syncLexer = SyncLexer(charStream)
        val syncTokenStream = CommonTokenStream(syncLexer)
        val syncParser = SyncParser(syncTokenStream)
        val flightRecordsContext = syncParser.flightRecords()
        val syncVisitor = MySyncBaseVisitor()
        return syncVisitor.visit(flightRecordsContext) as List<GeniusFlight>
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var charStream: CharStream? = null
        try {
            charStream = CharStreams.fromFileName("") // Add filepath if you want to run main
        } catch (e: IOException) {
            logger.error(e.localizedMessage)
        }
        val geniusFlights = parse(charStream)
    }
}