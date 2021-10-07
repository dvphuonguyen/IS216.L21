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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.DAYS;
import java.util.logging.Level;
import java.util.logging.Logger;

class HangHoa {

    String maHang, tenHang;
    float donGia;
    int soLuongTon;
    int loaiHH;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, float donGia, int soLuongTon) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }

    public int getLoaiHH() {
        return loaiHH;
    }

    public void setLoaiHH(int loaiHH) {
        this.loaiHH = loaiHH;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String danhGia(){
        return null;
    };

    public void xuatBanDuoc(){
    };
    
    public float thanhTien(int soLuong){
        return 0;
    };

    @Override
    public String toString() {
        return "HangHoa{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", soLuongTon=" + soLuongTon + ", danhGia=" + danhGia() + '}';
    }
}

class DienMay extends HangHoa {

    String thuongHieu, loaiMay;
    int thoiGianBaoHang;

    public DienMay() {
        loaiHH = 1;
    }

    public DienMay(String thuongHieu, String loaiMay, int thoiGianBaoHang, String maHang, String tenHang, float donGia, int soLuongTon) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.thuongHieu = thuongHieu;
        this.loaiMay = loaiMay;
        this.thoiGianBaoHang = thoiGianBaoHang;
        loaiHH = 1;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getLoaiMay() {
        return loaiMay;
    }

    public void setLoaiMay(String loaiMay) {
        this.loaiMay = loaiMay;
    }

    public int getThoiGianBaoHang() {
        return thoiGianBaoHang;
    }

    public void setThoiGianBaoHang(int thoiGianBaoHang) {
        this.thoiGianBaoHang = thoiGianBaoHang;
    }

    @Override
    public String danhGia() {
        if (soLuongTon < 3) {
            return "Ban duoc";
        } else {
            return "Khong danh gia";
        }
    }

    @Override
    public float thanhTien(int soLuong) {

        if (this.soLuongTon >= soLuong) {
            this.soLuongTon -= soLuong;
            return (float) (soLuong * donGia * 0.1);
        } else {
            return 0;
        }
    }
    
    @Override
    public void xuatBanDuoc(){
        System.out.println("Thuong hieu: "+this.thuongHieu + ", ten hang: "+this.tenHang + ", loai hang: "+ this.loaiMay);
    };
}

class ThucPham extends HangHoa {

    String ngaySX, ngayHH, nhaCungCap;

    public ThucPham() {
        loaiHH = 2;
    }

