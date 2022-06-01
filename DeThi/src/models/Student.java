package models;

import java.io.Serializable;

public class Student implements Serializable {
    private int msv;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double markavg;

    public Student(int msv, String name, int age, String gender, String address, double markavg) {
        this.msv = msv;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.markavg = markavg;
    }

    public int getMsv() {
        return msv;
    }

    public double getMarkavg() {
        return markavg;
    }

    public void setMarkavg(double markavg) {
        this.markavg = markavg;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  msv + "," + name + "," + gender+","+
                age + "," + address + "," + markavg;
    }

}
