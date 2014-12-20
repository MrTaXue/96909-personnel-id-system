package com.br.utils.entity;

import java.io.Serializable;

/**
 * 基础数据类别表实体对象类
 * @author asus
 *
 */
public class BaseType implements Serializable {
	private int btId;//编号
	private String btName;//类别名
	
	public int getBtId() {
		return btId;
	}
	public void setBtId(int btId) {
		this.btId = btId;
	}
	public String getBtName() {
		return btName;
	}
	public void setBtName(String btName) {
		this.btName = btName;
	}
	
	public BaseType(int btId, String btName) {
		this.btId = btId;
		this.btName = btName;
	}
	
	public BaseType() {
	}
	
}
