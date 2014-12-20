package com.br.utils.entity;

import java.io.Serializable;

/**
 * 账号表实体对象类
 * @author
 *
 */
public class Accounts implements Serializable {
	private int accountId;//账号
	private String accName;//用户名
	private String fName;//姓名
	private String aEmail;//邮箱
	private String accPwd;//密码
	private String accState;//是否可用0不可用1可用
	private String companyGrand;//公司级别1总公司2分公司
	private int companyId;//账号所属公司
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getAccPwd() {
		return accPwd;
	}
	public void setAccPwd(String accPwd) {
		this.accPwd = accPwd;
	}
	public String getAccState() {
		return accState;
	}
	public void setAccState(String accState) {
		this.accState = accState;
	}
	public String getCompanyGrand() {
		return companyGrand;
	}
	public void setCompanyGrand(String companyGrand) {
		this.companyGrand = companyGrand;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public Accounts() {
	}
	
	public Accounts(int accountId, String accName, String fName, String aEmail,
			String accPwd, String accState, String companyGrand, int companyId) {
		this.accountId = accountId;
		this.accName = accName;
		this.fName = fName;
		this.aEmail = aEmail;
		this.accPwd = accPwd;
		this.accState = accState;
		this.companyGrand = companyGrand;
		this.companyId = companyId;
	}
	
	
}
