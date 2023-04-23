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
	 * Enter a parse tree produced by {@link Sql92DDLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(Sql92DDLParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(Sql92DDLParser.Create_tableContext ctx);
}