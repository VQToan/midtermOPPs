package main.kma.io;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
	private String fullName;
	private String idCus;
	private int identification;
	private int phone;
	private Date dateStart;
	private Date dateEnd;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getIdCus() {
		return idCus;
	}
	public void setIdCus(String idCus) {
		this.idCus = idCus;
	}
	public int getIdentification() {
		return identification;
	}
	public void setIdentification(int identification) {
		this.identification = identification;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	public Customer(String fullName, String idCus, int identification, int phone, Date dateStart, Date dateEnd) {
		super();
		this.fullName = fullName;
		this.idCus = idCus;
		this.identification = identification;
		this.phone = phone;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}
	
}
