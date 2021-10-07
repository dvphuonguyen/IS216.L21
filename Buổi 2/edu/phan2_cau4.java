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
abstract class CacXe{

    float quangDuong;
    float xang;
    float luongHang;

    public CacXe(float quangDuong, float xang, float luongHang) {
        this.quangDuong = quangDuong;
        this.xang = xang;
        this.luongHang = luongHang;
    }

    public CacXe() {
    }

    public float getLuongHang() {
        return luongHang;
    }

    public void setLuongHang(float luongHang) {
        this.luongHang = luongHang;
    }

    public float getQuangDuong() {
        return quangDuong;
    }

    public void setQuangDuong(float quangDuong) {
        this.quangDuong = quangDuong;
    }

    public float getXang() {
        return xang;
    }

    public void setXang(float xang) {
        this.xang = xang;
    }
    
    public float themHang(float hang){
        return this.luongHang + hang;
    }
    
    public float botHang(float hang){
        return this.luongHang - hang;
    }
    
    public float themXang(float xang){
        return this.xang + xang;
    }
    
    public float themQuangDuong(float quangDuong){
        return this.quangDuong + quangDuong;
    }

    @Override
    public String toString() {
        return "CacXe{" + "quangDuong=" + quangDuong + ", xang=" + xang + ", luongHang=" + luongHang + '}';
    }
    
    abstract public boolean hetXang();
    abstract public float xangConLai();
}

class XeMay extends CacXe{

    public XeMay(float quangDuong, float xang, float luongHang) {
        super(quangDuong, xang, luongHang);
    }

    public XeMay() {
    }
   
    @Override
    public boolean hetXang(){
        float sub = (float) (this.xang - (this.quangDuong * 2 / 100 + this.luongHang * 0.1 / 10));
        return sub == 0;
    }
    
    @Override
    public float xangConLai(){
        return (float) (this.xang - (this.quangDuong * 2 / 100 + this.luongHang * 0.1 / 10));
    }
}

class XeTai extends CacXe{

    public XeTai(float quangDuong, float xang, float luongHang) {
        super(quangDuong, xang, luongHang);
    }

    public XeTai() {
    }

    @Override
    public boolean hetXang() {
        float sub = (float) (this.xang - (this.quangDuong * 20 / 100 + this.luongHang / 100));
        return sub <= 0;
    }

    @Override
    public float xangConLai() {
        return (float) (this.xang - (this.quangDuong * 20 / 100 + this.luongHang / 100));
    }
    
}
public class phan2_cau4 {
    public static void main(String[] args) {
        ArrayList<CacXe> xe = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong xe: ");
        int soLuong = scan.nextInt();
        float quangDuong, xang, luongHang;
        int flag;
        for(int i = 0 ; i < soLuong; i++){
            System.out.println("Menu:\n1. Xe may\n2.Xe tai");
            flag = scan.nextInt();
            System.out.println("Nhap quang duong: ");
            quangDuong = scan.nextFloat();
            System.out.println("Nhap xang: ");
            xang = scan.nextFloat(); 
            System.out.println("Nhap luong hang: ");
            luongHang = scan.nextFloat();
            if(flag == 1){
                xe.add(new XeMay(quangDuong, xang, luongHang));
            }else{
                xe.add(new XeTai(quangDuong, xang, luongHang));
            }
        }
        System.out.println("\t\tXuat lan 1:");
        for(int i = 0; i < xe.size(); i++){
            System.out.println(xe.get(i));
        }
        System.out.println("Moi xe chay them 10 km: ");
        for(int i = 0; i < xe.size(); i++){
            xe.get(i).setQuangDuong(xe.get(i).themQuangDuong(10));
        }
        System.out.println("\t\tXuat lan 2:");
        for(int i = 0; i < xe.size(); i++){
            System.out.println(xe.get(i));
        }
        System.out.println("Moi xe them 10 kg hang: ");
        for(int i = 0; i < xe.size(); i++){
            xe.get(i).setLuongHang(xe.get(i).themHang(10));
        }
        System.out.println("\t\tXuat lan 3:");
        for(int i = 0; i < xe.size(); i++){
            System.out.println(xe.get(i));
        }
        System.out.println("Moi xe bot 5 kg hang: ");
        for(int i = 0; i < xe.size(); i++){
            xe.get(i).setLuongHang(xe.get(i).botHang(5));
        }
        System.out.println("\t\tXuat lan 4:");
        for(int i = 0; i < xe.size(); i++){
            System.out.println(xe.get(i));
        }
        System.out.println("Moi xe them 50 lit xang : ");
        for(int i = 0; i < xe.size(); i++){
            xe.get(i).setXang(xe.get(i).themXang(50));
        }
        System.out.println("\t\tXuat lan 5:");
        for(int i = 0; i < xe.size(); i++){
            System.out.println(xe.get(i));
        }
        System.out.println("Cac xe het xang: ");
        flag = 0;
        for(int i = 0; i< xe.size(); i++){
            if(xe.get(i).hetXang() == true){
                System.out.println("Xe thu "+i+" het xang");
                System.out.println("Thong tin cua xe la: ");
                System.out.println(xe.get(i));
                flag += 1;
            }
        }
        if(flag == 0){
            System.out.println("Khong co");
        }
        System.out.println("Luong xang con lai trong moi xe: ");{
        for(int i = 0; i< xe.size(); i++){
            System.out.println("So xang con lai trong xe thu "+i+" la: "+xe.get(i).xangConLai());
        }
    }
    }
}
