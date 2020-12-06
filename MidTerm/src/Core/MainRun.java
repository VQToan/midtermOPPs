package Core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class MainRun {
	public static void main(String[] args) throws IOException{
		ArrayList<Customer> a=new ArrayList<Customer>();
		ArrayList<Room> b = new ArrayList<Room>();
		a.add(new Customer("01", "Toan", "Vo Quoc Toan", "158485345",new Address(319,"Le Trong Tan","Son Ky","Tan Phu","TPHCM","Viet Nam"),"12213a",new InfoTime("10:00","20/5/2020","20:00","15/6/2020")));
		b.add(new Room("54456",true,2,true,"normal", 50000));
		Customer a2= a.get(0);
		Room b2=b.get(0);
		System.out.println(a2.toString()+ "\n" +b2.toString());
		
		
		try {
            FileOutputStream f = new FileOutputStream("D:\\sinhvien.dat");
            ObjectOutputStream oOT = new ObjectOutputStream(f); // Sử dụng để ghi file theo từng Object
            oOT.writeObject(a2); // Ghi  Object là đối tượng a xuống file
            //oOT.writeObject(b2); //
            oOT.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra!");
        }
		Customer a1=  new Customer();
		Room b1= new Room();
        try {
            FileInputStream f = new FileInputStream("D:\\sinhvien.dat");
            ObjectInputStream oIT = new ObjectInputStream(f); // Sử dụng để đọc file theo từng Object
            a1 = (Customer) oIT.readObject(); //Đọc Object đầu tiên ép kiểu về kiểu SinhVien sau đó gán bằng đối tượng a1
           // b1 = (Room) oIT.readObject(); //Đọc Object tiếp theo, ép kiểu về kiểu SinhVien sau đó gán bằng đối tượng b1
            oIT.close();
            f.close();
        } catch (IOException io) {
            System.out.println("Có lỗi xảy ra!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy class");
        }
 
        System.out.println("Thông tin sinh vien a1 đọc ra là:" + a1.toString());
        System.out.println("Thông tin sinh vien b1 đọc ra là:" + b1.toString());
   
//		Scanner input = new Scanner(System.in);
//		boolean cont = true;
//		do {
//			System.out.println("=============================================================================");
//			System.out.println("== 1. input                                                                ==");
//			System.out.println("Chọn chức năng : [1- 4]");
//			int chon = input.nextInt();
//			switch (chon) {
//			case 1:
//				System.out.println("Thực hiện chức năng 1");
//				
//				break;
//			case 2:
//				System.out.println("Thực hiện chức năng 2");
//				break;
//			case 3:
//				System.out.println("Thực hiện chức năng 3");
//				break;
//			default:
//				System.out.println("Tạm biệt");
//				cont = false;
//				break;
//			}
//		} while (cont);
	}
}
