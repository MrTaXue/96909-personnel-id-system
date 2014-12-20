package com.br.utils.entity;

import java.io.Serializable;

/**
 * 家庭成员实体类
 * @author asus
 *
 */
public class Family implements Serializable{
	private int fId;//成员编号
	private int workerId;//员工编号
	private String relation;//关系
	private String fName;//成员姓名
	private int age;//年龄
	private String phone;//电话
	private String workerunit;//工作单位
	
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWorkerunit() {
		return workerunit;
	}
	public void setWorkerunit(String workerunit) {
		this.workerunit = workerunit;
	}
	
	public Family(int fId, int workerId, String relation, String fName,
			int age, String phone, String workerunit) {
		this.fId = fId;
		this.workerId = workerId;
		this.relation = relation;
		this.fName = fName;
		this.age = age;
		this.phone = phone;
		this.workerunit = workerunit;
	}
	
	public Family() {
	}
	
	
}
