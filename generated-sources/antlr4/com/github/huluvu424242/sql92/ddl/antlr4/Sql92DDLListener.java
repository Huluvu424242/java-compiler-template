// Generated from com\github\huluvu424242\sql92\ddl\antlr4\Sql92DDL.g4 by ANTLR 4.7.1
package com.github.huluvu424242.sql92.ddl.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Sql92DDLParser}.
 */
public interface Sql92DDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#ddlScript}.
	 * @param ctx the parse tree
	 */
	void enterDdlScript(Sql92DDLParser.DdlScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#ddlScript}.
	 * @param ctx the parse tree
	 */
	void exitDdlScript(Sql92DDLParser.DdlScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(Sql92DDLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(Sql92DDLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#createTableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableDefinition(Sql92DDLParser.CreateTableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#createTableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableDefinition(Sql92DDLParser.CreateTableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#createTableKeywords}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableKeywords(Sql92DDLParser.CreateTableKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#createTableKeywords}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableKeywords(Sql92DDLParser.CreateTableKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(Sql92DDLParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(Sql92DDLParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#columnElement}.
	 * @param ctx the parse tree
	 */
	void enterColumnElement(Sql92DDLParser.ColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#columnElement}.
	 * @param ctx the parse tree
	 */
	void exitColumnElement(Sql92DDLParser.ColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92DDLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(Sql92DDLParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92DDLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(Sql92DDLParser.TableConstraintContext ctx);
}