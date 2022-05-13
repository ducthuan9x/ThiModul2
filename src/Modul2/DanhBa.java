package Modul2;

import java.time.LocalDate;

public class DanhBa {
    private String number;
    private LocalDate dateOfBritd;
    private String name, group, sex, address, email;


    public DanhBa() {
    }

    public DanhBa(String number, LocalDate dateOfBritd, String name, String group, String sex, String address, String email) {
        this.number = number;
        this.dateOfBritd = dateOfBritd;
        this.name = name;
        this.group = group;
        this.sex = sex;
        this.address = address;
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String soDt) {
        this.number = soDt;
    }

    public LocalDate getDateOfBritd() {
        return dateOfBritd;
    }

    public void setDateOfBritd(LocalDate dateOfBritd) {
        this.dateOfBritd = dateOfBritd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return number+","+dateOfBritd+","+name +","+ group +","+ sex +","+ address +","+ email +"\n";
    }
}
