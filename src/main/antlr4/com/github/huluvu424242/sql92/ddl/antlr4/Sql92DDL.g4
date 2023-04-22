/**
* Quelle: https://www.dbs.ethz.ch/education/infosys/syntax_diagramme/sld001.html
*/

//@header {
//    package com.github.huluvu424242.sql92.ddl.antlr4;
//}

grammar Sql92DDL;


// Parser


ddlScript
    :   (createTable)+
    ;

createTable
    :  createTableKeywords Identifier '('createTableDefinition ')'
    ;

createTableDefinition
    : tableElement ( ',' tableElement )*
    ;

createTableKeywords
    :   CreateTableKey
    ;
tableElement
    :   columnElement | tableConstraint
    ;

columnElement
    : Identifier //columnType
    ;

tableConstraint
    : 'todo table constraint'
    ;


// Lexer

CreateTableKey
    : CREATE TABLE
    ;

Identifier
	:	LETTER+
	;

fragment LETTER: [a-zA-Z0-9$_];
CREATE: 'create';
TABLE:  'table';



WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;