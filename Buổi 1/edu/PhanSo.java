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
public class PhanSo {
    public int tuSo, mauSo;
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo tinhTong(PhanSo b){
        PhanSo c = new PhanSo(this.tuSo*b.mauSo + this.mauSo+b.tuSo, this.mauSo*b.mauSo);
        return c;
    }
    
    public PhanSo tinhHieu(PhanSo b){
        PhanSo c = new PhanSo(this.tuSo*b.mauSo - this.mauSo+b.tuSo, this.mauSo*b.mauSo);
        return c;
    }
    
    public PhanSo tinhTich(PhanSo b){
        PhanSo c = new PhanSo(this.tuSo*b.tuSo, this.mauSo*b.mauSo);
        return c;
    }
    
    public PhanSo tinhThuong(PhanSo b){
        PhanSo c = new PhanSo(this.tuSo*b.mauSo, this.mauSo+b.tuSo);
        return c;
    }
    public String toString(){
        return this.tuSo+"/"+this.mauSo;
    }
}
