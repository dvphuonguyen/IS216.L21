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
public class phan2_bai2 {
    public void xuatPytago(int n){
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < n + 1; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        phan2_bai2 bai2 = new phan2_bai2();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = scan.nextInt();
        bai2.xuatPytago(n);
    }
}
