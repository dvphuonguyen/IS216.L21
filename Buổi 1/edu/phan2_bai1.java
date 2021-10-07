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
public class phan2_bai1 {
    public int soNguyenTo(int n){
        if (n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n%i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        phan2_bai1 bai1 = new phan2_bai1();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n =scan.nextInt();
        if(bai1.soNguyenTo(n) == 1){
            System.out.println(n +" la so nguyen so");
        }else{
            System.out.println(n +" khong la so nguyen to");
        }
    }
}
