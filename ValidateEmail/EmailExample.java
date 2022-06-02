package ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String Email_Regex= "[0-9a-zA-z.]+@[a-z]+(\\.[a-z]+)$";
    public EmailExample(){
        pattern=Pattern.compile(Email_Regex);
    }
    public boolean valiDate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
