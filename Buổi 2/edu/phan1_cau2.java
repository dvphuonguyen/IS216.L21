/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.lab2_thuchanh;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
class HinhChuNhat{
    private float chieuDai, chieuRong;

    public HinhChuNhat() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }
    

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public float dienTich(){
        return chieuDai*chieuRong;
    }
    
    public float chuVi(){
        return (chieuDai+chieuRong)* 2;
    }
    @Override
    public String toString(){
        return "Chieu dai: "+chieuDai+", chieu rong: "+chieuRong+", dien tich: "+dienTich()+", chu vi: "+chuVi();
    }
}
public class phan1_cau2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float chieuDai, chieuRong;
        System.out.println("Nhap chieu dai: ");
        chieuDai = scan.nextFloat();
        System.out.println("Nhap chieu rong: ");
        chieuRong = scan.nextFloat();
        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        System.out.println(hcn);
    }
}
