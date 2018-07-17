package org.spring.springboot.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class QueryCommonRsp<T> extends CommonRsp 
{
	private List<T> list = new ArrayList<T>();
	
	private int totcalCount = 0;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotcalCount() {
		return totcalCount;
	}

	public void setTotcalCount(int totcalCount) {
		this.totcalCount = totcalCount;
	}

	public QueryCommonRsp(List<T> list, int totcalCount) {
		super();
		this.list = list;
		this.totcalCount = totcalCount;
	}

	public QueryCommonRsp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "QueryCommonRsp [list=" + list + ", totcalCount=" + totcalCount + "]";
	}
	
	
}
