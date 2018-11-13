package org.spring.springboot.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class CommonRsp 
{
	private int retCode;
	
	private String retDesc;
	
	private String time;

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

	public void setTime() {
		this.time = getNow();
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
		return "CommonRsp [retCode=" + retCode + ", retDesc=" + retDesc + ", time=" + time + "]";
	}

	private String getNow() 
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(new Date());
	}
	
}
