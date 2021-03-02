package com.kambr.parser.iata.json

import com.kambr.parser.iata.json.dataClasses.legData.LegData
import com.kambr.parser.iata.json.generated.JSONLexer
import com.kambr.parser.iata.json.generated.JSONParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

object LegDataParser {
    @JvmStatic
    fun parse(charStream: CharStream): List<LegData> {
        val jsonLexer = JSONLexer(charStream)
        val jsonTokenStream = CommonTokenStream(jsonLexer)
        val jsonParser = JSONParser(jsonTokenStream)
        val jsonContext = jsonParser.json()
        val jsonRows = MyJsonVisitor().visit(jsonContext) as List<*>
        val legDataList = mutableListOf<LegData>()
        jsonRows.forEach { row ->
            if (row != null)
                legDataList.add(LegData(row as HashMap<String, Any>))
        }
        return legDataList.toList()
    }
}