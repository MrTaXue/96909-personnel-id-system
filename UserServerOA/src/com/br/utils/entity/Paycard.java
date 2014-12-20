package com.br.utils.entity;

import java.io.Serializable;

/**
 * 刷卡记录实体对象类
 * @author asus
 *
 */
public class Paycard implements Serializable{
	private int payId;//刷卡记录编号
	private int companyId;//刷卡公司编号
	private double chargeMoney;//收费金额
	private String payDate;//刷卡时间
	private int chargeGrand;//收费类型
	
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public double getChargeMoney() {
		return chargeMoney;
	}
	public void setChargeMoney(double chargeMoney) {
		this.chargeMoney = chargeMoney;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public int getChargeGrand() {
		return chargeGrand;
	}
	public void setChargeGrand(int chargeGrand) {
		this.chargeGrand = chargeGrand;
	}
	
	public Paycard(int payId, int companyId, double chargeMoney,
			String payDate, int chargeGrand) {
		this.payId = payId;
		this.companyId = companyId;
		this.chargeMoney = chargeMoney;
		this.payDate = payDate;
		this.chargeGrand = chargeGrand;
	}
	
	public Paycard() {
	}
	
	
}
