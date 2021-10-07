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
public class phan1_bai2 {
    public void chia(float a, float b){
        System.out.printf("%.3f\n", a/b);
    }
    public static void main(String[] args) {
        phan1_bai2 bai2 = new phan1_bai2();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a: ");
        float a = scan.nextFloat();
        System.out.println("Nhap b: ");
        float b = scan.nextFloat();
        bai2.chia(a, b);
    }
}
