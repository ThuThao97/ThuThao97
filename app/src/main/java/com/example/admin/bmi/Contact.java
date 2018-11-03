package com.example.admin.bmi;

public class Contact {
    private String hoTen;
    private  String SDT;

    public Contact(String hoTen, String SDT) {
        this.hoTen = hoTen;
        this.SDT = SDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return hoTen + "-" + SDT + "1" ;
    }
}
