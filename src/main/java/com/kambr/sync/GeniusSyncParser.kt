package com.kambr.sync

import com.kambr.kambrlogger.Logger
import com.kambr.sync.dataClasses.GeniusFlight
import com.kambr.sync.generated.SyncLexer
import com.kambr.sync.generated.SyncParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.IOException

object GeniusSyncParser {
    var logger = Logger(GeniusSyncParser::class.java)
    @JvmStatic
    fun parse(charStream: CharStream?): List<GeniusFlight> {
        val lexer = SyncLexer(charStream)
        val tokenStream = CommonTokenStream(lexer)
        val parser = SyncParser(tokenStream)
        val flightRecordsContext = parser.flightRecords()
        val visitor = MySyncBaseVisitor()
        return visitor.visit(flightRecordsContext) as List<GeniusFlight>
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