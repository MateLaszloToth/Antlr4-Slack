package com.kambr.parser.oney.json.dataClasses.legData

import com.kambr.parser.oney.json.ExtensionFunctions.toInteger

class CabinDetails(cabinObject: HashMap<String, Any>) {
    var cabinCode: String = cabinObject["cabinCode"] as String
    var cabinSaleableCapacity: Int = cabinObject["cabinSaleableCapacity"]!!.toInteger()
    var cabinAuthorizedCapacity: Int = cabinObject["cabinAuthorizedCapacity"]!!.toInteger()
    var cabinBlock: Int = cabinObject["cabinBlock"]!!.toInteger()
    var blockSpaceDetails: MutableList<BlockSpaceDetails> = mutableListOf()

    init {
        (cabinObject["blockSpaceDetails"] as List<*>).forEach { item ->
            if (item != null) {
                blockSpaceDetails.add(BlockSpaceDetails(item as HashMap<String, Int>))
            }
        }
    }
}