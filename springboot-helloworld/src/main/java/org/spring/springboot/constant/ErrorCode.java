package org.spring.springboot.constant;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class ErrorCode 
{
	public static final int REQ_NULL_CODE = 60321201;
	
	public static final String REQ_NULL_DESC = "req is null";
}
