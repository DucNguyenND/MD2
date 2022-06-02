package ValidateEmail;

import java.util.Scanner;

public class EmailExampleTest {


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập vào Email của bạn:");
        String email=sc.nextLine();
        EmailExample emailExample=new EmailExample();
        if (emailExample.valiDate(email)){
            System.out.println( "Email " + email + " là Email hợp lệ");
        }else System.out.println("Email " + email + " không phải là Email hợp lệ");
    }
}
