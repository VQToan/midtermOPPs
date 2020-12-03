/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwindow;

/**
 *
 * @author Hải Đăng
 */
public class NewClass {
        private int maKh;
        private  String tenkH;
        private Double diemso;
        private Double diemtong;

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }

    public String getTenkH() {
        return tenkH;
    }

    public void setTenkH(String tenkH) {
        this.tenkH = tenkH;
    }

    public Double getDiemso() {
        return diemso;
    }

    public void setDiemso(Double diemso) {
        this.diemso = diemso;
    }

    public Double getDiemtong() {
        return diemtong;
    }

    public void setDiemtong(Double diemtong) {
        this.diemtong = diemtong;
    }

    public NewClass(int maKh, String tenkH, Double diemso, Double diemtong) {
        this.maKh = maKh;
        this.tenkH = tenkH;
        this.diemso = diemso;
        this.diemtong = diemtong;
    }

    public NewClass() {
    }
    
}
