/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2023 by Huluvu424242
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project      : java-compiler-template; an ANTLR4 grammar for Sql92DDL
 *                https://github.com/huluvu424242/java-compiler-template
 * Developed by : Huluvu424242, huluvu424242@gmail.com
 *
 *
 * Syntax Quelle: https://www.dbs.ethz.ch/education/infosys/syntax_diagramme/sld001.html
 */


grammar Sql92DDL;


// Parser

parse
 : ( ddl_statements | error )* EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

ddl_statements
    : ';'* ddl_statement ( ';'+ ddl_statements )* ';'*
    ;

ddl_statement
    : create_table
    ;

create_table
    :  KW_CREATE KW_TABLE IDENTIFIER '(' create_table_definition ')'
    ;

create_table_definition
    : table_element ( ',' table_element )*
    ;

table_element
    :   column_element //| tableConstraint
    ;

column_element
    : IDENTIFIER column_datatype column_constraint?
    ;

column_datatype
    : IDENTIFIER ( '(' NUMBER ')' )?
    ;

column_constraint
    : KW_NOT? KW_NULL
    ;

//tableConstraint
//    : 'todo table constraint'
//    ;


// Lexer


KW_CREATE   : C R E A T E ;
KW_TABLE    : T A B L E ;
KW_NOT      : N O T ;
KW_NULL     : N U L L ;

NUMBER      : DIGIT+ ;
DIGIT       : [0-9] ;

IDENTIFIER
	: [a-zA-Z0-9$_]+
	;


WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;

UNEXPECTED_CHAR
    : .
    ;

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];