package Lessons2223;

public class Java4_RelationalComparisonOperators
{
    public static void main(String[] args)
    {
        //REALATIONAL/COMPARISON OPERATORS
        /*
        All realtional operators return Boolean(true or false)
          Description              operator
            >                   Greater then
            >=                  Greater then or equal
            <                   Less than
            <=                  Less than or equal
            ==                  Equal
            !=                  Not Equal
         */
        System.out.println(6>3);
        System.out.println(6<3);
        System.out.println(6>=3);
        System.out.println(6<=3);
        System.out.println(6==3);
        System.out.println(6!=3);
        /*
       Task
Delcare and Initialize 2 numbers.
Program should display if the number is greater than second number
Output should be in the following format:
"First number number is greater than Second number-True/False"
         */
        int b; // declaration
        b=5; // assigning a value, initialize
        int a = 3; // declaring and initializing


        System.out.println("First number is greater than second number "+ (b>a));

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false|false);

        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);

    }
}
