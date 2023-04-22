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



fragment CREATE: 'CREATE' | 'create';
fragment TABLE: 'TABLE' | 'table';


CreateTableKey
    : CREATE TABLE
    ;

Identifier
	:	[a-zA-Z0-9$_]+
	;
