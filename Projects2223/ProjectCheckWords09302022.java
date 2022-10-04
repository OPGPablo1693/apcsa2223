package Projects2223;

import java.util.Scanner;

public class ProjectCheckWords09302022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 3 word");
        String wrd1 = scanner.nextLine();
        String wrd2 = scanner.nextLine();
        String wrd3 = scanner.nextLine();

        if (wrd1.length() == wrd2.length()&&wrd2.length() == wrd3.length())
        {
            System.out.println("they have the same length");
        }
        else
        {
            System.out.println("They are not the same length ");
        }
    }
}
