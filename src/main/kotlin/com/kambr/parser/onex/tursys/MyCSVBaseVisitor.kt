package com.kambr.parser.onex.tursys

import com.kambr.parser.onex.tursys.generated.CSVBaseVisitor
import com.kambr.parser.onex.tursys.generated.CSVParser

class MyCSVBaseVisitor : CSVBaseVisitor<Any>() {

    override fun visitCsvFile(ctx: CSVParser.CsvFileContext): List<List<String?>> {
        val rows = mutableListOf<List<String?>>()
        ctx.row().forEach { rowContext ->
            rows.add(visitRow(rowContext))
        }
        return rows
    }

    override fun visitRow(ctx: CSVParser.RowContext): List<String?> {
        return ctx.field().map { if (it.text == "") null else it.text }
    }
}