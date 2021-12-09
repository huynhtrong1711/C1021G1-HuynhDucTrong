package ss1_introduction_to_Java.bai_tap;

import java.util.Scanner;

public class Number {
    static String zeroComeNine(int number) {
        String string = " ";
        switch (number) {
            case 0:
                string= "Zero";
                break;
            case 1:
                string = "One";
                break;
            case 2:
                string = "Two";
                break;
            case 3:
                string = "There";
                break;
            case 4:
                string = "Four";
                break;
            case 5:
                string = "Five";
                break;
            case 6:
                string = "Six";
                break;
            case 7:
                string= "Seven";
                break;
            case 8:
                string = "Eigth";
                break;
            case 9:
                string = "Nine";
                break;
            case 10:
                string = "Ten";
                break;
        }
        return string;
    }
    static String tenComeNineteen(int number){
        String  string = " ";
        switch (number){
            case 11:
                string = "Eleven";
                break;
            case 12:
                string = "Twelve";
                break;
            case 13:
                string = "Thirteen";
                break;
            case 14:
                string = "Fourteen";
                break;
            case 15:
                string = "Fifteen";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                int donvi = number % 10;
                string = zeroComeNine(donvi) +"teen";
                break;
        }
        return string;
    }
    static String twentyComeNinety(int number){
        String string = " ";
        switch (number){
            case 20:
                string = "Twenty";
                break;
            case 30:
                string = "Thirty";
                break;
            case 40:
                string = " Fourty";
                break;
            case 50:
                string = "Fifty";
                break;
            case 60:
            case 70:
            case 80:
            case 90:
                int chuc = number / 10;
                string = zeroComeNine(chuc) + "ty";
                break;
        }
        return string;

    }
    public static void main(String[] args) {
        Number num = new Number();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number > 0 && number <= 10){
            String result = num.zeroComeNine(number);
            System.out.println(result);
        }else if (number > 10 && number < 20){
            String result = num.tenComeNineteen(number);
            System.out.println(result);
        }else{
            int chuc =(number / 10) *10;
            int donvi = number % 10;
            String result = num.twentyComeNinety(chuc) + " " + num.zeroComeNine(donvi);
            System.out.println(result);
        }

    }
}
