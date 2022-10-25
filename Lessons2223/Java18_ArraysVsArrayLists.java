package Lessons2223;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Java18_ArraysVsArrayLists
{
    public static void main(String[] args)
    {
        int[]arr={1,2,3,4,5,6,7,8,9};

        ArrayList<Integer>list=new ArrayList<>( );

        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        

    }
}
