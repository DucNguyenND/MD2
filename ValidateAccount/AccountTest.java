package ValidateAccount;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountExample accountExample = new AccountExample();
        while (true) {
            System.out.println("Nhập account:");
            if (accountExample.validate(sc.nextLine())) {
                System.out.println("Account hợp lệ");
                System.exit(1);
            } else
                System.err.println("Account không hợp lệ");
        }
    }
}
