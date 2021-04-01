package com.kambr.parser.slack

import com.kambr.parser.slack.dataClasses.Message
import com.kambr.parser.slack.generated.SlackLexer
import com.kambr.parser.slack.generated.SlackParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

@Suppress("UNCHECKED_CAST")
fun parseSlackConversation(string: String): List<Message> {

    val charStream = CharStreams.fromString(string)
    val slackLexer = SlackLexer(charStream)
    val slackTokenStream = CommonTokenStream(slackLexer)
    val slackParser = SlackParser(slackTokenStream)
    val conversationContext = slackParser.conversation()
    val slackConversation = MySlackVisitor().visit(conversationContext) as List<Message> // this casting warning is suppressed

    return slackConversation
}