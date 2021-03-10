package com.kambr.parser.oney.json.dataClasses.legData

import com.kambr.parser.oney.json.ExtensionFunctions.toInteger
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.BLOCK_SPACE_DETAILS
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CABIN_AUTHORIZED_CAPACITY
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CABIN_BLOCK
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CABIN_CODE
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CABIN_SALEABLE_CAPACITY

@Suppress("UNCHECKED_CAST")
class CabinDetails(cabinObject: HashMap<String, Any>) {
    var cabinCode: String = cabinObject[CABIN_CODE.value] as String
    var cabinSaleableCapacity: Int = cabinObject[CABIN_SALEABLE_CAPACITY.value]!!.toInteger()
    var cabinAuthorizedCapacity: Int = cabinObject[CABIN_AUTHORIZED_CAPACITY.value]!!.toInteger()
    var cabinBlock: Int = cabinObject[CABIN_BLOCK.value]!!.toInteger()
    var blockSpaceDetails: MutableList<BlockSpaceDetails> = mutableListOf()

    init {
        (cabinObject[BLOCK_SPACE_DETAILS.value] as List<*>).forEach { item ->
            if (item != null) {
                blockSpaceDetails.add(BlockSpaceDetails(item as HashMap<String, String>))
            }
        }
    }
}