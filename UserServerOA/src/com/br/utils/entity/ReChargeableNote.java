package com.br.utils.entity;

import java.io.Serializable;

/**
 * 充值记录
 * @author asus
 *
 */
public class ReChargeableNote implements Serializable{
	private int rechaId;//充值记录编号
	private int rechId;//卡号
	private double noteMoney;//充值金额
	private int handId;//操作人
	private String rDate;//充值时间
	private String rechDesc;//备注
	
	public int getRechaId() {
		return rechaId;
	}
	public void setRechaId(int rechaId) {
		this.rechaId = rechaId;
	}
	public int getRechId() {
		return rechId;
	}
	public void setRechId(int rechId) {
		this.rechId = rechId;
	}
	public double getNoteMoney() {
		return noteMoney;
	}
	public void setNoteMoney(double noteMoney) {
		this.noteMoney = noteMoney;
	}
	public int getHandId() {
		return handId;
	}
	public void setHandId(int handId) {
		this.handId = handId;
	}
	public String getrDate() {
		return rDate;
	}
	public void setrDate(String rDate) {
		this.rDate = rDate;
	}
	public String getRechDesc() {
		return rechDesc;
	}
	public void setRechDesc(String rechDesc) {
		this.rechDesc = rechDesc;
	}
	
	public ReChargeableNote(int rechaId, int rechId, double noteMoney,
			int handId, String rDate, String rechDesc) {
		this.rechaId = rechaId;
		this.rechId = rechId;
		this.noteMoney = noteMoney;
		this.handId = handId;
		this.rDate = rDate;
		this.rechDesc = rechDesc;
	}
	
	public ReChargeableNote() {
	}
	
}
