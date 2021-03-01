package com.kambr.parser.oney.json

import com.kambr.parser.oney.json.dataClasses.schedule.Schedule
import com.kambr.parser.oney.json.generated.JSONLexer
import com.kambr.parser.oney.json.generated.JSONParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

object ScheduleParser {
    @JvmStatic
    fun parse(charStream: CharStream): List<Schedule> {
        val jsonLexer = JSONLexer(charStream)
        val jsonTokenStream = CommonTokenStream(jsonLexer)
        val jsonParser = JSONParser(jsonTokenStream)
        val jsonContext = jsonParser.json()
        val jsonRows = MyJsonVisitor().visit(jsonContext) as List<*>
        val scheduleList = mutableListOf<Schedule>()
        jsonRows.forEach { row ->
            if (row != null)
                scheduleList.add(Schedule(row as HashMap<String, Any>))
        }
        return scheduleList.toList()
    }
}