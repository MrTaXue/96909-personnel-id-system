package com.br.utils.entity;

import java.io.Serializable;

/***
 * 岗位培训实体对象类
 * @author asus
 *
 */
public class Cultivate implements Serializable{
	private int cultId;//培训编号
	private int workerId;//员工编号
	private String institution;//培训机构
	private String content;//培训内容
	private String ccircs;//培训情况
	private String cultDate;//培训时间
	
	public int getCultId() {
		return cultId;
	}
	public void setCultId(int cultId) {
		this.cultId = cultId;
	}
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCcircs() {
		return ccircs;
	}
	public void setCcircs(String ccircs) {
		this.ccircs = ccircs;
	}
	public String getCultDate() {
		return cultDate;
	}
	public void setCultDate(String cultDate) {
		this.cultDate = cultDate;
	}
	
	public Cultivate(int cultId, int workerId, String institution,
			String content, String ccircs, String cultDate) {
		this.cultId = cultId;
		this.workerId = workerId;
		this.institution = institution;
		this.content = content;
		this.ccircs = ccircs;
		this.cultDate = cultDate;
	}
	
	public Cultivate() {
	}
	
	
}
