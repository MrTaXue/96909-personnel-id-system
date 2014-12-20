package com.br.utils.commons;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

public class Json implements Serializable {
	

	private String msg = "";

	private Object obj = null;
	

	

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Json(String msg, Object obj) {
		this.msg = msg;
		this.obj = obj;
	}
	public Json() {
	}
}
