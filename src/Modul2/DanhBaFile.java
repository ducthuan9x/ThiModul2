package Modul2;

import javax.swing.text.DateFormatter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhBaFile {
    public static void writeToFile(String path,List<DanhBa>danhBaList) throws IOException {
        FileWriter fw=new FileWriter(path);
        BufferedWriter bw=new BufferedWriter(fw);
        String str="number,nam,address,dateOfBritd(),email";
        for (DanhBa db:
                danhBaList) {
            str+=db.getNumber()+" "+ db.getName()+" "+db.getAddress()+" "+db.getDateOfBritd()+" "+db.getEmail()+"\n";
        }
        bw.write(str);
        bw.close();
        fw.close();
    }
    public static List<DanhBa>list(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String count= br.readLine();
        while ((count= br.readLine())!=null){
            System.out.println(count);
        }
        return null;
    }
}
