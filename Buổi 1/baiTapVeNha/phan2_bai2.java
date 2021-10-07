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
public class phan2_bai2 {
    public void nhapMangHaiChieu(int arr[][], int r, int c){
        Random rand = new Random();
        for(int i = 0; i< r ; i++){
             for(int j = 0 ;j< c ; j++){
                 arr[i][j] = rand.nextInt(1000);
             }
        }
    }
    public void xuatMangHaiChieu(int arr[][], int r){
        for(int i = 0; i < r; i ++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public void minHaiChieu(int arr[][], int r, int c){
        int min = arr[0][0];
        for (int i = 0 ; i< r ; i++){
            for ( int j = 0; j< c; j++){
                min = Math.min(min, arr[i][j]);
            }
        }
        System.out.println("Gia tri nho nhat trong mang hai chieu: "+ min);
    }
    public int soNguyenTo(int n){
        if (n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n%i == 0) return 0;
        }
        return 1;
    }
    public void timSoNguyenTo(int arr[][], int r, int c){
        System.out.println("Cacs so nguyen to trong mang: ");
        for(int i = 0; i< r; i++){
            for (int j = 0; j < c; j++){
                if(soNguyenTo(arr[i][j])== 1){
                    System.out.println(arr[i][j]);
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
    }
    
    public void tangDanTheoCot(int arr[][], int r, int c){
        /*int temp [][]= new int[r][c];
        for(int i = 0; i < r * c; i++){
            temp[r*(i%c)+1/c] = arr[i];
        }
        for(int i = 0; i< r; i++){
            System.out.println(Arrays.toString(temp[r]));
        }
*/
        for (int j = 0 ; j< c; j++){
            
            for(int i = 0; i < r; i++){
                for(int k = i + 1; k < r; k++){
                if(arr[i][j] > arr[k][j]){
                    int temp = arr[i][j];
                    arr[i][j] = arr[k][j];
                    arr[k][j] = temp;
                }
            }
            }
        }
        xuatMangHaiChieu(arr, r);
    }
    
    public static void main(String[] args) {
        phan2_bai2 bai2 = new phan2_bai2();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        int r =scan.nextInt();
        System.out.println("Nhap so cot: ");
        int c =scan.nextInt();
        int arr[][]= new int[r][c];
        bai2.nhapMangHaiChieu(arr, r, c);
        /*
        int val;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.println("Nhap gia tri cot "+i+" hang "+j+ " la: ");
                val = scan.nextInt();
                arr[i][j] = val;
            }
        }
        */
        System.out.println("Mang: ");
        bai2.xuatMangHaiChieu(arr, r);
        bai2.minHaiChieu(arr, r, c);
        bai2.timSoNguyenTo(arr, r, c);
        System.out.println("Sap xep amng tang dan theo cot: ");
        bai2.tangDanTheoCot(arr, r, c);       
    }
}
