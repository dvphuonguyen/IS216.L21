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
public class phan1_bai4 {
    public int tongChieuDai(String x){
        return x.length();
    }
    
    public String baKyTuDau(String x){
        return x.substring(0, 3);
    }
    // sai tu day
    public String baKyTuCuoi(String x){
        return x.substring(x.length() - 3);
    }
    
    public char kyTuThu(String x, int i){
        return x.charAt(i);
    }
    
    public String ketHop(String x, String y){
        String a;
        if (x.length() < 0){
            a = x;
        }
        else {
            a = x.substring(0, 3);
        }
        
        if (y.length()<3){
            a = a.concat(y);
        }
        else{
            a = a.concat(y.substring(y.length()-3));
        }
        return a;
    }
    
    public String bangNhau(String x, String y){
        return x.equals(y)?"true":"false";
    }
    
    public String bangNhauIC(String x, String y){
        return x.equalsIgnoreCase(y)?"true":"false";
    }
    
    public int chuaMot(String x, String y){
        return x.indexOf(y);
    }
    
    public void chuaNhieu(String x, String y){
        int j = 0;
        int i = 0;
        while(x.indexOf(y, j) > -1){
            j = x.indexOf(y, j);
            i += 1;
            System.out.println(j);
            j+= 1;
        }
        if ( i== 0){
            System.out.println("x khong chu y");
        }
    }
    public void thucHien(String x, String y){
        System.out.println("Tong chieu dai chuoi x: " + tongChieuDai(x));
        System.out.println("Ba ky tu dau cua chuoi x: "+ baKyTuDau(x));
        System.out.println("Ba ky tu cuoi chuoi x: "+ baKyTuCuoi(x));
        System.out.println("Ky tu thu 6 cua chuoi x: " + kyTuThu(x, 6));
        System.out.println("Chuoi moi gom 3 ky tu dau tien cua chuoi x va 3 ky tu cuoi cua chuoi y: "+ketHop(x, y));
        System.out.println("Hai chuoi x va y bang nhau co phan biet hoa, thuong: "+bangNhau(x, y));
        System.out.println("Hai chuoi x va y bang nhau khong phan biet hoa, thuong: "+bangNhauIC(x, y));
        System.out.println("Vi tri dau tien y xuat hien trong x: "+ chuaMot(x, y));
        System.out.println("Cac vi tri y nam trong x: " ); chuaNhieu(x, y);
    }
    public static void main(String[] args) {
        phan1_bai4 bai4 = new phan1_bai4();
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Nhap chuoi x: ");
        String x = scan.nextLine();
        System.out.println("Nhap chuoi y: ");
        String y = scan.nextLine();
*/
        String x = "abcadefgahijk";
        String y = "1";
        bai4.thucHien(x, y);
    }
}
