package testFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SinhVien implements Serializable {
	 
    private String hoTen;
    private int tuoi;
 
    public String getHoTen() {
        return hoTen;
    }
 
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
 
    public int getTuoi() {
        return tuoi;
    }
 
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
 
public class test {
 
    public static void main(String[] args) throws IOException {
        SinhVien a = new SinhVien();
        a.setHoTen("Vũ Văn T");
        a.setTuoi(21);
        SinhVien b = new SinhVien();
        b.setHoTen("Nguyễn Văn A");
        b.setTuoi(22);
 
        try {
            FileOutputStream f = new FileOutputStream("D:\\sinhvien.dat");
            ObjectOutputStream oOT = new ObjectOutputStream(f); // Sử dụng để ghi file theo từng Object
            oOT.writeObject(a); // Ghi  Object là đối tượng a xuống file
            oOT.writeObject(b);
            oOT.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra!");
        }
 
        SinhVien a1 = new SinhVien(); //Tạo đối tượng a1 mới, để phía dưới gán bằng đối tượng ta lấy được ra từ file
        SinhVien b1 = new SinhVien(); //Tạo đối tượng b1 mới, để phía dưới gán bằng đối tượng ta lấy được ra từ file
        try {
            FileInputStream f = new FileInputStream("D:\\sinhvien.dat");
            ObjectInputStream oIT = new ObjectInputStream(f); // Sử dụng để đọc file theo từng Object
            a1 = (SinhVien) oIT.readObject(); //Đọc Object đầu tiên ép kiểu về kiểu SinhVien sau đó gán bằng đối tượng a1
            b1 = (SinhVien) oIT.readObject(); //Đọc Object tiếp theo, ép kiểu về kiểu SinhVien sau đó gán bằng đối tượng b1
            oIT.close();
            f.close();
        } catch (IOException io) {
            System.out.println("Có lỗi xảy ra!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy class");
        }
 
        System.out.println("Thông tin sinh vien a1 đọc ra là: \nTên: " + a1.getHoTen() + "\nTuổi: " + a1.getTuoi());
        System.out.println("Thông tin sinh vien b1 đọc ra là: \nTên: " + b1.getHoTen() + "\nTuổi: " + b1.getTuoi());
    }
}
 