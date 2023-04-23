// Generated from com\github\huluvu424242\sql92\ddl\antlr4\Sql92DDL.g4 by ANTLR 4.7.1
package com.github.huluvu424242.sql92.ddl.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Sql92DDLParser}.
 */
public interface Sql92DDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(Sql92DDLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(Sql92DDLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(Sql92DDLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(Sql92DDLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#ddl_statements}.
	 * @param ctx the parse tree
	 */
	void enterDdl_statements(Sql92DDLParser.Ddl_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#ddl_statements}.
	 * @param ctx the parse tree
	 */
	void exitDdl_statements(Sql92DDLParser.Ddl_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#ddl_statement}.
	 * @param ctx the parse tree
	 */
	void enterDdl_statement(Sql92DDLParser.Ddl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#ddl_statement}.
	 * @param ctx the parse tree
	 */
	void exitDdl_statement(Sql92DDLParser.Ddl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(Sql92DDLParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(Sql92DDLParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(Sql92DDLParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(Sql92DDLParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(Sql92DDLParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(Sql92DDLParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#column_element}.
	 * @param ctx the parse tree
	 */
	void enterColumn_element(Sql92DDLParser.Column_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#column_element}.
	 * @param ctx the parse tree
	 */
	void exitColumn_element(Sql92DDLParser.Column_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#column_datatype}.
	 * @param ctx the parse tree
	 */
	void enterColumn_datatype(Sql92DDLParser.Column_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#column_datatype}.
	 * @param ctx the parse tree
	 */
	void exitColumn_datatype(Sql92DDLParser.Column_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(Sql92DDLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(Sql92DDLParser.Column_constraintContext ctx);
}