package ValidateAccount;

import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX="[a-z0-9_]{6,}";
    public AccountExample(){}
    public boolean validate(String regex){
        Pattern pattern=Pattern.compile(ACCOUNT_REGEX);
        return pattern.matcher(regex).matches();
    }
}
