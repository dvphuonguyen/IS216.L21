/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapVeNha;

import java.util.Scanner;
import edu.java.lab1_thuchanh.phan2_bai1;
/**
 *
 * @author phuon
 */
public class phan1_bai4 {
    public void lietKeUoc(int n){
        System.out.println("Cac uoc so cua "+ n+" la: ");
        phan2_bai1 bai1 = new phan2_bai1();
        if (n == 1){
            System.out.println(1);
        }
        else if(bai1.soNguyenTo(n)==1){
            System.out.println(1+"\t"+n);
        }
        else{
            for(int i = 1; i <= n ; i++){
                if(n%i == 0){
                    System.out.printf(i+"\t");
                }
            }
        }
      
    }
    public static void main(String[] args) {
        phan1_bai4 bai4 = new phan1_bai4();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = scan.nextInt();
        bai4.lietKeUoc(n);
    }
}
