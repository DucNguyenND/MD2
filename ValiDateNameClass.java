import java.util.Scanner;
import java.util.regex.Pattern;

public class ValiDateNameClass {
    private static String nameClass_REGEX="^[CAP][0-9]{4}[GHIKLM]$";
    public static boolean validate(String regex){
        Pattern pattern=Pattern.compile(nameClass_REGEX);
        return pattern.matcher(regex).matches();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên lớp:");
        if (validate(sc.nextLine())){
            System.out.println("OK!");
        }else System.err.println("Sai mẹ rồi!");
    }
}
