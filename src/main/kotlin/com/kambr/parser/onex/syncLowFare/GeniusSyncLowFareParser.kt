package com.kambr.parser.onex.syncLowFare

import com.kambr.parser.onex.syncLowFare.dataClasses.LowFareSales
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareLexer
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

@Suppress("UNCHECKED_CAST")
object GeniusSyncLowFareParser {

    @JvmStatic
    fun parse(charStream: CharStream): List<LowFareSales> {
        val geniusLowFareLexer = SyncLowFareLexer(charStream)
        val geniusLowFareTokenStream = CommonTokenStream(geniusLowFareLexer)
        val geniusLowFareParser = SyncLowFareParser(geniusLowFareTokenStream)
        val fileContext: SyncLowFareParser.FileContext = geniusLowFareParser.file()
        val geniusLowFareVisitor = MySyncLowFareBaseVisitor()
        return geniusLowFareVisitor.visit(fileContext) as List<LowFareSales>
    }
}