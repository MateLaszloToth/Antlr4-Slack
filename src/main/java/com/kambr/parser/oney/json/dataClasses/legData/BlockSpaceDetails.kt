package com.kambr.parser.oney.json.dataClasses.legData

class BlockSpaceDetails(blockSpaceDetailsObject: HashMap<String, Int>) {
    var codeShareBlock: Int = blockSpaceDetailsObject["codeShareBlock"]!!
    var protectedSeats: Int = blockSpaceDetailsObject["protectedSeats"]!!
}
