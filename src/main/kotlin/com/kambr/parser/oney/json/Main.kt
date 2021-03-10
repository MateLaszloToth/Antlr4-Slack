package com.kambr.parser.oney.json

import com.kambr.kambrlogger.Logger
import com.kambr.parser.oney.json.dataClasses.legData.LegData
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import java.io.File
import java.io.IOException

class Main

fun main() {
    val directory = "" // change to the directory from where you want to parse all files of specific type
    val legDataFilePattern = "legData\\.json".toRegex()
//    val scheduleFilePattern = "schedule\\.json".toRegex()

    val logger = Logger(MyJsonVisitor::class.java)

    var charStream: CharStream? = null
    val result: MutableList<List<LegData>> = mutableListOf()
    val fileList = File(directory).listFiles { _, name -> name.contains(legDataFilePattern) }!!

    fileList.forEach { file ->
        try {
            charStream = CharStreams.fromFileName(file.absolutePath)
        } catch (e: IOException) {
            logger.error(e.localizedMessage)
        }
        result.add(parseIATALegData(charStream!!))
//         result.add(parseIATASchedule(charStream!!))
    }

    logger.info("Done")
}