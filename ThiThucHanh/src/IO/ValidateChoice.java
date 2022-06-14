package IO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateChoice {
    private String choicemenu_regex="[1-9]";
    private String choiceSort_regex="[1-3]";
    public boolean validate(String regex, String regex1) {
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean validatechoicemenu(String regex){
        return validate(regex,choicemenu_regex);
    }
    public boolean validatechoiceSort(String regex){
        return validate(regex,choiceSort_regex);
    }
}
