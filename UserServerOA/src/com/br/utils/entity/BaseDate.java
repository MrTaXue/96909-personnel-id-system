package com.br.utils.entity;

import java.io.Serializable;

/**
 * 基础数据实体对象类
 * @author asus
 *
 */
public class BaseDate implements Serializable {
	private int baseId;//编号
	private String baseName;//名字
	private String baseDesc;//备注
	private int btId;//类别编号
	
	public int getBaseId() {
		return baseId;
	}
	public void setBaseId(int baseId) {
		this.baseId = baseId;
	}
	public String getBaseName() {
		return baseName;
	}
	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}
	public String getBaseDesc() {
		return baseDesc;
	}
	public void setBaseDesc(String baseDesc) {
		this.baseDesc = baseDesc;
	}
	public int getBtId() {
		return btId;
	}
	public void setBtId(int btId) {
		this.btId = btId;
	}
	
	public BaseDate(int baseId, String baseName, String baseDesc, int btId) {
		this.baseId = baseId;
		this.baseName = baseName;
		this.baseDesc = baseDesc;
		this.btId = btId;
	}
	
	public BaseDate() {
	}
	
	
}
