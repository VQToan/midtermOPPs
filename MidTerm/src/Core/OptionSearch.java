package Core;


public class OptionSearch {
	//==========TIM THEO  THONG TIN KHAC HANG==================================//
	public Customer[] Search(Customer[] dataCustomers, String key, String method) {
		Customer[] listEndSearchCustomers = null;
		int i=0;
		for (Customer customer : dataCustomers) {
			if(verifyMethod(customer, method).contains(key)) {
				listEndSearchCustomers[i]= customer;
				i+=1;
			}
		}
		return listEndSearchCustomers;
	}
	public String verifyMethod(Customer data, String method) {
		String end = null;
		
		if (method=="no")  end=data.getNo();
		if (method=="firtName")  end=data.getFirstName();
		if (method=="fullName")  end=data.getFullName();
		if (method=="iD")  end=data.getiD();
		if (method=="address") end=data.getAddress().toString();
		if (method=="iDRoom") end=data.getiDRoom();
		if (method=="time") end=data.getInOut().toString();
		return end;
	}
	//=======================================================================//
	//====================TIM THEO THONG TIN PHONG==========================//
	public Room[] Search(Room[] dataRooms,String key, String method) {
		Room[] listEndSearchRooms = null;
		int i=0;
		for (Room room : dataRooms) {
			if(method=="iDsRoom" && verifyMethod(room, method).contains(key)) {
				listEndSearchRooms[i] = room;
				i+=1;
			}
			if(key==verifyMethod(room, method)) {
				listEndSearchRooms[i] = room;
				i+=1;
			}
		}
		return listEndSearchRooms;
		
	}
	public String verifyMethod(Room data, String method) {
		String end=null;
		if (method== "iDsRoom") end=data.getiDsRoom();
		if (method== "status") end=(data.getStatus()?"yes":"no");
		if (method== "beds") end=String.valueOf(data.getbeds());
		if(method== "kitchen") end=(data.getKitchen()?"yes":"no");
		if(method== "typeRoom") end=data.getTypeRoom();
		if (method=="price") end=String.valueOf(data.getPrice());
		return end;
	}
	//======================================================================================//
	//==============Tim tat ca cac doi tuong co tu khoa======================================//
	public AllObject[] Search(Customer[] dataCustomers, Room[] dataRooms, String key) {
		AllObject[] dataAllObjects = null;
		int i=0;
		for (Customer customer : dataCustomers) {
			if(customer.toString().contains(key)) {
				dataAllObjects[i].setCustomer(customer);
				i+=1;
			}
		for (Room room : dataRooms) {
			if(room.toString().contains(key)) {
				dataAllObjects[i].setRoom(room);
				}
			}
		}
		return dataAllObjects;
		
	}
}
