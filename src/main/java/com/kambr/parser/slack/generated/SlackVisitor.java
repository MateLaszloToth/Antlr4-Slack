// Generated from Slack.g4 by ANTLR 4.9.1

package com.kambr.parser.slack.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SlackParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SlackVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SlackParser#conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversation(SlackParser.ConversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlackParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(SlackParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlackParser#sender}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSender(SlackParser.SenderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlackParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(SlackParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlackParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(SlackParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlackParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SlackParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlackParser#amORpm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmORpm(SlackParser.AmORpmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlackParser#emoji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmoji(SlackParser.EmojiContext ctx);
}