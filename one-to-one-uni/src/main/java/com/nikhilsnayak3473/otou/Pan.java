package com.nikhilsnayak3473.otou;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pan {
	@Id
	private int panId;
	private String panNumber;
	private String address;

	public int getPanId() {
		return panId;
	}

	public void setPanId(int panId) {
		this.panId = panId;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Pan [panId=" + panId + ", panNumber=" + panNumber + ", address=" + address + "]";
	}
	

}
