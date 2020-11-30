package com.kambr.parser.onex.tursys


import com.kambr.parser.onex.tursys.generated.TurSysBaseVisitor
import com.kambr.parser.onex.tursys.generated.TurSysLexer
import com.kambr.parser.onex.tursys.generated.TurSysParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

object TursysParser {

    @JvmStatic
    fun parse(charStream: CharStream) {
        val tursysLexer = TurSysLexer(charStream)
        val tursysTokenStream = CommonTokenStream(tursysLexer)
        val tursysParser = TurSysParser(tursysTokenStream)
        val file = tursysParser.file()
        val tursysVisitor = TurSysBaseVisitor<Any>()
        // return tursysVisitor.visit(flightRecordsContext) as List<GeniusFlight>
    }
}