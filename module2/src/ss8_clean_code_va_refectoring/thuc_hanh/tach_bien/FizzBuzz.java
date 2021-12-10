package ss8_clean_code_va_refectoring.thuc_hanh.tach_bien;

public class FizzBuzz {

    private static boolean isFuzz;
    private static boolean isBuzz;

    public static String fizzBuzz(int number){
        isFuzz = number % 3 == 0;
        isBuzz = number % 5 == 0;

        if(isFuzz && isBuzz)
            return "FizzBuzz";

        if(isFuzz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
