// Generated from Slack.g4 by ANTLR 4.9.1

package com.kambr.parser.slack.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlackParser}.
 */
public interface SlackListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlackParser#conversation}.
	 * @param ctx the parse tree
	 */
	void enterConversation(SlackParser.ConversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlackParser#conversation}.
	 * @param ctx the parse tree
	 */
	void exitConversation(SlackParser.ConversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlackParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(SlackParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlackParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(SlackParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlackParser#sender}.
	 * @param ctx the parse tree
	 */
	void enterSender(SlackParser.SenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlackParser#sender}.
	 * @param ctx the parse tree
	 */
	void exitSender(SlackParser.SenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlackParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(SlackParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlackParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(SlackParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlackParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SlackParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlackParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SlackParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlackParser#emoji}.
	 * @param ctx the parse tree
	 */
	void enterEmoji(SlackParser.EmojiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlackParser#emoji}.
	 * @param ctx the parse tree
	 */
	void exitEmoji(SlackParser.EmojiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlackParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(SlackParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlackParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(SlackParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlackParser#amORpm}.
	 * @param ctx the parse tree
	 */
	void enterAmORpm(SlackParser.AmORpmContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlackParser#amORpm}.
	 * @param ctx the parse tree
	 */
	void exitAmORpm(SlackParser.AmORpmContext ctx);
}