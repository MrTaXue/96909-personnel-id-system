package com.br.utils.entity;

import java.io.Serializable;

/**
 * 短消息发送情况实体对象类
 * @author asus
 *
 */
public class SendMsg implements Serializable{
	private int sendMId;//编号
	private int mId;//消息编号
	private int msgFrom;//发送者
	private int msgTo;//接受者
	private int mStatus;//状态0未读1已读
	
	public int getSendMId() {
		return sendMId;
	}
	public void setSendMId(int sendMId) {
		this.sendMId = sendMId;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public int getMsgFrom() {
		return msgFrom;
	}
	public void setMsgFrom(int msgFrom) {
		this.msgFrom = msgFrom;
	}
	public int getMsgTo() {
		return msgTo;
	}
	public void setMsgTo(int msgTo) {
		this.msgTo = msgTo;
	}
	public int getmStatus() {
		return mStatus;
	}
	public void setmStatus(int mStatus) {
		this.mStatus = mStatus;
	}
	
	public SendMsg(int sendMId, int mId, int msgFrom, int msgTo, int mStatus) {
		this.sendMId = sendMId;
		this.mId = mId;
		this.msgFrom = msgFrom;
		this.msgTo = msgTo;
		this.mStatus = mStatus;
	}
	
	public SendMsg() {
	}
}
