/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapVeNha;

/**
 *
 * @author phuon
 */
public class Sach {
    private String MaSach, TenSach, NhaXuatBan, TacGia;
    private double  Gia;
    public Sach() {
    }
    
    public Sach(String MaSach, String TenSach, double Gia, String NhaXuatBan, String TacGia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Gia = Gia;
        this.NhaXuatBan = NhaXuatBan;
        this.TacGia = TacGia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public void setNhaXuatBan(String NhaXuatBan) {
        this.NhaXuatBan = NhaXuatBan;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getMaSach() {
        return MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public double getGia() {
        return Gia;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public String getTacGia() {
        return TacGia;
    }
    
    @Override
    public String toString(){
        return "Sach{" + "maSach = "+MaSach + ", tenSach = "+TenSach+", gia = "+Gia + ", tac gia = "+TacGia+", nha xuat ban = "+NhaXuatBan;
    }
}
