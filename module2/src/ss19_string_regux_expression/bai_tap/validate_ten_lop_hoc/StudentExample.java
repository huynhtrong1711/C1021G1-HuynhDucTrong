package ss19_string_regux_expression.bai_tap.validate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentExample {
    public static Pattern pattern;
    public static Matcher matcher;

    public static final String STUDENT_REGEX = "^[C|P|A][0-9]{4}[G|H|I|K|L|M]$";

    public StudentExample() {
        pattern = Pattern.compile(STUDENT_REGEX);
    }

    public boolean checkClass(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
