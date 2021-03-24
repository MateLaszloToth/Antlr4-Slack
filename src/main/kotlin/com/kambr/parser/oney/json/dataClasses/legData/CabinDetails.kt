package com.kambr.parser.oney.json.dataClasses.legData

import com.kambr.parser.oney.json.ExtensionFunctions.toInteger
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.BLOCK_SPACE_DETAILS
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CABIN_CAPACITY
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CABIN_BLOCK
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CABIN_CODE
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CABIN_AUTHORIZED_CAPACITY

@Suppress("UNCHECKED_CAST")
class CabinDetails {
    val cabinCode: String
    val cabinAuthorizedCapacity: Int
    val cabinCapacity: Int
    val cabinBlock: Int
    val blockSpaceDetails: List<BlockSpaceDetails>

    constructor(
        cabinObject: HashMap<String, Any>
    ) {
        cabinCode = cabinObject[CABIN_CODE.value] as String
        cabinAuthorizedCapacity = cabinObject[CABIN_AUTHORIZED_CAPACITY.value]!!.toInteger()
        cabinCapacity = cabinObject[CABIN_CAPACITY.value]!!.toInteger()
        cabinBlock = cabinObject[CABIN_BLOCK.value]!!.toInteger()

        val tempBlockSpaceDetails = mutableListOf<BlockSpaceDetails>()
        (cabinObject[BLOCK_SPACE_DETAILS.value] as List<*>).forEach { item ->
            if (item != null) {
                tempBlockSpaceDetails.add(BlockSpaceDetails(item as HashMap<String, String>))
            }
        }
        blockSpaceDetails = tempBlockSpaceDetails
    }

    constructor(
        cabinCode: String,
        cabinSaleableCapacity: Int,
        cabinAuthorizedCapacity: Int,
        cabinBlock: Int,
        blockSpaceDetails: List<BlockSpaceDetails>
    ) {
        this.cabinCode = cabinCode
        this.cabinAuthorizedCapacity = cabinSaleableCapacity
        this.cabinCapacity = cabinAuthorizedCapacity
        this.cabinBlock = cabinBlock
        this.blockSpaceDetails = blockSpaceDetails
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CabinDetails

        if (cabinCode != other.cabinCode) return false
        if (cabinAuthorizedCapacity != other.cabinAuthorizedCapacity) return false
        if (cabinCapacity != other.cabinCapacity) return false
        if (cabinBlock != other.cabinBlock) return false
        if (blockSpaceDetails != other.blockSpaceDetails) return false

        return true
    }

    override fun hashCode(): Int {
        var result = cabinCode.hashCode()
        result = 31 * result + cabinAuthorizedCapacity
        result = 31 * result + cabinCapacity
        result = 31 * result + cabinBlock
        result = 31 * result + blockSpaceDetails.hashCode()
        return result
    }

    override fun toString(): String {
        return "CabinDetails(cabinCode='$cabinCode', cabinSaleableCapacity=$cabinAuthorizedCapacity, cabinAuthorizedCapacity=$cabinCapacity, cabinBlock=$cabinBlock, blockSpaceDetails=$blockSpaceDetails)"
    }
}