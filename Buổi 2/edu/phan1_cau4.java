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
class Xe{
    private String tenChuXe, loaiXe;
    private float triGiaXe, dungTichXiLanh;

    public Xe() {
        this.tenChuXe = "";
        this.loaiXe = "";
        this.triGiaXe = 0;
        this.dungTichXiLanh = 0;
    }

    public Xe(String tenChuXe, String loaiXe, float triGiaXe, float dungTichXiLanh) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.triGiaXe = triGiaXe;
        this.dungTichXiLanh = dungTichXiLanh;
    }

    public float getDungTichXiLanh() {
        return dungTichXiLanh;
    }

    public void setDungTichXiLanh(float dungTichXiLanh) {
        this.dungTichXiLanh = dungTichXiLanh;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public float getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(float triGiaXe) {
        this.triGiaXe = triGiaXe;
    }
    
    public float tienThue(){
        if(this.dungTichXiLanh < 100){
            return (float) (0.01*this.triGiaXe);
        }else if (this.dungTichXiLanh < 175){
            return (float) (0.03*this.triGiaXe);
        }else{
            return (float) (0.05*this.triGiaXe);
        }
    }
    
    @Override
    public String toString() {
        return "Xe{" + "tenChuXe=" + tenChuXe + ", loaiXe=" + loaiXe + ", thuPhaiDong=" + tienThue() + ", dungTichXiLanh=" + dungTichXiLanh + '}';
    }
    
    
}
public class phan1_cau4 {
    public static void main(String[] args) {
        ArrayList<Xe> xe = new ArrayList<>();
        String loaiXe;
        float triGiaXe, dungTichXyLanh;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Nhap ten chu xe: ");
            String tenChuXe = scan.nextLine();
            if (tenChuXe.equals("")){
                break;
            }else{
                System.out.println("Nhap loai xe: ");
                loaiXe = scan.nextLine();
                System.out.println("Nhap tri gia xe: ");
                triGiaXe = scan.nextFloat();
                System.out.println("Nhap dung tich xyLanh: ");
                dungTichXyLanh = scan.nextFloat();
                String s = scan.nextLine();
                xe.add(new Xe(tenChuXe, loaiXe, triGiaXe, dungTichXyLanh));
            }
        }
        
        for(int i = 0; i < xe.size(); i++){
            System.out.println(xe.get(i));
        }
        
        System.out.println("Nhap ten chu xe can tim : ");
        String ten_Chu_Xe = scan.nextLine();
        for(int i = 0; i < xe.size(); i++){
            if(xe.get(i).getTenChuXe().equals(ten_Chu_Xe)){
                System.out.println("Thue cua "+ten_Chu_Xe+" la: "+xe.get(i).tienThue());
            }else{
                System.out.println("Khong tim thay chu xe nay");
            }
        }
    }
        
}
