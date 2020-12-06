package Core;

import java.util.Scanner;
// ===========================Luoi qua chua lam xong===============================================//
public class TabInput {
	Scanner input = new Scanner(System.in);
	public Customer inPut() {
		Scanner input = new Scanner(System.in);
		Customer data = null;
		System.out.println("1.nhap ten:");
		data.setFirstName(input.nextLine());
		System.out.println("2.nhap ho ten:");
		data.setFullName(input.nextLine());
		System.out.println("3.nhap so cmnd:");
		data.setiD(input.nextLine());
		System.out.println("4.Nhap dia chi:");
		data.setAddress(inputAddress());
		System.out.println("5. Nhap so phong:");
		data.setiDRoom(input.nextLine());
		return data;
		
	}
	public Address inputAddress() {
		Address address = null;
		System.out.println("4.1 Nhap so nha:");
		address.setNumber(input.nextInt());
		System.out.println("4.2 Nhap ten duong:");
		address.setStreet(input.nextLine());
		System.out.println("4.3 Nhap ten phuong:");
		address.setWard(input.nextLine());
		System.out.println("4.4 Nhap ten quan: ");
		address.setDistrict(input.nextLine());
		System.out.println("4.5 Nhap ten thanh pho: ");
		address.setCity(input.nextLine());
		System.out.println("4.4 Nhap ten quoc gia: ");
		address.setCountry(input.nextLine());
		return address;
	}
}
