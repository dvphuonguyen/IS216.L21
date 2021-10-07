/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.lab2_thuchanh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
class SinhVien{
    private int maSV;
    private String hoTen;
    private float diemLT, diemTH;

    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    @Override
    public String toString() {
        return "SinhVien{ " + "maSV=" + maSV + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + '}';
    }
    
}
public class phan1_cau3 {
    public static void main(String[] args) {
        ArrayList<SinhVien> sv = new ArrayList<>();
        sv.add(new SinhVien(1, "Dang Vu Phuong Uyen", 10, 10));
        sv.add(new SinhVien(2, "Dinh Cong Thanh", 10, 10));
        sv.add(new SinhVien(3, "Nguyen Ngoc Thien", 10, 10));
        for(int i = 0; i < sv.size(); i++){
            System.out.println(sv.get(i));
        }
    }
}
