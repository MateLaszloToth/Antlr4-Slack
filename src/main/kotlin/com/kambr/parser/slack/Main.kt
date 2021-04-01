package com.kambr.parser.slack

fun main() {

    val rawConversation =
        "Martin Kaduc  7:39 PM\n" +
                "Hey\n" +
                "7:39\n" +
                "Any chance you're online\n" +
                "\n" +
                "Máté Tóth  7:40 PM\n" +
                "yeah\n" +
                "7:40\n" +
                "whats up\n" +
                "\n" +
                "Martin Kaduc  7:41 PM\n" +
                "U6 failed import. Guessing it's the same shit as before.:) Can you fix it?\n" +
                "\n" +
                "Máté Tóth  7:41 PM\n" +
                "yeah\n" +
                "\n" +
                "Martin Kaduc  7:41 PM\n" +
                "Thanks\n" +
                "\n" +
                "Martin Kaduc  7:55 PM\n" +
                "Is it the same thing again?\n" +
                "\n" +
                "Máté Tóth  7:56 PM\n" +
                "yes\n" +
                "7:56\n" +
                "almost done\n" +
                "\n" +
                "Martin Kaduc  7:56 PM\n" +
                "Ok\n" +
                "\n" +
                "Martin Kaduc  8:03 PM\n" +
                "Failed again\n" +
                "\n"


    val conversation = parseSlackConversation(rawConversation)

    conversation.forEach { message ->  message.text.forEach {   println(it) } }

    println("Done")
}