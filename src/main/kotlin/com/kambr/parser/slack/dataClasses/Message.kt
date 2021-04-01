package com.kambr.parser.slack.dataClasses

import java.time.LocalTime

data class Message(
    val sender: Sender,
    val time: LocalTime,
    val text: List<String>
)
