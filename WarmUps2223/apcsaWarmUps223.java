package WarmUps2223;

import java.util.Scanner;

public class apcsaWarmUps223
{
    public static void main(String[] args) {
        // Redo the project Calculator with Switch Case instead of if logical statements.

        System.out.println("Welcome to calculator Please select the operator");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();

        System.out.println("enter your two integer");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        switch (operator)
        {
            case "+":
                System.out.println("result = "+(number1+number2));
                break;
            case "-":
                System.out.println("result = "+(number1-number2));
                break;
            case "/":
                System.out.println("result = "+(number1/number2));
                break;
            case "*":
                System.out.println("result = "+(number1*number2));
                break;
            default:
        }
    }

    public static class DoNow10062022
    {
        public static void main(String[] args) {

        }
    }
}
