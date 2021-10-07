/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.lab1_thuchanh;

import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.io.*;

/**
 *
 * @author phuon
 */
public class phan2_bai3 {
    public void nhap(int arr[], int n){
        for(int i = 0; i< n ; i++){
            Random rand = new Random();
            arr[i] = rand.nextInt(50);
        }
    }
    
    public void minMax(int arr[], int n){
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i< n ;i ++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println("Gia tri nho nhat : "+ min);
        System.out.println("Gia tri lon nhat: "+ max);
    }
    public void dem(int arr[], int n, int x){
        int count = 0;
        for (int i = 0; i< n; i ++){
            if(arr[i]==x){
                count += 1;
            }
        }
        System.out.println("Tan suat phan tu "+x+" xuat hien trong mang la: "+count);
    }
    public static void main(String[] args) {
        phan2_bai3 bai3 = new phan2_bai3();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = scan.nextInt();
        int arr[] =  new int[n];
        bai3.nhap(arr, n);
        System.out.println("Xuat mang: ");
        System.out.println(Arrays.toString(arr));
        bai3.minMax(arr, n);
        System.out.println("Nhap gia tri phan tu can tim: ");
        int x = scan.nextInt();
        bai3.dem(arr, n, x);
        Arrays.sort(arr);
        System.out.println("Xuat mang da sap xep: ");
        System.out.println(Arrays.toString(arr));
    }
}
