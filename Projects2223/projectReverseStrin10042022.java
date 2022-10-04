package Projects2223;

public class projectReverseStrin10042022
{
    public static void main(String[] args) {
        String str="java";
        String reversedStr ="";
        String reversedStr2="";

        for(int i =0;i<str.length(); i++)
        {
            reversedStr+=str.charAt(str.length()-i-1);
        }
        System.out.println(reversedStr);

        for (int i =str.length()-1;i<0;i--)
        {
            reversedStr2+=str.charAt(i);
        }
        System.out.println(reversedStr2);
    }
}
