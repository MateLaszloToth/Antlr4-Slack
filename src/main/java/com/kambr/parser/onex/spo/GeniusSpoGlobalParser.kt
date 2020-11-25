package com.kambr.parser.onex.spo

import com.kambr.parser.onex.spo.dataClasses.SpoGlobal
import com.kambr.parser.onex.spo.generated.SpoLexer
import com.kambr.parser.onex.spo.generated.SpoParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

object GeniusSpoGlobalParser {

    @JvmStatic
    fun parse(charStream: CharStream): List<SpoGlobal> {
        val spoGlobalLexer = SpoLexer(charStream)
        val spoGlobalTokenStream = CommonTokenStream(spoGlobalLexer)
        val spoGlobalParser = SpoParser(spoGlobalTokenStream)
        val spoContext: SpoParser.SpoContext = spoGlobalParser.spo()
        val spoGlobalVisitor = MySpoBaseVisitor()
        return spoGlobalVisitor.visit(spoContext) as List<SpoGlobal>
    }
}