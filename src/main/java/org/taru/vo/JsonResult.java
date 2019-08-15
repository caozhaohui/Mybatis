package org.taru.vo;

import java.io.Serializable;

public class JsonResult implements Serializable {
	private String status;
	private String message;
	private Object data;
	
	public String getStatus() {
		return status;
	}
	public String getMsg() {
		return message;
	}
	public Object getData() {
		return data;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setMsg(String msg) {
		this.message = msg;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public JsonResult(String status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}


	

}
