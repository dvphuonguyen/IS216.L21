/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapVeNha;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class phan2_bai1 {
    public void nhap(int arr[], int n){
        for(int i = 0; i< n ; i++){
            Random rand = new Random();
            arr[i] = rand.nextInt(50);
        }
    }
    public static void main(String[] args) {
        phan2_bai1 bai1 = new phan2_bai1();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang a: ");
        int n = scan.nextInt();
        int a[] =  new int[n];
        bai1.nhap(a, n);
        System.out.println("Nhap so luong phan tu mang b: ");
        int m = scan.nextInt();
        int b[] =  new int[m];
        bai1.nhap(a, n);
        //xuat
        System.out.println("Xuat mang b: ");
        System.out.println(Arrays.toString(b));
        //copy
        int c[] = Arrays.copyOf(a, n);
        System.arraycopy(b, m - 3, c, 0, 3);
        System.out.println("Xuat mang c: ");
        System.out.println(Arrays.toString(c));
        //sap xep
        Arrays.sort(c);
        System.out.println("Xuat mang c: ");
        System.out.println(Arrays.toString(c));
    }
}
