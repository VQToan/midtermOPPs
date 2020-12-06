package Core;

import java.io.Serializable;

public class Room implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String iDsRoom;
	private Boolean status;
	private int beds; // sá»‘ giÆ°á»�ng (1- Ä‘Æ¡n , 2- Ä‘Ã´i, 11- 2 láº»)
	private Boolean kitchen;
	private String typeRoom; // (option : N - normal, V - vip)
	private int price;
	public Room() {
		super();
	}
	public Room(String iDsRoom, Boolean status, int beds, Boolean kitchen, String typeRoom, int price) {
		super();
		this.iDsRoom = iDsRoom;
		this.status = status;
		this.beds = beds;
		this.kitchen = kitchen;
		this.typeRoom = typeRoom;
		this.price = price;
	}
	public String getiDsRoom() {
		return iDsRoom;
	}
	public void setiDsRoom(String iDsRoom) {
		this.iDsRoom = iDsRoom;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public int getbeds() {
		return beds;
	}
	public void setbeds(int beds) {
		this.beds = beds;
	}
	public Boolean getKitchen() {
		return kitchen;
	}
	public void setKitchen(Boolean kitchen) {
		this.kitchen = kitchen;
	}
	public String getTypeRoom() {
		return typeRoom;
	}
	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Room [iDsRoom=" + iDsRoom + ", status=" + status + ", beds=" + beds + ", kitchen="
				+ kitchen + ", typeRoom=" + typeRoom + ", price=" + price + "]";
	}
	
}
