package com.kambr.parser.onex

import com.kambr.kambrlogger.Logger
import com.kambr.parser.onex.spo.GeniusSpoGlobalParser
import com.kambr.parser.onex.sync.GeniusSyncParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import java.io.File
import java.io.IOException

fun main(args: Array<String>) {
    val directory = "" // change to the directory from where you want to parse all files
    val extension = ".csv"
    val syncLogger = Logger(GeniusSyncParser::class.java)
    val spoLogger = Logger(GeniusSpoGlobalParser::class.java)

    var charStream: CharStream? = null
    val result: MutableList<Any> = mutableListOf()
    val fileList = File(directory).listFiles {_, name -> name.endsWith(extension) }!!

    fileList.forEach { file ->
        try {
            charStream = CharStreams.fromFileName(file.absolutePath)
        } catch (e: IOException) {
            // syncLogger.error(e.localizedMessage)
            spoLogger.error(e.localizedMessage)
        }
        // result.add(GeniusSyncParser.parse(charStream!!))
        result.add(GeniusSpoGlobalParser.parse(charStream!!))
    }

    println("Done")
}

