import Manager.QuanLyDanhBa;
import Modul2.DanhBa;
import Modul2.DanhBaFile;
import Validate.EmailValidate;
import Validate.NumberValidate;

import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        QuanLyDanhBa qldb=new QuanLyDanhBa();

        NumberValidate numberValidate=new NumberValidate();
        EmailValidate emailValidate=new EmailValidate();
        Scanner scanner =new Scanner(System.in);
        int choice=0;
        String select;
        do {
            System.out.println("------ MENU-------");
            System.out.println("1: Thêm danh bạ");
            System.out.println("2: Hiển thị danh bạ");
            System.out.println("3: Tìm kiếm người dùng qua số điện thoại");
            System.out.println("4: Sửa thông tin người dùng");
            System.out.println("5: xoá thông tin qua số điện thoại");
            System.out.println("6: truyen thông tin len file");
            System.out.println("7: doc thông tin tu file");
            System.out.println("8: thoat");

            try {
                choice = scanner.nextInt();
//      bắt ngoại lệ1
            } catch (InputMismatchException a) {
                System.out.println("nhập sai , trở lại menu");
                scanner.nextLine();
            }
            if(choice==1){
//    thêm danh bạ
                System.out.println("nhập số điên thoại ");
                scanner.nextLine();
                String soDt=scanner.nextLine();
                System.out.println("nhập ngày sinh");
                int day= scanner.nextInt();
                System.out.println("nhập tháng sinh");
                int motlh= scanner.nextInt();
                System.out.println("nhập năm sinh");
                int year= scanner.nextInt();
                scanner.nextLine();
                System.out.println("nhập tên");
                String name=scanner.nextLine();
                System.out.println("nhập nhóm");
                String group=scanner.nextLine();
                System.out.println("nhập giới tính");
                String sex=scanner.nextLine();
                System.out.println("nhập địa chỉ");
                String address=scanner.nextLine();
                System.out.println("nhập email");
                String email=scanner.nextLine();

                qldb.add(new DanhBa(soDt, LocalDate.of(year,motlh,day),name,group,sex,address,email));
            }

            else if(choice==2){
//        hiển thị
                qldb.display();
            }
            else if(choice==3){
//tìm kiếm
                System.out.println("nhập số điên thoại");
                String soDt=scanner.nextLine();
                qldb.seach(soDt);
            }
            else if(choice==4){
//    sửa
                System.out.println("nhập số điên thoại");
                String soDt1=scanner.nextLine();
                System.out.println("nhập số điên thoại");
                String soDt=scanner.nextLine();
                System.out.println("nhập ngày sinh");
                int day= scanner.nextInt();
                System.out.println("nhập tháng sinh");
                int motlh= scanner.nextInt();
                System.out.println("nhập năm sinh");
                int year= scanner.nextInt();
                scanner.nextLine();
                System.out.println("nhập tên");
                String name=scanner.nextLine();
                System.out.println("nhập nhóm");
                String group=scanner.nextLine();
                System.out.println("nhập giới tính");
                String sex=scanner.nextLine();
                System.out.println("nhập địa chỉ");
                String address=scanner.nextLine();
                System.out.println("nhập email");
                String email=scanner.nextLine();
                DanhBa danhBa=new DanhBa(soDt,LocalDate.of(year,motlh,day),name,group,sex,address,email);
                qldb.edit(soDt1,danhBa);
                do {
                    System.out.print("Bạn muốn sửa tiếp không (y/n): ");
                    select = scanner.nextLine();
                } while (!(select.equals("n") || select.equals("y")));
            }
            else if ((choice==5)){
//      xoa
                System.out.println("nhập số điên thoại");
                String soDt1=scanner.nextLine();
                qldb.delete(soDt1);
            }
            else if(choice==6){

                DanhBaFile.writeToFile("test.csv",qldb.getDanhBaList());
            }
            else if (choice==7){
                DanhBaFile.list("test.csv");
            }

        }while (choice!=8);

    }
}
