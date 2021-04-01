package com.kambr.parser.slack

import com.kambr.parser.slack.dataClasses.Sender
import com.kambr.parser.slack.generated.SlackBaseListener
import com.kambr.parser.slack.generated.SlackParser.SenderContext

class MySlackListener : SlackBaseListener() {

    val attendants = mutableSetOf<Sender>()

    override fun exitSender(ctx: SenderContext) {
        attendants.add(Sender(ctx.WORD().map { it.text }))
    }

}