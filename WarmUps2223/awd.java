package WarmUps2223;

import java.util.Scanner;

public class awd
{
    public static void main(String[] args) {
        //write a java program that can convert numbers between 0-9 to words;
        //if the number is greater that 9 or less than 0,out put should be "Invalid"
        Scanner scanner=new Scanner(System.in);
        System.out.println("give me a number 0-9 to convert");
        int num = scanner.nextInt();
        if (num==0){
            System.out.println("zero");
        }
        else if (num == 1) {
            System.out.println("one");
        }else if (num==2){
            System.out.println("two");
        }
        else if (num==3){
            System.out.println("three");
        }

    }
}
