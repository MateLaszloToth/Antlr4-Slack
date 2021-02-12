package com.kambr.parser.oney.json

import com.kambr.parser.onex.tursys.MyTurSysBaseVisitor
import com.kambr.parser.onex.tursys.dataClasses.Tursys
import com.kambr.parser.oney.json.generated.JSONBaseVisitor
import com.kambr.parser.oney.json.generated.JSONLexer
import com.kambr.parser.oney.json.generated.JSONParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

object LegDataParser {
        @JvmStatic
        fun parse(charStream: CharStream): Any {
            val jsonLexer = JSONLexer(charStream)
            val jsonTokenStream = CommonTokenStream(jsonLexer)
            val jsonParser = JSONParser(jsonTokenStream)
            val file = jsonParser.json()
            val legDataVisitor = LegDataVisitor()
            return legDataVisitor.visit(file)
        }

}