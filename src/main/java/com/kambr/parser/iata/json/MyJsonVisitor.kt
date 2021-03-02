package com.kambr.parser.iata.json

import com.kambr.parser.iata.json.generated.JSONBaseVisitor
import com.kambr.parser.iata.json.generated.JSONParser.ArrayContext
import com.kambr.parser.iata.json.generated.JSONParser.JsonContext
import com.kambr.parser.iata.json.generated.JSONParser.ObjectContext
import com.kambr.parser.iata.json.generated.JSONParser.PairContext
import com.kambr.parser.iata.json.generated.JSONParser.ValueContext
import org.antlr.v4.runtime.tree.TerminalNode

class MyJsonVisitor : JSONBaseVisitor<Any>() {

    override fun visitJson(ctx: JsonContext): List<Any> {
        val legDataList = mutableListOf<Any>()
        ctx.children.forEach { child ->
            when (child) {
                is ValueContext -> legDataList.add(visitValue(child))
                !is TerminalNode -> throw RuntimeException(
                    "Unexpected children of JsonContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                )
            }
        }
        return legDataList
    }

    override fun visitObject(ctx: ObjectContext): HashMap<String, Any> {
        val map = hashMapOf<String, Any>()
        ctx.children.forEach { child ->
            when (child) {
                is PairContext -> {
                    val pair = visitPair(child)
                    map[pair.first] = pair.second
                }
                !is TerminalNode -> {
                    throw RuntimeException(
                        "Unexpected children of JsonContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }
        return map
    }

    override fun visitPair(ctx: PairContext): Pair<String, Any> {
        return Pair(ctx.STRING().text, visitValue(ctx.value()))
    }

    override fun visitArray(ctx: ArrayContext): List<Any> {
        val values = mutableListOf<Any>()
        ctx.children.forEach { child ->
            if (child is ValueContext)
                values.add(visitValue(child))

        }
        return values.toList()
    }

    override fun visitValue(ctx: ValueContext): Any {
        if (ctx.childCount != 1) throw RuntimeException("ValueContext must have 1 children, but it has: ${ctx.childCount}")
        return when (val child = ctx.getChild(0)) { // Value has only one child
            is ObjectContext -> visitObject(child)
            is ArrayContext -> visitArray(child)
            is TerminalNode -> child.text.trim()
            else -> throw RuntimeException(
                "Unexpected children of JsonContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
            )

        }
    }
}