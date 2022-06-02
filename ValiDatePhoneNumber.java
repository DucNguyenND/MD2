import java.util.Scanner;
import java.util.regex.Pattern;

public class ValiDatePhoneNumber {
    public static Scanner sc=new Scanner(System.in);
    private static final String phoneNumber_REGEX="\\([0-9]{2}\\)\\-\\(0[0-9]{9}\\)";
    public static boolean validate(String regex){
        Pattern pattern= Pattern.compile(phoneNumber_REGEX);
        return pattern.matcher(regex).matches();
    }

    public static void main(String[] args) {
        System.out.println("Nhập số điện thoại:");
        if (validate(sc.nextLine())){
            System.out.println("Đúng rồi!");
        } else System.err.println("Sai mẹ rồi");
    }
}
