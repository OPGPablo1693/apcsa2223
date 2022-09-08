package Lessons2223;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Java9_TernaryOperator
{
    public static void main(String[] args)
    {
        // ternary operator only works on question like yes or no
        // it is kind of if statement only works with to ways.
       int n1=5,n2=10,max;

        System.out.println("First num:"+n1);
        System.out.println("Second num"+n2);

        //Largest among n1 and n2
        max=(n1>n2)?n1:n2;

        //print the largest number
        System.out.println("enter a number to check if it greater than 50");
        // write an tenary statement if a user input number is greater than 50;
        Scanner scanner=new Scanner(System.in);
        int a =scanner.nextInt();
        String g ="number is greater than 50";
        String gnot="number is not greater than 50";

    }
}