package Projects2223;

import java.util.Scanner;

public class ProjectReverseString
{
    public class projectMultiplactionTable
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give me a number and i'll give you the multiplication table");
            int num = scanner.nextInt();

            for(int i = 1 ; i<=num ; i++){
                System.out.println(i*num);
            }
        }
    }

}
