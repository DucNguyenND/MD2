package IO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateProduct {
    private static String _regex="[0-9]";
    public static boolean validate(String regex, String regex1) {
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
//    public static boolean validatechoicemenu(String regex){
//        return validate(regex,choicemenu_regex);
//    }
}
