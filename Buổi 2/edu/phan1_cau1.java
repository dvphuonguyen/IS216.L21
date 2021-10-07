/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.lab2_thuchanh;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
class Point{
    private int toaDoX, toaDoY;

    public Point(int toaDoX, int toaDoY) {
        this.toaDoX = toaDoX;
        this.toaDoY = toaDoY;
    }

    public Point() {
        this.toaDoX = 0;
        this.toaDoY = 0;
    }
    
    public float khoangCach(Point a){
        return (float) Math.sqrt((Math.pow(this.toaDoX - a.toaDoX, 2) + Math.pow(this.toaDoY - a.toaDoY , 2)));
    }
}
public class phan1_cau1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Nhap toa do diem A: ");
        System.out.println("Nhap x: "); x = scan.nextInt();
        System.out.println("Nhap y: "); y = scan.nextInt();
        Point A = new Point(x, y);
        System.out.println("Nhap toa do diem B: ");
        System.out.println("Nhap x: "); x = scan.nextInt();
        System.out.println("Nhap y: "); y = scan.nextInt();
        Point B = new Point(x, y);
        System.out.println("Khoang cach giua hai diem A va B la: "+A.khoangCach(B));
    }
}
