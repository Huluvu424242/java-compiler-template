// Generated from com\github\huluvu424242\sql\ddl\antlr4\SqlDDL.g4 by ANTLR 4.7.1
package com.github.huluvu424242.sql.ddl.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlDDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlDDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SqlDDLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SqlDDLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#ddl_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_statements(SqlDDLParser.Ddl_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#ddl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_statement(SqlDDLParser.Ddl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(SqlDDLParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(SqlDDLParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element(SqlDDLParser.Table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#column_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_element(SqlDDLParser.Column_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#column_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_datatype(SqlDDLParser.Column_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlDDLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SqlDDLParser.Column_constraintContext ctx);
}