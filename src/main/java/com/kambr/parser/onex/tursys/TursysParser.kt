package com.kambr.parser.onex.tursys

import com.kambr.parser.onex.tursys.dataClasses.Tursys
import com.kambr.parser.onex.tursys.generated.CSVLexer
import com.kambr.parser.onex.tursys.generated.CSVParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

object TursysParser {

    @JvmStatic
    fun parse(charStream: CharStream): List<Tursys> {
        val tursysLexer = CSVLexer(charStream)
        val tursysTokenStream = CommonTokenStream(tursysLexer)
        val tursysParser = CSVParser(tursysTokenStream)
        val file = tursysParser.csvFile()
        val tursysVisitor = MyCSVBaseVisitor()
        val tursys = (tursysVisitor.visit(file) as List<List<String?>>).map { Tursys(it) }
        return tursys
    }
}