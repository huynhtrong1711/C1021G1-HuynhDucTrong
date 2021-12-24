package ss19_string_regux_expression.thuc_hanh.validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validateTest = {"a@gmail.com", "ba@gmail.com", "art@yahoo.com"};
    public static final String[] validate = {"@gmail.com", "a@gmail.", "@#*av@gmail.com"};
    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validateTest) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is: " + email + " is valid: " + isvalid);
        }

        for (String emails : validate) {
            boolean isvalidate = emailExample.validate(emails);
            System.out.println("Email is: " + emails + " is valid: " + isvalidate);
        }
    }
}
