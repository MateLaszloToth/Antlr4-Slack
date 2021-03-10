package com.kambr.parser.onex

import com.kambr.kambrlogger.Logger
import com.kambr.parser.onex.tursys.TursysParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import java.io.File
import java.io.IOException

fun main() {
    val directory = "" // change to the directory from where you want to parse all files of specific type
//    val syncFileName = """SYNC_[0-9]+_[0-9]+\.txt""".toRegex()
//    val spoGlobalFileName = ".*SpoGlobal.*".toRegex()
    val tursysFileName = "TURSYS.*".toRegex()
//    val syncLowareFileName = """SYNC_LOWFARE_SALES_[0-9]+_[0-9]+\.txt""".toRegex()
    // val syncLogger = Logger(GeniusSyncParser::class.java)
    // val spoLogger = Logger(GeniusSpoGlobalParser::class.java)
    val tursysLogger = Logger(TursysParser::class.java)
    // val syncLowFareLogger = Logger(SyncLowFareParser::class.java)

    var charStream: CharStream? = null
    val result: MutableList<Any> = mutableListOf()
    val fileList = File(directory).listFiles { _, name -> name.contains(tursysFileName) }!!

    fileList.forEach { file ->
        println(file.name)
        try {
            charStream = CharStreams.fromFileName(file.absolutePath)
        } catch (e: IOException) {
            // syncLogger.error(e.localizedMessage)
            // spoLogger.error(e.localizedMessage)
            tursysLogger.error(e.localizedMessage)
            // syncLowFareLogger.error(e.localizedMessage)
        }
        // result.add(GeniusSyncParser.parse(charStream!!))
        // result.add(GeniusSpoGlobalParser.parse(charStream!!))
        result.add(TursysParser.parse(charStream!!))
        // result.add(GeniusSyncLowFareParser.parse(charStream!!))
    }

    println("Done")
}

