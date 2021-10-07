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
public class phan1_bai1 {
    public int uocChungLonNhat(int a, int b){
        if ( a==0 ){
            return b;
        }
        if (b == 0){
            return a;
        }
        while( a != b){
            if (a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        phan1_bai1 bai1 = new phan1_bai1();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int n1 = scan.nextInt();
        System.out.println("Nhap so thu hai: ");
        int n2 = scan.nextInt();
        System.out.println("Uoc chung lon nhat la: " + bai1.uocChungLonNhat(n1, n2));
    }
}
