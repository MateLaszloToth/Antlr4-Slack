grammar Slack;

@header {
package com.kambr.parser.slack.generated;
}

conversation: message+ ;

message: sender     time NL  text; // spacing between rules don't matter

sender: WORD (' ' WORD '  ')+ ;

text: ((time NL) | sentence)+ NL;

sentence: ( WORD | ' ' | emoji |  time)+ NL;

emoji: ':' ((WORD ':') | ')') ;

time: CLOCK (' ' amORpm)?;

amORpm: WORD;

CLOCK: DIGIT+ ':' DIGIT+;

WORD: ~[ \t\n:]+;

fragment DIGIT: [0-9]; // can be used in lexer rules only

WHITE_SPACE: [\t] -> skip;

NL: '\n' ;