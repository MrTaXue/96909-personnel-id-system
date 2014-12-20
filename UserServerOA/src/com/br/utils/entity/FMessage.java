package com.br.utils.entity;

import java.io.Serializable;

/**
 * 短消息实体对象类
 * @author asus
 *
 */
public class FMessage implements Serializable{
	private int mid;//消息编号
	private String msgTopic;//消息主题
	private String msgContent;//内容
	private String fDate;//发送时间
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMsgTopic() {
		return msgTopic;
	}
	public void setMsgTopic(String msgTopic) {
		this.msgTopic = msgTopic;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getfDate() {
		return fDate;
	}
	public void setfDate(String fDate) {
		this.fDate = fDate;
	}
	
	public FMessage(int mid, String msgTopic, String msgContent, String fDate) {
		this.mid = mid;
		this.msgTopic = msgTopic;
		this.msgContent = msgContent;
		this.fDate = fDate;
	}
	
	public FMessage() {
	}
	
}
