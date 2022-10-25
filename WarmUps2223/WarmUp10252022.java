package WarmUps2223;

import java.util.ArrayList;
import java.util.Collection;

public class WarmUp10252022
{
    public static void main(String[] args)
    {
        String[] emails = {"aaaa@gmail.com", "bbbbb@yahoo.com", "ccccc@hotmail.com", "dddd@outlook.com", "eeee@yahoo.com", "ffff@hotmail.com", "gggg@outlook.com"};


        ArrayList<String> gmailList = new ArrayList<>();

        for(int i = 0; i<emails.length; i++)
        {
            if(emails[i].contains("gmail"))
            {
                System.out.println(emails[i]);
            }
        }
    }
}
