package com.br.utils.entity;

import java.io.Serializable;

/**
 * 交易实体对象类
 * @author asus
 *
 */
public class Business implements Serializable {
	private int businessId;//交易编号
	private int comId;//公司编号
	private int employerId;//雇主编号
	private int workerId;//员工编号
	private int operatorId;//经办人编号
	private String handlersDate;//登记时间
	private String validityDate;//交易有效期
	private String state;//状态
	private double busSalary;//工资
	private String bustypeBaseid;//雇佣类型
	private double introduce;//介绍费
	private String gDate;//成交日期
	
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public int getComId() {
		return comId;
	}
	public void setComId(int comId) {
		this.comId = comId;
	}
	public int getEmployerId() {
		return employerId;
	}
	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	public String getHandlersDate() {
		return handlersDate;
	}
	public void setHandlersDate(String handlersDate) {
		this.handlersDate = handlersDate;
	}
	public String getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getBusSalary() {
		return busSalary;
	}
	public void setBusSalary(double busSalary) {
		this.busSalary = busSalary;
	}
	public String getBustypeBaseid() {
		return bustypeBaseid;
	}
	public void setBustypeBaseid(String bustypeBaseid) {
		this.bustypeBaseid = bustypeBaseid;
	}
	public double getIntroduce() {
		return introduce;
	}
	public void setIntroduce(double introduce) {
		this.introduce = introduce;
	}
	public String getgDate() {
		return gDate;
	}
	public void setgDate(String gDate) {
		this.gDate = gDate;
	}
	
	public Business(int businessId, int comId, int employerId, int workerId,
			int operatorId, String handlersDate, String validityDate,
			String state, double busSalary, String bustypeBaseid,
			double introduce, String gDate) {
		this.businessId = businessId;
		this.comId = comId;
		this.employerId = employerId;
		this.workerId = workerId;
		this.operatorId = operatorId;
		this.handlersDate = handlersDate;
		this.validityDate = validityDate;
		this.state = state;
		this.busSalary = busSalary;
		this.bustypeBaseid = bustypeBaseid;
		this.introduce = introduce;
		this.gDate = gDate;
	}
	
	public Business() {
	}
	
	
}
