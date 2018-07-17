package org.spring.springboot.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class CommonRsp 
{
	private int retCode;
	
	private String retDesc;

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}

	public String getRetDesc() {
		return retDesc;
	}

	public void setRetDesc(String retDesc) {
		this.retDesc = retDesc;
	}

	public CommonRsp(int retCode, String retDesc) {
		super();
		this.retCode = retCode;
		this.retDesc = retDesc;
	}

	public CommonRsp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CommRsp [retCode=" + retCode + ", retDesc=" + retDesc + "]";
	}
	
	
}
