/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.lab1_thuchanh;

import java.util.Scanner;
/*
import edu.java.lab1_thuchanh.PhanSo;
import edu.java.lab1_thuchanh.phan1_bai1;
import edu.java.lab1_thuchanh.phan1_bai2;
import edu.java.lab1_thuchanh.phan1_bai3;
import edu.java.lab1_thuchanh.phan1_bai4;
import edu.java.lab1_thuchanh.phan1_bai5;
*/
/**
 *
 * @author phuon
 */
public class phan1_bai6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("##################################\n" +
                            "1. Bài 1\n" +
                            "2. Bài 2\n" +
                            "3. Bài 3\n" +
                            "4. Bài 4\n" +
                            "5. Bài 5\n" +
                            "6. Thoát\n" +
                            "##################################");
        System.out.println("Nhap su lua chon: ");
        int opt = scan.nextInt();
        switch(opt){
            case 1 : {
                /*
                System.out.println("Nhan ban kinh hinh tron: ");
                float banKinh = scan.nextFloat();*/
                float banKinh = 2;
                phan1_bai1 bai6_1 = new phan1_bai1();
                bai6_1.chuVi((int) banKinh);
                break;
            }

            case 2 : {
                /*
                System.out.println("Nhap a: ");
                float a = scan.nextFloat();
                System.out.println("Nhap b: ");
                float b = scan.nextFloat();
                */
                float a = 2;
                float b = 3;
                phan1_bai2 bai6_2 = new phan1_bai2();
                bai6_2.chia(a, b);
                break;
            }



            case 3 : {
                /*System.out.println("Nhap gia tri cho phan so c: ");
                System.out.println("Nhap tu so: ");
                int tuSo = scan.nextInt();
                System.out.println("Nhap tu so: ");
                int mauSo = scan.nextInt();
                PhanSo c = new PhanSo(tuSo, mauSo);
                System.out.println("Nhap gia tri cho phan so d: ");
                System.out.println("Nhap tu so: ");
                tuSo = scan.nextInt();
                System.out.println("Nhap tu so: ");
                mauSo = scan.nextInt();
                PhanSo d = new PhanSo(tuSo, mauSo);
                */
                PhanSo c = new PhanSo(1, 2);
                PhanSo d = new PhanSo(2, 3);
                phan1_bai3 bai6_3 = new phan1_bai3();
                bai6_3.xuatKetQua(c, d);
                break;
            }
            case 4 : {
                phan1_bai4 bai6_4 = new phan1_bai4();
                /*System.out.println("Nhap chuoi x: ");
                String x = scan.nextLine();
                System.out.println("Nhap chuoi y: ");
                String y = scan.nextLine();
                */
                String x= "abcadefgahijk";
                String y = "a";
                bai6_4.thucHien(x, y);
                break;
            }
            case 5 :{
                /*System.out.println("Nhap so dien: ");
                float soDien = scan.nextFloat();*/
                float soDien = 250;
                phan1_bai5 bai6_5 = new phan1_bai5();
                bai6_5.tienDien(soDien);
                break;
            }
            
        }
    }

}
