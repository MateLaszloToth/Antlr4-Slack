grammar Slack;

@header{
package com.kambr.parser.slack.generated;
}

conversation: message+;

message: sender time NL text;

sender: WORD (' ' WORD  ' ')+  ' ';

time: CLOCK (' '  amORpm)?;

text: ((time NL) | sentence)+ NL;

sentence: ( WORD | ' ' | emoji | time)+ NL;

amORpm: WORD;

emoji: ':' ((WORD ':') | ')');

CLOCK: DIGIT+ ':' DIGIT+;

fragment DIGIT: [0-9];

WORD: ~[ \t\n:]+;

W_S: [\t] -> skip;

NL: '\n' ;