package com.kambr.parser.oney.json

import com.kambr.kambrlogger.Logger
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import java.io.File
import java.io.IOException

fun main() {
    val directory = "/Users/matetoth/Desktop/Flyr/flyr_export" // change to the directory from where you want to parse all files of specific type
    val legDataFile = "legData\\.json".toRegex()

    val legDataLogger = Logger(LegDataParser::class.java)

    var charStream: CharStream? = null
    val result: MutableList<Any> = mutableListOf()
    val fileList = File(directory).listFiles { _, name -> name.contains(legDataFile) }!!

    fileList.forEach { file ->
        println(file.name)
        try {
            charStream = CharStreams.fromFileName(file.absolutePath)
        } catch (e: IOException) {
            legDataLogger.error(e.localizedMessage)
        }
        result.add(LegDataParser.parse(charStream!!))
    }

    println("Done")
}