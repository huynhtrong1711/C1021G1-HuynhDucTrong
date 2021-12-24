package ss19_string_regux_expression.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    public static Pattern pattern;
    public static Matcher matcher;

    private static final String NUMBER_REGEX = "^[0-9]{2}(-)(0)[0-9]{9}$";

    public PhoneNumberExample() {
        pattern = Pattern.compile(NUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
