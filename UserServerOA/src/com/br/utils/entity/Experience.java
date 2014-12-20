package com.br.utils.entity;

import java.io.Serializable;

/**
 * 工作经历实体对象类
 * @author asus
 *
 */
public class Experience implements Serializable{
	private int experId;//经历编号
	private int	workerId;//员工编号
	private String unit;//单位
	private String workType;//工种
	private String duty;//职务
	private String workDate;//工作时间
	
	public int getExperId() {
		return experId;
	}
	public void setExperId(int experId) {
		this.experId = experId;
	}
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	
	public Experience(int experId, int workerId, String unit, String workType,
			String duty, String workDate) {
		this.experId = experId;
		this.workerId = workerId;
		this.unit = unit;
		this.workType = workType;
		this.duty = duty;
		this.workDate = workDate;
	}
	
	public Experience() {
	}
	
}
