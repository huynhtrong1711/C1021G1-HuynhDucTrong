package ss19_string_regux_expression.thuc_hanh.validate_account;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = { "123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String[] invalidAcc = {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String acc : validAccount) {
            boolean isvalid = accountExample.validate(acc);
            System.out.println("Account is: " + acc + " is valid: " + isvalid);
        }
        for (String account : invalidAcc) {
            boolean isvalidAcc = accountExample.validate(account);
            System.out.println("Account is: " + account + " is valid: " + isvalidAcc);
        }
    }

}
