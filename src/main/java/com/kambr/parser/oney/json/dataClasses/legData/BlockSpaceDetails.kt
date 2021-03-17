package com.kambr.parser.oney.json.dataClasses.legData

import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CODE_SHARE_BLOCK
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.PROTECTED_SEATS

class BlockSpaceDetails {
    val codeShareBlock: Int
    val protectedSeats: Int

    constructor(blockSpaceDetailsObject: HashMap<String, String>) {
        codeShareBlock = blockSpaceDetailsObject[CODE_SHARE_BLOCK.value]!!.toInt()
        protectedSeats = blockSpaceDetailsObject[PROTECTED_SEATS.value]!!.toInt()
    }

    constructor(
        codeShareBlock: Int,
        protectedSeats: Int
    ) {
        this.codeShareBlock = codeShareBlock
        this.protectedSeats = protectedSeats
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BlockSpaceDetails

        if (codeShareBlock != other.codeShareBlock) return false
        if (protectedSeats != other.protectedSeats) return false

        return true
    }

    override fun hashCode(): Int {
        var result = codeShareBlock
        result = 31 * result + protectedSeats
        return result
    }

    override fun toString(): String {
        return "BlockSpaceDetails(codeShareBlock=$codeShareBlock, protectedSeats=$protectedSeats)"
    }
}
