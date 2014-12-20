package com.br.utils.entity;

import java.io.Serializable;

/**
 * 充值卡实体对象类
 * @author asus
 *
 */
public class ReChargeableCard implements Serializable{
	private int rechId;//卡号
	private int rcount;//刷卡次数
	private int standard;//收费标准
	private double amount;//消费总额
	private double banlance;//余额
	private int companyId;//充值之公司编号
	
	public int getRechId() {
		return rechId;
	}
	public void setRechId(int rechId) {
		this.rechId = rechId;
	}
	public int getRcount() {
		return rcount;
	}
	public void setRcount(int rcount) {
		this.rcount = rcount;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBanlance() {
		return banlance;
	}
	public void setBanlance(double banlance) {
		this.banlance = banlance;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public ReChargeableCard(int rechId, int rcount, int standard,
			double amount, double banlance, int companyId) {
		this.rechId = rechId;
		this.rcount = rcount;
		this.standard = standard;
		this.amount = amount;
		this.banlance = banlance;
		this.companyId = companyId;
	}
	
	public ReChargeableCard() {
	}
	
	
}
