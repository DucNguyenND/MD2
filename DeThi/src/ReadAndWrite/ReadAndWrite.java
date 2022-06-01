package ReadAndWrite;

import models.Student;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite {

    public ArrayList<Student> read(ArrayList<Student> students){
        File file=new File("Hssv.txt");
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(",");
                int msv = Integer.parseInt(arr[0]);
                String name= arr[1];
                String gender=arr[2];
                int age = Integer.parseInt(arr[3]);
                String address = arr[4];
                double markavg = Double.parseDouble(arr[5]);
                students.add(new Student(msv,name,age,gender,address,markavg));
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
    public void write(ArrayList<Student> students) {
        File file = new File("Hssv.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student s : students) {
                bufferedWriter.write(s.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
