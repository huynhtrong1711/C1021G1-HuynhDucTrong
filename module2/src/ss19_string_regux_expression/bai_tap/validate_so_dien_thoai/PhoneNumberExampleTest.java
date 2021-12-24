package ss19_string_regux_expression.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại của bạn: (xx)-(0xxxxxxxxx)");
        String number = scanner.nextLine();
        boolean isvalid = phoneNumberExample.validate(number);
        if (isvalid) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
}
