package com.kambr.parser.onex.tursys

import com.kambr.parser.onex.tursys.dataClasses.Tursys
import com.kambr.parser.onex.tursys.generated.TurSysLexer
import com.kambr.parser.onex.tursys.generated.TurSysParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

@Suppress("UNCHECKED_CAST")
object TursysParser {

    @JvmStatic
    fun parse(charStream: CharStream): List<Tursys> {
        val tursysLexer = TurSysLexer(charStream)
        val tursysTokenStream = CommonTokenStream(tursysLexer)
        val tursysParser = TurSysParser(tursysTokenStream)
        val file = tursysParser.file()
        val tursysVisitor = MyTurSysBaseVisitor()
        return tursysVisitor.visit(file) as List<Tursys>
    }
}