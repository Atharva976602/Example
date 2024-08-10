package com.tka.model;

public class Department {

	private int id;
	private String name;
	private String createdDate;
	private int strenth;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name, String createdDate, int strenth) {
		super();
		this.id = id;
		this.name = name;
		this.createdDate = createdDate;
		this.strenth = strenth;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", strenth=" + strenth + ", createdDate=" + createdDate
				+ "]";
	}

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

	public int getStrenth() {
		return strenth;
	}

	public void setStrenth(int strenth) {
		this.strenth = strenth;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

}
