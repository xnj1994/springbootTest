package org.spring.springboot.entity.impl;

public class QueryUserReq 
{
private int id;
	
	private String name;
	
	private String cardId;
	
	private String sex;
	
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public QueryUserReq(int id, String name, String cardId, String sex, String address) {
		super();
		this.id = id;
		this.name = name;
		this.cardId = cardId;
		this.sex = sex;
		this.address = address;
	}

	public QueryUserReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "QueryUserReq [id=" + id + ", name=" + name + ", cardId=" + cardId + ", sex=" + sex + ", address=" + address
				+ "]";
	} 
}
