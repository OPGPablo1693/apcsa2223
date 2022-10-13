package Projects2223;

import java.util.Arrays;

public class ProjectMultidemistion10132002
{
    public static void main(String[] args) {
        String[]arr1D={"A","b"};

        String[][]arr2D={{"a","b","c"},{"d","z","f"}};

        int [][][]arr3D={{{1,2,3},{4,5,6}},{{7,8,9},{11,22,33}},{{12,22,33},{14,25,36}} };


        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(arr3D[0][1][2]);
        System.out.println(arr3D[1][1][2]);
        System.out.println(arr3D[1][0][2]);

        arr3D[1][0][2]=99;

    }
}
