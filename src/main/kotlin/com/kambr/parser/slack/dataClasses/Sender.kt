package com.kambr.parser.slack.dataClasses

class Sender(fullName: List<String>) {
    val firstName: String
    val lastName: String

    init {
        if(fullName.size  == 2) {
            firstName = fullName[0]
            lastName = fullName[1]
        } else{
            throw IllegalStateException("I expect firstName and lastName, but received: $fullName")
        }
    }
}
