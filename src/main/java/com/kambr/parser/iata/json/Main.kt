package com.kambr.parser.iata.json

import com.kambr.kambrlogger.Logger
import com.kambr.parser.iata.json.dataClasses.legData.LegData
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import java.io.File
import java.io.IOException

fun main() {
    val directory = "" // change to the directory from where you want to parse all files of specific type
    val legDataFilePattern = "legData\\.json".toRegex()
    val scheduleFilePattern = "schedule\\.json".toRegex()

    val legDataLogger = Logger(LegDataParser::class.java)

    var charStream: CharStream? = null
    val result: MutableList<List<LegData>> = mutableListOf()
    val fileList = File(directory).listFiles { _, name -> name.contains(legDataFilePattern) }!!

    fileList.forEach { file ->
        println(file.name)
        try {
            charStream = CharStreams.fromFileName(file.absolutePath)
        } catch (e: IOException) {
            legDataLogger.error(e.localizedMessage)
        }
        result.add(LegDataParser.parse(charStream!!))
        // result.add(ScheduleParser.parse(charStream!!))
    }

    println("Done")
}