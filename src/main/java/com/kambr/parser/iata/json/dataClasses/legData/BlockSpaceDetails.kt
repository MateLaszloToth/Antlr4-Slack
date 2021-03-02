package com.kambr.parser.iata.json.dataClasses.legData

import com.kambr.parser.iata.json.dataClasses.legData.FieldNames.CODE_SHARE_BLOCK
import com.kambr.parser.iata.json.dataClasses.legData.FieldNames.PROTECTED_SEATS

class BlockSpaceDetails(blockSpaceDetailsObject: HashMap<String, String>) {
    var codeShareBlock: Int = blockSpaceDetailsObject[CODE_SHARE_BLOCK.value]!!.toInt()
    var protectedSeats: Int = blockSpaceDetailsObject[PROTECTED_SEATS.value]!!.toInt()
}
