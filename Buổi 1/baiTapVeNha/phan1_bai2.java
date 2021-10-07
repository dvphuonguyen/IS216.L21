/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapVeNha;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class phan1_bai2 {
    public void boiChungNhoNhat(int a, int b){
        phan1_bai1 bai1 = new phan1_bai1();
        int c = a*b / bai1.uocChungLonNhat(a, b);
        System.out.println("Boi chung nho nhat : " + c);
    }
    public static void main(String[] args) {
        phan1_bai2 bai2 = new phan1_bai2();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int n1 = scan.nextInt();
        System.out.println("Nhap so thu hai: ");
        int n2 = scan.nextInt();
        bai2.boiChungNhoNhat(n1, n2);
    }
}
