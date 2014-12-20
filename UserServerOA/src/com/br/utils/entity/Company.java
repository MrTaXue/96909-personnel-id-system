package com.br.utils.entity;

import java.io.Serializable;

/**
 * 公司实体对象类
 * @author asus
 *
 */
public class Company implements Serializable{
	private int comid;//公司编号
	private String companynum;//公司账号
	private String cname;//公司名称
	private String cdesc;//说明
	
	public int getComid() {
		return comid;
	}
	public void setComid(int comid) {
		this.comid = comid;
	}
	public String getCompanynum() {
		return companynum;
	}
	public void setCompanynum(String companynum) {
		this.companynum = companynum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdesc() {
		return cdesc;
	}
	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	
	public Company(int comid, String companynum, String cname, String cdesc) {
		this.comid = comid;
		this.companynum = companynum;
		this.cname = cname;
		this.cdesc = cdesc;
	}
	
	public Company() {
	}
	
	
}
