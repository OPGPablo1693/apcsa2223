package Lessons2223;

public class Java11_Loops09222022
{
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println("hello world");
        }
        for (int i = 2; i < 6; i += 2) {
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 100; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("when i=" + i + "j=" + j);
            }
        }

        for (int i = 0, j = 6; i < 100 && j < 100; i++, j++)
        {
            System.out.println("i= "+i+", j="+j);
        }
        for(int i=0;true;i++)
        {
            System.out.println("yellow world"+"integration number"+i);
        }


    }
}

