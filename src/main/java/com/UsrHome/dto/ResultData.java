package com.UsrHome.dto;

import java.util.Map;

import com.UsrHome.util.Util;

import lombok.Data;

@Data
public class ResultData {
	private String resultCode;
	private String msg;
	private Map<String, Object> body;
	
	public ResultData(String resultCode, String msg, Object...ages) {
		super();
		this.resultCode = resultCode;
		this.msg = msg;
		this.body = Util.mapOf(ages);
	}
	
	public boolean isSuccess() {
		return resultCode.startsWith("S-");
	}
	
	public boolean isFail() {
		return isSuccess() == false;
	}
	
}
