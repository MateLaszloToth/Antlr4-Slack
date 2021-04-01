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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Sender

        if (firstName != other.firstName) return false
        if (lastName != other.lastName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }

    override fun toString(): String {
        return "\nSender(firstName='$firstName', lastName='$lastName')"
    }


}
