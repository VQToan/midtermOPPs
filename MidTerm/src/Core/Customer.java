package Core;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String no;
	private String firstName;
	private String fullName;
	private String iD;
	private Address address;
	private String iDRoom;
	private InfoTime InOut;
	
	public Customer(String no, String firstName, String fullName, String iD, Address address, String iDRoom,
			InfoTime inOut) {
		super();
		this.no = no;
		this.firstName = firstName;
		this.fullName = fullName;
		this.iD = iD;
		this.address = address;
		this.iDRoom = iDRoom;
		InOut = inOut;
	}
	public Customer() {
		super();
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getiDRoom() {
		return iDRoom;
	}
	public void setiDRoom(String iDRoom) {
		this.iDRoom = iDRoom;
	}
	public InfoTime getInOut() {
		return InOut;
	}
	public void setInOut(InfoTime inOut) {
		InOut = inOut;
	}
	@Override
	public String toString() {
		return "Customer [no=" + no + ", firstName=" + firstName + ", fullName=" + fullName + ", iD=" + iD
				+ ", address=" + address + ", iDRoom=" + iDRoom + ", InOut=" + InOut + "]";
	}
	
}
