package Lessons2223;

public class Java12_StringPool09292002
{
    public static void main(String[] args) {
        String str1 = "Hello World";
        String st2 = new String("Hello World 2");
        String str = "chris";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));

        System.out.println(str.length());
        System.out.println("chris".length());




        String str4 = "chris";

        {
            System.out.println(str4.toLowerCase());
            System.out.println(str4.toUpperCase());

            String str6 = "chris";
            System.out.println(str6.substring(0, 3));
            System.out.println(str6.substring(3, 6));
            System.out.println(str6.substring(5, 9));

            String st7 = "sevenelven";
            {
                System.out.println(str.replace("e","a"));
                System.out.println(str.replace("e",""));

                System.out.println(str6.replaceFirst("e","i"));

                String str8="chris";

            }
        }
    }
}
