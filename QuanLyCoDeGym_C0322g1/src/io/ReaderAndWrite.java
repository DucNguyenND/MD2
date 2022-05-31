package io;

import models.ClassCG;
import models.Student;

import java.io.*;
import java.util.ArrayList;

public class ReaderAndWrite implements Serializable {
    File file = new File("student.csv");
    public void write(ArrayList<Student> students) {

        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(students);
           objectOutputStream.close();
           fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> reader(ArrayList<ClassCG> classCGs) {
        ArrayList<Student> students = new ArrayList<>();
//        File file = new File("student.csv");
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            ObjectInputStream objectOutputStream=new ObjectInputStream(fileInputStream);
            objectOutputStream.read();
            objectOutputStream.close();
            fileInputStream.close();
        }catch (IOException e) {
            System.err.println("File không có dữ liệu");
        }
        return students;
    }
}