    public ThucPham(String ngaySX, String ngayHH, String nhaCungCap, String maHang, String tenHang, float donGia, int soLuongTon) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
        this.nhaCungCap = nhaCungCap;
        loaiHH = 2;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public String getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(String ngayHH) {
        this.ngayHH = ngayHH;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public boolean hetHan() {
        int date_1 = Integer.parseInt(ngaySX.substring(0, 2));
        int month_1 = Integer.parseInt(ngaySX.substring(3, 5));
        int year_1 = Integer.parseInt(ngaySX.substring(6));

        int date_2 = Integer.parseInt(ngayHH.substring(0, 2));
        int month_2 = Integer.parseInt(ngayHH.substring(3, 5));
        int year_2 = Integer.parseInt(ngayHH.substring(6));
        if (year_1 < year_2) {
            return false;
        } else if (year_1 == year_2) {
            if (month_1 < month_2) {
                return false;
            } else if (month_1 == month_2) {
                return date_1 > date_2;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @Override
    public String danhGia() {
        if (hetHan() && soLuongTon > 2) {
            return "Kho ban";
        }
        return "Khong danh gia";
    }

    @Override
    public float thanhTien(int soLuong) {
        if (this.soLuongTon >= soLuong) {
            this.soLuongTon -= soLuong;
            return (float) (soLuong * donGia * 0.05);
        } else {
            return 0;
        }
    }
}

class GiaDung extends HangHoa {

    String nhaSX, ngayNhap, loai;

    public GiaDung() {
        loaiHH = 3;
    }

    public GiaDung(String nhaSX, String ngayNhap, String loai, String maHang, String tenHang, float donGia, int soLuongTon) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaSX = nhaSX;
        this.ngayNhap = ngayNhap;
        this.loai = loai;
        loaiHH = 3;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public boolean qua20Ngay(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localDate = LocalDate.parse(ngayNhap, formatter);
        int soNgay = (int) ChronoUnit.DAYS.between(localDate, LocalDate.now());
        return soNgay > 20;
    }

    @Override
    public String danhGia() {
        if (soLuongTon > 10 && qua20Ngay()) {
                return "Ban cham";
        }
        return "Khong danh gia";
    }

    @Override
    public float thanhTien(int soLuong) {
        if (this.soLuongTon >= soLuong) {
            this.soLuongTon -= soLuong;
            return (float) (soLuong * donGia * 0.1);
        } else {
            return 0;
        }
    }
}

public class cau_2 {

    static ArrayList<HangHoa> hanghoa = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public void nhapMang() {
        String maHang, tenHang, thuongHieu, loaiMay, ngaySX, ngayHH, nhaCungCap, nhaSX, ngayNhap, loai;
        float donGia;
        int soLuongTon, thoiGianBaoHang, n;

        OUTER:
        while (true) {
            System.out.println("Menu:\n1:Dien may\n2:Thuc pham\n3:Gia dung\n");
            n = scan.nextInt();
            String t = scan.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Nhap ma hang: ");
                    maHang = scan.nextLine();
                    if (maHang.equals("")) {
                        break OUTER;
                    }
                    System.out.println("Nhap ten hang: ");
                    tenHang = scan.nextLine();
                    System.out.println("Nhap so luong ton: ");
                    soLuongTon = scan.nextInt();
                    System.out.println("Nhap don gia: ");
                    donGia = scan.nextFloat();
                    t = scan.nextLine();
                    //
                    System.out.println("Nhap thuong hieu: ");
                    thuongHieu = scan.nextLine();
                    System.out.println("Nhap loai may: ");
                    loaiMay = scan.nextLine();
                    System.out.println("Nhap thoi gian bao hanh: ");
                    thoiGianBaoHang = scan.nextInt();
                    hanghoa.add(new DienMay(thuongHieu, loaiMay, thoiGianBaoHang, maHang, tenHang, donGia, soLuongTon));
                    break;
                case 2:
                    System.out.println("Nhap ma hang: ");
                    maHang = scan.nextLine();
                    if (maHang.equals("")) {
                        break OUTER;
                    }
                    System.out.println("Nhap ten hang: ");
                    tenHang = scan.nextLine();
                    System.out.println("Nhap so luong ton: ");
                    soLuongTon = scan.nextInt();
                    System.out.println("Nhap don gia: ");
                    donGia = scan.nextFloat();
                    t = scan.nextLine();
                    //
                    System.out.println("Nhap ngay san xuat (dd/mm/yyyy): ");
                    ngaySX = scan.nextLine();
                    System.out.println("Nhap ngay het han (dd/mm/yyyy): ");
                    ngayHH = scan.nextLine();
                    System.out.println("Nhap nha cung cap: ");
                    nhaCungCap = scan.nextLine();
                    hanghoa.add(new ThucPham(ngaySX, ngayHH, nhaCungCap, maHang, tenHang, donGia, soLuongTon));
                    break;
                case 3:
                    System.out.println("Nhap ma hang: ");
                    maHang = scan.nextLine();
                    if (maHang.equals("")) {
                        break OUTER;
                    }
                    System.out.println("Nhap ten hang: ");
                    tenHang = scan.nextLine();
                    System.out.println("Nhap so luong ton: ");
                    soLuongTon = scan.nextInt();
                    System.out.println("Nhap don gia: ");
                    donGia = scan.nextFloat();
                    t = scan.nextLine();
                    //
                    System.out.println("Nhap nha san xuat: ");
                    nhaSX = scan.nextLine();
                    System.out.println("Nhap ngay nhap vao sieu thi: ");
                    ngayNhap = scan.nextLine();
                    System.out.println("Nhap loai hang gia dung: ");
                    loai = scan.nextLine();
                    hanghoa.add(new GiaDung(nhaSX, ngayNhap, loai, maHang, tenHang, donGia, soLuongTon));
                    break;
                default:
                    break;
            }
        }
    }

    public void xuatDanhGia() {
        for (int i = 0; i < hanghoa.size(); i++) {
            System.out.println(hanghoa.get(i));
        }
    }

    public void DienMayBanDuoc() {
        int flag = 0;
        for (int i = 0; i < hanghoa.size(); i++) {
            if (hanghoa.get(i).getLoaiHH() == 1) {
                if(hanghoa.get(i).danhGia().equals("Ban duoc")){
                    hanghoa.get(i).xuatBanDuoc();
                    flag += 1;
                }
            }
        }
        if (flag == 0){
            System.out.println("Khong co hang hoa nao ban duoc");
        }
    }
    public static void main(String[] args) throws ParseException {
        cau_2 bai2 = new cau_2();
        bai2.nhapMang();
        System.out.println("Xuat danh gia: ");
        bai2.xuatDanhGia();
        System.out.println("Xuat dien may ban duoc: ");
        bai2.DienMayBanDuoc();
    }
}
