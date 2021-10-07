/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.lab1_thuchanh;

import java.util.Scanner;

/**
 *
 * @author phuon
 */

public class phan1_bai3 {
    public void xuatKetQua(PhanSo a, PhanSo b){
        System.out.println("Tong hai phan so: "+ a.tinhTong(b));
        System.out.println("Hieu hai phan so: "+a.tinhHieu(b));
        System.out.println("Tich hai phan so: " + a.tinhTich(b));
        System.out.println("Thuong hai phan so: "+a.tinhThuong(b));
    }
    public static void main(String[] args) {
        phan1_bai3 bai3 = new phan1_bai3();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap gia tri cho phan so a: ");
        System.out.println("Nhap tu so: ");
        int tuSo = scan.nextInt();
        System.out.println("Nhap tu so: ");
        int mauSo = scan.nextInt();
        PhanSo a = new PhanSo(tuSo, mauSo);
        System.out.println("Nhap gia tri cho phan so b: ");
        System.out.println("Nhap tu so: ");
        tuSo = scan.nextInt();
        System.out.println("Nhap tu so: ");
        mauSo = scan.nextInt();
        PhanSo b = new PhanSo(tuSo, mauSo);
        bai3.xuatKetQua(a, b);
    }
}
