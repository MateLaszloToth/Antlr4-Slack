package com.kambr.parser.oney.json.dataClasses.legData

import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CODE_SHARE_BLOCK
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.PROTECTED_SEATS

class BlockSpaceDetails(blockSpaceDetailsObject: HashMap<String, Int>) {
    var codeShareBlock: Int = blockSpaceDetailsObject[CODE_SHARE_BLOCK.value]!!
    var protectedSeats: Int = blockSpaceDetailsObject[PROTECTED_SEATS.value]!!
}
