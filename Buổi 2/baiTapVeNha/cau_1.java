/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapVeNha;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
class KinhDoanh {

    String maKH, tenKH, ngayHD;
    float soLuongDien, donGia;
    int loaiKH;

    public KinhDoanh() {
        loaiKH = 2;
    }

    public KinhDoanh(String maKH, String tenKH, String ngayHD, float soLuongDien, float donGia) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngayHD = ngayHD;
        this.soLuongDien = soLuongDien;
        this.donGia = donGia;
        this.loaiKH = 2;
    }

    public int getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(int loaiKH) {
        this.loaiKH = loaiKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public float getSoLuongDien() {
        return soLuongDien;
    }

    public void setSoLuongDien(float soLuongDien) {
        this.soLuongDien = soLuongDien;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "KinhDoanh{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", soLuongDien=" + soLuongDien + ", thanhTien=" + thanhTien() + '}';
    }

    public float thanhTien() {
        if (soLuongDien <= 400) {
            return soLuongDien * donGia;
        } else {
            return (float) (soLuongDien * donGia * 0.05);
        }
    }
}

class SinhHoat extends KinhDoanh {

    float dinhMuc;

    public SinhHoat(float dinhMuc) {
        this.loaiKH = 1;
    }

    public SinhHoat(float dinhMuc, String maKH, String tenKH, String ngayHD, float soLuongDien, float donGia) {
        super(maKH, tenKH, ngayHD, soLuongDien, donGia);
        this.dinhMuc = dinhMuc;
        this.loaiKH = 1;
    }

    @Override
    public int getLoaiKH() {
        return loaiKH;
    }

    @Override
    public void setLoaiKH(int loaiKH) {
        this.loaiKH = loaiKH;
    }

    public float getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public float thanhTien() {
        if (soLuongDien <= dinhMuc) {
            return soLuongDien * donGia;
        } else {
            return soLuongDien * donGia * dinhMuc + (soLuongDien - dinhMuc) * donGia * 2;
        }
    }
}

class LoaiDien {

    int loaiDien;
    String tenLoaiDien;
// 1: hai pha ----- 2: ba pha

    public LoaiDien(int loaiDien) {
        this.loaiDien = loaiDien;
        if (this.loaiDien == 1) {
            this.tenLoaiDien = "hai pha";
        } else {
            this.tenLoaiDien = "ba pha";
        }
    }

    public int getLoaiDien() {
        return loaiDien;
    }

    public void setLoaiDien(int loaiDien) {
        this.loaiDien = loaiDien;
    }

    public String getTenLoaiDien() {
        return tenLoaiDien;
    }

    public void setTenLoaiDien(String tenLoaiDien) {
        this.tenLoaiDien = tenLoaiDien;
    }

    @Override
    public String toString() {
        return "LoaiDien{" + "loaiDien=" + loaiDien + ", tenLoaiDien=" + tenLoaiDien + '}';
    }
}

class SanXuat extends KinhDoanh {

    LoaiDien loaiDien;

    public SanXuat() {
    }

    public SanXuat(int loaiDien, String maKH, String tenKH, String ngayHD, float soLuongDien, float donGia) {
        super(maKH, tenKH, ngayHD, soLuongDien, donGia);
        this.loaiDien = new LoaiDien(loaiDien);
    }

    @Override
    public int getLoaiKH() {
        return loaiKH;
    }

    @Override
    public void setLoaiKH(int loaiKH) {
        this.loaiKH = loaiKH;
    }

    public LoaiDien getLoaiDien() {
        return loaiDien;
    }

    public void setLoaiDien(LoaiDien loaiDien) {
        this.loaiDien = loaiDien;
    }

    @Override
    public float thanhTien() {
        if (this.loaiDien.getLoaiDien() == 1) {
            if (soLuongDien <= 200) {
                return soLuongDien * donGia;
            } else {
                return (float) (soLuongDien * donGia * (0.98));
            }
        } else {
            if (soLuongDien <= 150) {
                return soLuongDien * donGia;
            } else {
                return (float) ((0.97) * soLuongDien * donGia);
            }
        }
    }
}

public class cau_1 {

