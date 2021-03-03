grammar CSV;

@header{
package com.kambr.parser.onex.tursys.generated;
}

csvFile: hdr row+ ;

hdr : row ;

row : field ((',' | '|') field)* '\r'? '\n' ;

field: TEXT?;

TEXT : ~[,\n\r"|]+ ;