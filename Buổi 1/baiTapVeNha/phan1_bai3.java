/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapVeNha;
import edu.java.lab1_thuchanh.PhanSo;
import java.util.Scanner;
/**
 *
 * @author phuon
 */
public class phan1_bai3 {
    public void xuaTDonGian(int a, int b){
        phan1_bai1 bai1 = new phan1_bai1();
        int c = bai1.uocChungLonNhat(a, b);
        if (c == 0){
            System.out.println("Mau phai khac 0");
        }
        else{
            a /= c;
            b /= c;
            if ( a == 0){
                System.out.println("Phan so ru gon: " + 0);
            }
            else if (b == 1){
                System.out.println("Phan so rut gon: "+a);
            }
            else{
                System.out.println("Phan so rut gon: "+ a + "/" + b);
            }
        }

        
        
    }
    public static void main(String[] args) {
        phan1_bai3 bai3 = new phan1_bai3();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        int tuSo = scan.nextInt();
        System.out.println("Nhap mau so: ");
        int mauSo = scan.nextInt();
        bai3.xuaTDonGian(tuSo, mauSo);
    }
}