    static ArrayList<KinhDoanh> khachHang = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public boolean checkNgayHoaDon(String ngay) {
        // dd-mm-yyyy
        // 0123456789
        int date = Integer.parseInt(ngay.substring(0, 2));
        System.out.println(date);
        int month = Integer.parseInt(ngay.substring(3, 5));
        System.out.println(month);
        int year = Integer.parseInt(ngay.substring(6));
        System.out.println(year);
        if (month < 1 || month > 12) {
            return false;
        } else {
            //1 3 5 7 8 10 12
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (date < 1 || date > 31) {
                        return false;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (date < 1 || date > 30) {
                        return false;
                    }
                    break;
                default:
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        if (date < 1 || date > 29) {
                            return false;
                        }
                    } else {
                        if (date < 1 || date > 28) {
                            return false;
                        }
                    }
                    break;
            }
        }
        return true;
    }

    public boolean checkCungTenCungMa(String ma, String ten, String ngay) {
        for (int i = 0; i < khachHang.size(); i++) {
            if (khachHang.get(i).getLoaiKH() == 3 && khachHang.get(i).getMaKH().equals(ma) && khachHang.get(i).getTenKH().equals(ten)) {
                if (khachHang.get(i).getNgayHD().equals(ngay)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void nhapMang() {
        String maKH, tenKH, ngayHD;
        float soLuongDien, donGia, dinhMuc;
        int loaiKH, loaiD;
        OUTER:
        while (true) {
            System.out.println("Menu dien: \n1:Dien sinh hoat\n2:Dien kinh danh\n3:Dien san xuat\n");
            System.out.println("Nhap loai dien: ");
            loaiKH = scan.nextInt();
            String t = scan.nextLine();
            switch (loaiKH) {
                case 1:
                     {
                        System.out.println("Nhap ma khach hang: ");
                        maKH = scan.nextLine();
                        if (maKH.equals("")) {
                            break OUTER;
                        }
                        System.out.println("Nhap ten khach hang");
                        tenKH = scan.nextLine();
                        System.out.println("Nhap ngay hoa don (dd/mm/yyyy): ");
                        ngayHD = scan.nextLine();
                        if (!checkNgayHoaDon(ngayHD)) {
                            System.out.println("Ngay khong hop le. Nhap lai tu dau");
                        } else {
                            System.out.println("Nhap so luong dien: ");
                            soLuongDien = scan.nextFloat();
                            System.out.println("Nhap don gia: ");
                            donGia = scan.nextFloat();
                            System.out.println("Nhap dinh muc: ");
                            dinhMuc = scan.nextFloat();
                            khachHang.add(new SinhHoat(dinhMuc, maKH, tenKH, ngayHD, soLuongDien, donGia));
                        }
                        break;
                    }
                case 2:
                     {
                        System.out.println("Nhap ma khach hang: ");
                        maKH = scan.nextLine();
                        if (maKH.equals("")) {
                            break OUTER;
                        }
                        System.out.println("Nhap ten khach hang");
                        tenKH = scan.nextLine();
                        System.out.println("Nhap ngay hoa don (dd/mm/yyyy): ");
                        ngayHD = scan.nextLine();
                        if (!checkNgayHoaDon(ngayHD)) {
                            System.out.println("Ngay khong hop le. Nhap lai tu dau");
                        } else {
                            System.out.println("Nhap so luong dien: ");
                            soLuongDien = scan.nextFloat();
                            System.out.println("Nhap don gia: ");
                            donGia = scan.nextFloat();
                            khachHang.add(new KinhDoanh(maKH, tenKH, ngayHD, soLuongDien, donGia));
                        }
                        break;
                    }
                case 3:
                     {
                        System.out.println("Nhap ma khach hang: ");
                        maKH = scan.nextLine();
                        if (maKH.equals("")) {
                            break OUTER;
                        }
                        System.out.println("Nhap ten khach hang");
                        tenKH = scan.nextLine();
                        System.out.println("Nhap ngay hoa don (dd/mm/yyyy): ");
                        ngayHD = scan.nextLine();
                        if (!checkNgayHoaDon(ngayHD)) {
                            System.out.println("Ngay khong hop le. Nhap lai tu dau");
                        } else {
                            System.out.println("Nhap so luong dien: ");
                            soLuongDien = scan.nextFloat();
                            System.out.println("Nhap don gia: ");
                            donGia = scan.nextFloat();
                            System.out.println("Menu loai dien: \n1: Hai pha\n2:Ba pha\n");
                            System.out.println("Nhap loai dien: ");
                            loaiD = scan.nextInt();
                            if (!checkCungTenCungMa(maKH, tenKH, ngayHD)) {
                                khachHang.add(new SanXuat(loaiD, maKH, tenKH, ngayHD, soLuongDien, donGia));
                            }
                        }
                        break;
                    }
            }
        }
    }

    public void xuatHoaDon(int thang, int nam) {
        for (int i = 0; i < khachHang.size(); i++) {
            int b = Integer.parseInt(khachHang.get(i).getNgayHD().substring(3, 5));
            System.out.println(b);
            int c = Integer.parseInt(khachHang.get(i).getNgayHD().substring(6));
            System.out.println(c);
            if (b == thang && c == nam) {
                System.out.println(khachHang.get(i));
            }
        }
    }

    public static void main(String[] args) {
        cau_1 bai1 = new cau_1();
        //khachHang.add(new KinhDoanh("1", "a", "24/10/2001", 1234, 321));
        //bai1.xuatHoaDon(10, 2001);

        bai1.nhapMang();
        int thang, nam, n;

        while (true) {
            System.out.println("Menu:\n1:Xet thang, nam\n2:Thoat:");
            n = scan.nextInt();
            if (n == 1) {
                System.out.println("Nhap thang: ");
                thang = scan.nextInt();
                System.out.println("Nhap nam: ");
                nam = scan.nextInt();
                bai1.xuatHoaDon(thang, nam);
            } else {
                break;
            }
        }

    }
}
