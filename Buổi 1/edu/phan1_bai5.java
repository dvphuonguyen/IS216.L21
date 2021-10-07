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
public class phan1_bai5 {
    public void tienDien(float soDien){
        float tong = 0;
        if (soDien <= 50){
            tong = soDien * 2000;
        }
        else if (soDien <= 100){
            tong = 50*2000 + (soDien - 50)*2500;
        }
        else{
            tong = 50*2000 + 50* 2500 + (soDien - 100)*3500;
        }
        System.out.println("Tong so tien dien voi so dien " + soDien+" la : "+ tong);
    }
    public static void main(String[] args) {
        phan1_bai5 bai5 = new phan1_bai5();
        System.out.println("Nhap so dien: ");
        Scanner scan = new Scanner(System.in);
        float soDien = scan.nextFloat();
        bai5.tienDien(soDien);
    }
}
