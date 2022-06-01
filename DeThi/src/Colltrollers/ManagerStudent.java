package Colltrollers;

import ReadAndWrite.ReadAndWrite;
import models.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerStudent {
    ArrayList<Student> students=new ArrayList<>();
    ReadAndWrite readAndWrite=new ReadAndWrite();
    Scanner sc=new Scanner(System.in);
    public void menu(){


        while (true){
        System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN----");
        System.out.println("Chọn chức năng theo số(để tiếp tục");
        System.out.println("1. Xem danh sách sinh viên");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Dọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                for (Student s:students
                     ) {
                    System.out.println(s.toString());
                }
                break;
            case 2:
                addSV();
                break;
            case 3:
                update();
                break;
            case 4:
                remove();
                break;
            case 5:
                sortById();
                break;
            case 6:
                System.out.println(readAndWrite.read(students));
                break;
            case 7:
                readAndWrite.write(students);
                break;
            case 8:
                System.exit(1);
        }
    }
    }
    public void addSV(){
        System.out.println("Nhập Mã Sinh Viên");
        int msv=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập họ tên");
        String name=sc.nextLine();
        System.out.println("Nhập tuổi");
        int age=Integer.parseInt(sc.nextLine());
        System.out.println("Giới Tính: ");
        String gender=sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address=sc.nextLine();
        System.out.println("Nhập điểm trung bình");
        double markavg= Double.parseDouble(sc.nextLine());
        students.add(new Student(msv,name,age,gender,address,markavg));
    }
    public void update() {
        System.out.println("Nhập mã sinh viên cần sửa: ");
        int msv = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Mã Sinh Viên");
        int msv1=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập họ tên");
        String name=sc.nextLine();
        System.out.println("Nhập tuổi");
        int age=Integer.parseInt(sc.nextLine());
        System.out.println("Giới Tính: ");
        String gender=sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address=sc.nextLine();
        System.out.println("Nhập điểm trung bình");
        double markavg= Double.parseDouble(sc.nextLine());
        Student student = new Student(msv1,name,age,gender,address,markavg);
        for (int i = 0; i < students.size(); i++) {
            if (msv==students.get(i).getMsv()){
                students.set(i,student);
            }

        }
    }
    public void remove(){
        System.out.println("Nhập mã sinh viên bạn muốn xóa");
        int id=Integer.parseInt(sc.nextLine());
        for (int i = 0; i<students.size() ; i++) {
            if (students.get(i).getMsv()==id){
                students.remove(i);
            }
        }
    }
    public void sortById(){
        students.sort(new SortById1());
    }

}
