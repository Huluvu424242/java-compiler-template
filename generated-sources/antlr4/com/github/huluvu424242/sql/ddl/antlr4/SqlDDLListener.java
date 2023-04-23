// Generated from com\github\huluvu424242\sql\ddl\antlr4\SqlDDL.g4 by ANTLR 4.7.1
package com.github.huluvu424242.sql.ddl.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlDDLParser}.
 */
public interface SqlDDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SqlDDLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SqlDDLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SqlDDLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SqlDDLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#ddl_statements}.
	 * @param ctx the parse tree
	 */
	void enterDdl_statements(SqlDDLParser.Ddl_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#ddl_statements}.
	 * @param ctx the parse tree
	 */
	void exitDdl_statements(SqlDDLParser.Ddl_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#ddl_statement}.
	 * @param ctx the parse tree
	 */
	void enterDdl_statement(SqlDDLParser.Ddl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#ddl_statement}.
	 * @param ctx the parse tree
	 */
	void exitDdl_statement(SqlDDLParser.Ddl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(SqlDDLParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(SqlDDLParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(SqlDDLParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(SqlDDLParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(SqlDDLParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(SqlDDLParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#column_element}.
	 * @param ctx the parse tree
	 */
	void enterColumn_element(SqlDDLParser.Column_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#column_element}.
	 * @param ctx the parse tree
	 */
	void exitColumn_element(SqlDDLParser.Column_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#column_datatype}.
	 * @param ctx the parse tree
	 */
	void enterColumn_datatype(SqlDDLParser.Column_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#column_datatype}.
	 * @param ctx the parse tree
	 */
	void exitColumn_datatype(SqlDDLParser.Column_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlDDLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SqlDDLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlDDLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SqlDDLParser.Column_constraintContext ctx);
}