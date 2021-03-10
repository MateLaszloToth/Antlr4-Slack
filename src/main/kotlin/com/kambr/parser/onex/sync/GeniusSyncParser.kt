package com.kambr.parser.onex.sync

import com.kambr.parser.onex.sync.dataClasses.GeniusFlight
import com.kambr.parser.onex.sync.generated.SyncLexer
import com.kambr.parser.onex.sync.generated.SyncParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

@Suppress("UNCHECKED_CAST")
object GeniusSyncParser {

    @JvmStatic
    fun parse(charStream: CharStream): List<GeniusFlight> {
        val syncLexer = SyncLexer(charStream)
        val syncTokenStream = CommonTokenStream(syncLexer)
        val syncParser = SyncParser(syncTokenStream)
        val flightRecordsContext: SyncParser.FlightRecordsContext = syncParser.flightRecords()
        val syncVisitor = MySyncBaseVisitor()
        return syncVisitor.visit(flightRecordsContext) as List<GeniusFlight>
    }
}