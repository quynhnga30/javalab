package authentication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//check pass , pass chua 7-15 ky tu
//pass chua it nhat 1 ky tu in hoa, 1 ky tu dac biet

public class Validate {
    public static final Pattern EmailRegex = Pattern.compile(
            "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);
    public static final Pattern PasswordRegex = Pattern.compile(
            "(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;]).{7,15}",
            Pattern.CASE_INSENSITIVE);

    public static String validateEmail(String email) {
        Matcher matcher = EmailRegex.matcher(email);
        if (matcher.find()){
            return email;
        }else {
            throw new RuntimeException("Email không hợp lệ ");

        }
    }
    public static String validatePassword(String password) {
        Matcher matcher = PasswordRegex.matcher(password);
        if (matcher.find()){
            return password;
        }else {
            throw new RuntimeException("Password không hợp lệ ");

        }
    }


}
