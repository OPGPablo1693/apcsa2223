public class Java3_ArithmeticOperators {
    // if you need to change the class name
    // you can not do it directly
    //use refactor option right-clicking the class name
    public static void main(String[] args) {
        //ARITHMETIC OPERATORS
        // priority is just like the algebra +-*/%
        //     OPERATOR    USE          DECRITPTION               EXAMPLE
        /*
                 +          x+y           add c and y              3+7=10
                 -          x-y           subtracts y from a       12-3=9
                 *          x*y          multiply x and y          3*4=12
                 /          x/y           divide x and y           12/4=3
                 %          x%y          remainder                 8%6=2
                 -          -x           arithmethic negates x      int a =-3, -a=-3;
                 ++         x++          it increases the number by  1   a++
                 --         x--          it dereases the muber by 1      a--
         */
        System.out.println(3 + 7);
        System.out.println(8 - 2);
        System.out.println(4 * 6);
        System.out.println(3 * 2.3);
        int a = 3;
        int b = 5;
        double c = 3;
        double d = 5;

        System.out.println(a + b);//8
        System.out.println(a * b);
        System.out.println(a / b);//it returns only whole number since it is whole number.
        System.out.println(c / d);//it returns decimal number since variables are double

        // CONCATENATION
        // writing different data types within sout. if you put a string it wont be considered as arihthmethic unless
        // you put a math within pharanithsis
        System.out.println("collection of five and three is " + 5 + 3);
        System.out.println("collection of five and three is " + (5 + 3));
        System.out.println("collection of five and three is " + "5" + "3");
        System.out.println("collection of five and three is " + (5 + 3));
        System.out.println("collection of five and three is " + (a + b));
        System.out.println("c" + (a + b));
        System.out.println((5 - 2) + (4 * 7));
        System.out.println(5 * 2.3);
        int number = 3;
        System.out.println(number);
        System.out.println(++number);
        System.out.println(number++);
        System.out.println(number);

        int number2 = 7;
        System.out.println("number2 =" + number2);
        number2--;
        System.out.println("number2 =" + number2);
        System.out.println(--number2);
        System.out.println(number2--);
        System.out.println(number2);


        //CASTING
        //  converts data types one to another if it is possible
        {
            double dd = 3.9;
            System.out.println(dd);
            int asdf = (int) dd;
            System.out.println((int) dd);

            // IMPLICIT CASTING
            double d1 = 3000;
            long l = asdf
            System.out.println(d1);
            System.out.println(l);
            // EXPLICT CASTING
            double price = 200.55;
            System.out.println((int) price);

            // SHORTHAND OPERATORS
            int number3 = 5;
            number3 = 5 + 5;//10
            number3 += 5;//number3=5+5;
            System.out.println(number3);
            int numberA = 33;
            numberA += 22;
            System.out.println(numberA);
            numberA *= 3;
            System.out.println(numberA);
            numberA /= 3;
            System.out.println(numberA);
            numberA -= 9;
            System.out.println(numberA);
            numberA %= 3;
            System.out.println(numberA);

        }