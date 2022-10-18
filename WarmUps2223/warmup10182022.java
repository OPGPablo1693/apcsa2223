package WarmUps2223;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class warmup10182022
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("kris","chris","Nat","Alex"));
        System.out.println(list);
        list.add("nathen");
        list.add("Trent");
        list.add("chris");
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

    }
}
