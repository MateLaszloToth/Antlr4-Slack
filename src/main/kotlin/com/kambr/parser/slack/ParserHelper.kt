package com.kambr.parser.slack

import com.kambr.parser.slack.dataClasses.Message
import com.kambr.parser.slack.generated.SlackLexer
import com.kambr.parser.slack.generated.SlackParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker

@Suppress("UNCHECKED_CAST")
fun parseSlackConversationWithVisitor(string: String): List<Message> {

    val charStream = CharStreams.fromString(string)
    val slackLexer = SlackLexer(charStream)
    val slackTokenStream = CommonTokenStream(slackLexer)
    val slackParser = SlackParser(slackTokenStream)
    val conversationContext = slackParser.conversation()
    val slackConversation = MySlackVisitor().visit(conversationContext) as List<Message> // this casting warning is suppressed

    return slackConversation
}

@Suppress("UNCHECKED_CAST")
fun parseSlackConversationWithListener(string: String): String {

    val charStream = CharStreams.fromString(string)
    val slackLexer = SlackLexer(charStream)
    val slackTokenStream = CommonTokenStream(slackLexer)
    val slackParser = SlackParser(slackTokenStream)
    val conversationContext = slackParser.conversation()

    val listener = MySlackListener()
    val walker = ParseTreeWalker()
    walker.walk(listener, conversationContext)

    return listener.attendants.toString()
}