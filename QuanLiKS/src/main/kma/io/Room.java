package main.kma.io;

import java.io.Serializable;

public class Room implements Serializable{
	private String id;
	private String typeRoom;
	private String status;
	private double price;
	private int bed;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTypeRoom() {
		return typeRoom;
	}
	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBed() {
		return bed;
	}
	public void setBed(int bed) {
		this.bed = bed;
	}
	public Room(String id, String typeRoom, String status, double price, int bed) {
		super();
		this.id = id;
		this.typeRoom = typeRoom;
		this.status = status;
		this.price = price;
		this.bed = bed;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", typeRoom=" + typeRoom + ", status=" + status + ", price=" + price + ", bed=" + bed
				+ "]";
	}
	
}
