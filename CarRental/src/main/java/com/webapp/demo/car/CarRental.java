package com.webapp.demo.car;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CarRental {
	
	@Id
	private String Id;
	private String Model;
	private String No;
	private String status;
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id =Id;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String Model) {
		this.Model = Model;
	}
	public String getNo() {
		return No;
	}
	public void setNo(String No) {
		this.No = No;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}