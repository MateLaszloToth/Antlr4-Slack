package com.kambr.parser.slack

import com.kambr.parser.slack.dataClasses.Message
import com.kambr.parser.slack.dataClasses.Sender
import com.kambr.parser.slack.generated.SlackBaseVisitor
import com.kambr.parser.slack.generated.SlackParser
import com.kambr.parser.slack.generated.SlackParser.MessageContext
import java.time.LocalTime
import java.time.format.DateTimeFormatter


class MySlackVisitor : SlackBaseVisitor<Any>() {

    override fun visitConversation(ctx: SlackParser.ConversationContext): List<Message> {
        val messages = mutableListOf<Message>()


        ctx.message().forEach { child ->
            messages.add(visitMessage(child))
        }
        return messages
    }

    override fun visitMessage(ctx: MessageContext): Message {
       return Message(visitSender(ctx.sender()), visitTime(ctx.time()), visitText(ctx.text()))
    }

    override fun visitSender(ctx: SlackParser.SenderContext): Sender {
       return Sender(ctx.WORD().map { it.text })
    }

    override fun visitTime(ctx: SlackParser.TimeContext): LocalTime {
        val format  = DateTimeFormatter.ofPattern("H:mm")
        return LocalTime.parse(ctx.CLOCK().text, format)
    }

    override fun visitText(ctx: SlackParser.TextContext): List<String> {
        val sentences = ctx.sentence().map { sentence ->
            sentence.text
        }

//        val sentences = mutableListOf<String>()
//        ctx.sentence().forEach { sentence ->
//            if (sentence.emoji().size > 0) ctx.sentence().forEach { it.WORD().removeAll { it != null } }
//            sentences.add(visitSentence(sentence))
//        }

        return sentences
    }

    override fun visitSentence(ctx: SlackParser.SentenceContext): String {
        return if(ctx.emoji().size == 0)  "¯\\_(ツ)_/¯" else "Found an emoji"
    }

    override fun visitEmoji(ctx: SlackParser.EmojiContext): Any {
        return ctx.WORD()
    }

    override fun visitAmORpm(ctx: SlackParser.AmORpmContext): String {
        return when(ctx.WORD().text) {
            "AM" -> "Morning"
            "PM" -> "Afternoon"
            else -> "Siesta"
        }
    }
}