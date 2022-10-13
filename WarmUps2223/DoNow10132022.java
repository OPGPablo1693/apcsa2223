package WarmUps2223;

import java.util.Scanner;

public class DoNow10132022
{
    public static void main(String[] args) {
        while (true)
        {
            System.out.println("Welcome to my calc to countinue press Enter key to quit press q");
            Scanner scanner2=new Scanner(System.in);
            String q0rC=scanner2.nextLine();
            if(q0rC.equalsIgnoreCase("q"))
            {
                System.exit(0);
            }
            else {}

            System.out.println("Enter first number");
            Scanner scanner=new Scanner(System.in);
            int firstNumber=scanner.nextInt();
            System.out.println("enter the second number");
            int secondNumber=scanner.nextInt();
            System.out.println("enter the operator + - * / %");
            Scanner scanner1=new Scanner(System.in);
            String operator=scanner1.nextLine();
            if(operator.equals("+")){System.out.println("your result ="+(firstNumber+secondNumber));}
            if(operator.equals("-")){System.out.println("your result ="+(firstNumber+secondNumber));}
            if(operator.equals("*")){System.out.println("your result ="+(firstNumber+secondNumber));}
            if(operator.equals("/")){System.out.println("your result ="+(firstNumber+secondNumber));}



        }
    }
}
