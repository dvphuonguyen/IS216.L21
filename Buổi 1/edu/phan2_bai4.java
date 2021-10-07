/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.lab1_thuchanh;

/**
 *
 * @author phuon
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phuon
 */
public class phan2_bai4 {
    public void nhapMangHaiChieu(int arr[][], int n){
        Random rand = new Random();
        for(int i = 0; i< n ; i++){
             for(int j = 0 ;j< n ; j++){
                 arr[i][j] = rand.nextInt(1000);
             }
        }
    }
    public void xuatMangHaiChieu(int arr[][], int n){
        for(int i = 0; i < n; i ++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public void minHaiChieu(int arr[][], int n){
        int min = arr[0][0];
        for (int i = 0 ; i< n ; i++){
            for ( int j = 0; j< n; j++){
                min = Math.min(min, arr[i][j]);
            }
        }
        System.out.println("Gia tri nho nhat trong mang hai chieu: "+ min);
    }
    public void tangDanTheoDong(int arr[][], int n){
        for(int i = 0; i< n ; i++){
            Arrays.sort(arr[i]);
        }
        System.out.println("Mang co cac phan tu sap xep theo dong: ");
        xuatMangHaiChieu(arr, n);
    }
    public void tangDanDuognCheoChinh(int arr[][], int n){
        for(int i = 0 ;i< n ; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i][i] > arr[j][j]){
                    int temp = arr[i][i];
                    arr[i][i] = arr[j][j];
                    arr[j][j] = temp;
                }
            }
        }
        System.out.println("Mang co cac phan tu sap xep theo duong cheo chinh: ");
        xuatMangHaiChieu(arr, n);
    }
    public static void main(String[] args) {
        phan2_bai4 bai4 = new phan2_bai4();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu theo chieu doc: ");
        int n = scan.nextInt();
        int arr[][]= new int[n][n];
        bai4.nhapMangHaiChieu(arr, n);
        bai4.xuatMangHaiChieu(arr, n);
        bai4.minHaiChieu(arr, n);
        bai4.tangDanDuognCheoChinh(arr, n);
        bai4.tangDanTheoDong(arr, n);
    }
}
