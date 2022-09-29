package Projects2223;

import java.util.Scanner;

public class ProjectBrowser09202022
{
    public static void main(String[] args) {
        String browserName;
        System.out.println("enter your browsername");
        Scanner scanner = new Scanner(System.in);
        browserName=scanner.nextLine();

        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.out.println("it is vaild brower");
        }
        else if (browserName.equalsIgnoreCase("safari"))
        {
            System.out.println("it is valid browser");
        }
        else
        {
            System.out.println("not a valid browser");
        }


    }
}
