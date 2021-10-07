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
class Zattacker{
    private float khoiLuong, sucManh;

    public Zattacker() {
    }

    public Zattacker(float khoiLuong, float sucManh) {
        this.khoiLuong = khoiLuong;
        this.sucManh = sucManh;
    }

    public float getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(float khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public float getSucManh() {
        return sucManh;
    }

    public void setSucManh(float sucManh) {
        this.sucManh = sucManh;
    }
    
    public float TieuThu(float quangDuong){
        return this.khoiLuong* quangDuong + (this.sucManh) * (this.sucManh) * quangDuong;
    }

    @Override
    public String toString() {
        return "Zattacker{" + "khoiLuong=" + khoiLuong + ", sucManh=" + sucManh + ", nangLuong=" + TieuThu(10) + '}';
    }
    
}
class Pedion{
    private float khoiLuong, linhHoat;

    public Pedion() {
    }

    public Pedion(float khoiLuong, float linhHoat) {
        this.khoiLuong = khoiLuong;
        this.linhHoat = linhHoat;
    }

    public float getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(float khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public float getLinhHoat() {
        return linhHoat;
    }

    public void setLinhHoat(float linhHoat) {
        this.linhHoat = linhHoat;
    }
    
    public float TieuThu(float quangDuong){
        return this.khoiLuong* quangDuong + (this.linhHoat) * quangDuong / 2;
    }

    @Override
    public String toString() {
        return "Pedion{" + "khoiLuong=" + khoiLuong + ", linhHoat=" + linhHoat + ", nangLuong=" + TieuThu(10) + '}';
    }
    
}
class Carier{
    private float khoiLuong, khoNangLuong;

    public Carier() {
    }

    public Carier(float khoiLuong, float khoNangLuong) {
        this.khoiLuong = khoiLuong;
        this.khoNangLuong = khoNangLuong;
    }

    public float getKhoNangLuong() {
        return khoNangLuong;
    }

    public void setKhoNangLuong(float khoNangLuong) {
        this.khoNangLuong = khoNangLuong;
    }

    public float getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(float khoiLuong) {
        this.khoiLuong = khoiLuong;
    }
    public float TieuThu(float quangDuong){
        return this.khoiLuong* quangDuong + (this.khoNangLuong) * 4 * quangDuong;
    }

    @Override
    public String toString() {
        return "Carier{" + "khoiLuong=" + khoiLuong + ", khoNangLuong=" + khoNangLuong + ", nangLuong=" + TieuThu(10)+ '}';
    }
    
}
public class phan2_cau3 {
    static Scanner scan = new Scanner(System.in);
    ArrayList<Pedion> p = new ArrayList<>();
    ArrayList<Zattacker> z = new ArrayList<>();
    ArrayList<Carier> c = new ArrayList<>();
    public void NhapPedion(int n){
        float khoiLuong, linhHoat;
        for (int i = 0; i< n; i++) {
            System.out.println("Nhap khoi luong: ");
            khoiLuong= scan.nextFloat();
            System.out.println("Nhap do linh hoat: ");
            linhHoat = scan.nextFloat();
            p.add(new Pedion(khoiLuong, linhHoat));
        }
    }
    public void xuatPedion(){
        for(int i = 0; i< p.size(); i++){
            System.out.println(p.get(i));
    }
    }
    public void NhapZattacker(int n){
        float khoiLuong, sucManh;
        for (int i = 0; i< n; i++) {
            System.out.println("Nhap khoi luong: ");
            khoiLuong= scan.nextFloat();
            System.out.println("Nhap do suc manh: ");
            sucManh = scan.nextFloat();
            z.add(new Zattacker(khoiLuong, sucManh));
        }
    }
    public void xuatZattacker(){
        for(int i = 0; i< z.size(); i++){
            System.out.println(z.get(i));
    }
    }
    public void NhapCarier(int n){
        float khoiLuong, khoNangLuong;
        for (int i = 0; i< n; i++) {
            System.out.println("Nhap khoi luong: ");
            khoiLuong= scan.nextFloat();
            System.out.println("Nhap do kho nang luong: ");
            khoNangLuong = scan.nextFloat();
            c.add(new Carier(khoiLuong, khoNangLuong));
        }
    }
    public void xuatCarier(){
        for(int i = 0; i< c.size(); i++){
            System.out.println(c.get(i));
    }
    }
    public void nhieuNhat(){
        float sum1 = 0, sum2 = 0, sum3 = 0;
        for(int i =0; i< p.size(); i++){
            sum1 += p.get(i).TieuThu(10);
        }
        for(int i =0; i< z.size(); i++){
            sum2 += z.get(i).TieuThu(10);
        }
        for(int i =0; i< c.size(); i++){
            sum3 += c.get(i).TieuThu(10);
        }
        float max = sum1;
        if (sum1 > sum2){
            if(sum1 > sum3){
                System.out.println("Robot Pedion tieu thu nhieu nhat voi muc nang luong la: "+sum1);
            }
            else{
                System.out.println("Robot Carrier tieu thu nhieu nhat voi muc nang luong la: "+sum3);
            }
        }else{
            if(sum2 > sum3){
                System.out.println("Robot Zattacker tieu thu nhieu nhat voi muc nang luong la: "+sum2);
            }
            else{
                System.out.println("Robot Carrier tieu thu nhieu nhat voi muc nang luong la: "+sum3);
            }
        }
    }
    public static void main(String[] args) {
        phan2_cau3 cau3 = new phan2_cau3();
        int soLuong;
        String t;
        System.out.println("Nhap so luong robot Pedion");
        soLuong = scan.nextInt();
        cau3.NhapPedion(soLuong);
        t = scan.nextLine();
        System.out.println("Nhap so luong robot Zattacker");
        soLuong = scan.nextInt();
        cau3.NhapZattacker(soLuong);
        t = scan.nextLine();
        System.out.println("Nhap so luong robot Carier");
        soLuong = scan.nextInt();
        cau3.NhapCarier(soLuong);
        t = scan.nextLine();
        
        cau3.xuatPedion();
        cau3.xuatZattacker();
        cau3.xuatCarier();
        
        cau3.nhieuNhat();
        
    }
}
