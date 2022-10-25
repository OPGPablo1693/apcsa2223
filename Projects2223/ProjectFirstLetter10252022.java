package Projects2223;

import java.util.Scanner;

public class ProjectFirstLetter10252022
{
    public static void main(String[] args) {
        String str="harmony";
        System.out.println(str.substring(0,3));
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 5 string");
        String str1 =scanner.nextLine();
        String str2 =scanner.nextLine();
        String str3 =scanner.nextLine();
        String str4 =scanner.nextLine();
        String str5 =scanner.nextLine();
        String[]arr={str1,str2,str3,str4,str5};
        for(int i =0;i< arr.length;i++)
        {
            System.out.println(arr[i].substring(0,3));
        }

    }
}
