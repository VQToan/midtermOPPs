package Core;

import java.io.Serializable;

public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int number;
	private String street;
	private String ward;
	private String district;
	private String city;
	private String country;
	public Address() {
		super();
	}
	public Address(int number, String street, String ward, String district, String city, String country) {
		super();
		this.number = number;
		this.street = street;
		this.ward = ward;
		this.district = district;
		this.city = city;
		this.country = country;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [number=" + number + ", street=" + street + ", ward=" + ward + ", district=" + district
				+ ", city=" + city + ", country=" + country + "]";
	}
	
}
