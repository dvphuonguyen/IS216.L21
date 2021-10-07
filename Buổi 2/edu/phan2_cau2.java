package edu.java.lab2_thuchanh;

import java.util.ArrayList;
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
class Thanh {

    private String maSo, hoTen, soXe;
    private float khoiLuong, doanhThu;
    public int loai = 0;

    public Thanh(String maSo, String hoTen, String soXe, float khoiLuong, float doanhThu) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.khoiLuong = khoiLuong;
        this.doanhThu = doanhThu;
    }

    public Thanh() {
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public float getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(float khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "Thanh{" + "maSo=" + maSo + ", hoTen=" + hoTen + ", soXe=" + soXe + ", khoiLuong=" + khoiLuong + ", doanhThu=" + doanhThu + ", loai=" + loai + '}';
    }

}

class NoiThanh extends Thanh {

    private float quangDuong;

    public NoiThanh(String maSo, String hoTen, String soXe, float khoiLuong, float quangDuong, float doanhThu) {
        super(maSo, hoTen, soXe, khoiLuong, doanhThu);
        this.quangDuong = quangDuong;
        loai = 1;
    }

    public NoiThanh() {
    }

    public float getQuangDuong() {
        return quangDuong;
    }

    public void setQuangDuong(float quangDuong) {
        this.quangDuong = quangDuong;
    }

    @Override
    public String toString() {
        return "NoiThanh{" + "quangDuong=" + quangDuong + '}';
    }

}

class NgoaiThanh extends Thanh {

    private int soNgayVaNChuyen;
    private String noiDen;

    public NgoaiThanh(String maSo, String hoTen, String soXe, float khoiLuong, int soNgayVanChuyen, String noiDen, float doanhThu) {
        super(maSo, hoTen, soXe, khoiLuong, doanhThu);
        this.soNgayVaNChuyen = soNgayVanChuyen;
        this.noiDen = noiDen;
        loai = 2;
    }

    public NgoaiThanh() {
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayVaNChuyen() {
        return soNgayVaNChuyen;
    }

    public void setSoNgayVaNChuyen(int soNgayVaNChuyen) {
        this.soNgayVaNChuyen = soNgayVaNChuyen;
    }

    @Override
    public String toString() {
        return "NgoaiThanh{" + "soNgayVaNChuyen=" + soNgayVaNChuyen + ", noiDen=" + noiDen + '}';
    }
}

public class phan2_cau2 {

    ArrayList<Thanh> thanh = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void nhap() {
        int flag_1, flag_2;
        String maSoChuyen, hoTen, soXe, noiDen, t;
        float khoiLuong, doanhThu, quangDuong;
        int soNgayVanChuyen;
        for (int i = 0; i < 20; i++) {
            System.out.println("Menu:\n1:Nhap thong tin:\n2:Thoat");
            flag_1 = scan.nextInt();
            switch (flag_1) {
                case 1:
                    System.out.println("Menu:\n1: Noi thanh\n2:Ngoai thanh");
                    flag_2 = scan.nextInt();
                    t = scan.nextLine();
                    switch (flag_2) {
                        case 1:
                            System.out.println("Nhap ma so chuyen: ");
                            maSoChuyen = scan.nextLine();
                            System.out.println("Nhap ho ten tai xe: ");
                            hoTen = scan.nextLine();
                            System.out.println("Nhap so xe: ");
                            soXe = scan.nextLine();
                            System.out.println("Nhap khoi luong hang hoa: ");
                            khoiLuong = scan.nextFloat();
                            System.out.println("Nhap quang duong: ");
                            quangDuong = scan.nextFloat();
                            System.out.println("Nhap doanh thu: ");
                            doanhThu = scan.nextFloat();
                            t = scan.nextLine();
                            thanh.add(new NoiThanh(maSoChuyen, hoTen, soXe, khoiLuong, quangDuong, doanhThu));
                            break;
                        case 2:
                            System.out.println("Nhap ma so chuyen: ");
                            maSoChuyen = scan.nextLine();
                            System.out.println("Nhap ho ten tai xe: ");
                            hoTen = scan.nextLine();
                            System.out.println("Nhap so xe: ");
                            soXe = scan.nextLine();
                            System.out.println("Nhap khoi luong hang hoa: ");
                            khoiLuong = scan.nextFloat();
                            System.out.println("Nhap noi den: ");
                            noiDen = scan.nextLine();
                            System.out.println("Nhap so ngay van chuyen: ");
                            soNgayVanChuyen = scan.nextInt();
                            System.out.println("Nhap doanh thu: ");
                            doanhThu = scan.nextFloat();
                            t = scan.nextLine();
                            thanh.add(new NgoaiThanh(maSoChuyen, hoTen, soXe, khoiLuong, soNgayVanChuyen, noiDen, doanhThu));
                            break;
                    }
                    break;
                case 2:
                    return;
            }
        }
    }

    public int tongDoanhThuNgoaiThanh() {
        int sum = 0;
        for (int i = 0; i < thanh.size(); i++) {
            if (thanh.get(i).getLoai() == 2) {
                sum += thanh.get(i).getDoanhThu();
            }
        }
        return sum;
    }

    public int tongDoanhThuNoiThanh() {
        int sum = 0;
        for (int i = 0; i < thanh.size(); i++) {
            if (thanh.get(i).getLoai() == 1) {
                sum += thanh.get(i).getDoanhThu();
            }
        }
        return sum;
    }

    public void doanhThuCaoNhat() {
        int nt = 0;
        int ngt = 0;
        for (int i = 0; i < thanh.size(); i++) {
            if (thanh.get(i).getLoai() == 1 && thanh.get(i).getDoanhThu() > thanh.get(nt).getDoanhThu()) {
                nt = i;
            }
            if (thanh.get(i).getLoai() == 2 && thanh.get(i).getDoanhThu() > thanh.get(ngt).getDoanhThu()) {
                ngt = i;
            }
        }
        System.out.println("Doan hthu cao nhat noi thanh: " + thanh.get(nt));
        System.out.println("Doanh thu cao nhat ngoai thanh: " + thanh.get(ngt));
    }
    public static void main(String[] args) {
        phan2_cau2 cau2 = new phan2_cau2();
        cau2.nhap();
        System.out.println("Tong doanh thu noi thanh: "+cau2.tongDoanhThuNoiThanh());
        System.out.println("Tong doanh thu ngoai thanh: "+cau2.tongDoanhThuNgoaiThanh());
        cau2.doanhThuCaoNhat();
    }
}
