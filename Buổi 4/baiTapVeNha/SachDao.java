/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapVeNha;

import java.awt.List;
import java.util.ArrayList;
/**
 *
 * @author phuon
 */
public class SachDao {
    ArrayList<Sach> list;
    
    public SachDao(){
        this.list = new ArrayList<>();
        list.add(new Sach("1", "Toi di hoc", 50000, "Tuoi tre", "Nguyen Ngoc Ky"));
        list.add(new Sach("2", "Nha Gia Kim", 70000, "Tuoi tre", "Paulo  Coelho"));
        list.add(new Sach("3", "Dac Nhan Tam", 165000, "Tuoi tre", "Dale Carnegie"));
        list.add(new Sach("4", "Doremon", 15000, "Tuoi tre", "Fujiko"));
    }
    
    public int count(){
        return list.size();
    }
    
    public ArrayList<Sach> getAllSach(){
        return list;
    }

    
    public Sach find(String id){
        for(Sach sach : list){
            if (sach.getMaSach().equalsIgnoreCase(id)){
                return sach;
            }
        }
        return null;
    }
    
    public int add(Sach sach) {
        Sach s_find = find(sach.getMaSach());
        if(s_find == null){
            list.add(sach);
            return 1;
        }
        return -1;
    }
    
    public int del(String id){
        Sach s = find(id);
        if(s!= null){
            list.remove(s);
            return 1;
        }
        return -1;
    }
    
    public Sach getSachAtPoint(int position){
        return list.get(position);
    }
    
    public int edit(Sach s){
        for(Sach sach : list){
            if(sach.getMaSach().equalsIgnoreCase(s.getMaSach())){
                sach.setTenSach(s.getTenSach());
                sach.setGia(s.getGia());
                sach.setTacGia(s.getTacGia());
                sach.setNhaXuatBan(s.getNhaXuatBan());
                return 1;
            }
        }
        return -1;
    }
}
