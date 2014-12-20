package com.br.utils.entity;

import java.io.Serializable;

/**
 * 通知实体对象类
 * @author asus
 *
 */
public class Notice implements Serializable{
	private int noticeId;//通知编号
	private String noticeContent;//通知内容
	private String noticeTime;//通知日期
	
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getNoticeTime() {
		return noticeTime;
	}
	public void setNoticeTime(String noticeTime) {
		this.noticeTime = noticeTime;
	}
	
	public Notice(int noticeId, String noticeContent, String noticeTime) {
		this.noticeId = noticeId;
		this.noticeContent = noticeContent;
		this.noticeTime = noticeTime;
	}
	public Notice() {
	}
	
	
}
