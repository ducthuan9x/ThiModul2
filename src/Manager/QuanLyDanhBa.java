package Manager;

import Modul2.DanhBa;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDanhBa {
    List<DanhBa> danhBaList=new ArrayList<DanhBa>();

    public QuanLyDanhBa() {
    }

    public QuanLyDanhBa(List<DanhBa> danhBaList) {
        this.danhBaList = danhBaList;
    }

    public List<DanhBa> getDanhBaList() {
        return danhBaList;
    }

    public void setDanhBaList(List<DanhBa> danhBaList) {
        this.danhBaList = danhBaList;
    }

    public void add(DanhBa danhBa){
        this.danhBaList.add(danhBa);
    }

    public void display(){
        for (int i = 0; i < danhBaList.size(); i++) {
            System.out.println(this.danhBaList.get(i));
        }
    }
    public int seach(String number){
        for (int i = 0; i < danhBaList.size(); i++) {
            if(danhBaList.get(i).getNumber().equals(number)){
                System.out.println(danhBaList.get(i));
                return i;
            }
        }
        return -1;
    }
    public void edit(String number,DanhBa danhBa){
        int indexOf=seach(number);
        if(indexOf==-1){
            System.out.println("ko tìm thấy người dùng qua sdt này ");
        }
        else{
            danhBaList.set(indexOf,danhBa);
        }
    }
    public void delete(String number){
        int indexOf=seach(number);
        if(indexOf==-1){
            System.out.println("ko tìm thấy người dùng qua sdt này ");
        }
        else{
            danhBaList.remove(indexOf);
        }
    }
}
