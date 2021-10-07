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
public class phan1_bai1 {
    public void chuVi(int banKinh){
        System.out.println("Chu vi hinh tron la: "+(float) (Math.PI*2*banKinh));
    }
    public static void main(String[] args) {
        phan1_bai1 bai1 = new phan1_bai1();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhan ban kinh hinh tron: ");
        int banKinh = scan.nextInt();
        bai1.chuVi(banKinh);
    }
}
