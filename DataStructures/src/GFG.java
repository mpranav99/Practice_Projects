// Java program to find unique
// element in matrix

import java.io.*;

class GFG {

    // function that calculate unique element
    static void unique(int[][] mat, int n, int m)
    {
        int maximum = 0, flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Find maximum element in
                // a matrix
                if (maximum < mat[i][j]) {
                    maximum = mat[i][j];
                }
            }
        }
        System.out.println(maximum);

        // Take 1-D array of (maximum + 1)
        // size
        int[] b = new int[maximum + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[mat[i][j]]++; // Here we are trying to check for every element at it's index position
                                // whether the number is repeated or not. So b[1] being 1 from matrix will
                                // be checked in the entire loop of matrix and if repeated it will be incremented
            }
        }
        for(int c = 0; c<maximum+1;c++){
            System.out.print(b[c]+" ");
        }

        // print unique element
        for (int i = 1; i <= maximum; i++) {
//            System.out.println("Debug"+b[i]);
            if (b[i] == 1) {
                System.out.print(i + " ");
            }
        }
        flag = 1;

        if (flag == 0) {
            System.out.print(
                    "No unique element in the matrix");
        }
    }

    public static void main(String[] args)
    {
        int R = 4, C = 4;
        int[][] mat = { { 1, 2, 3, 20 },
                { 5, 6, 20, 25 },
                { 1, 3, 5, 6 },
                { 6, 7, 8, 15 } };

        // function that calculate unique element
        unique(mat, R, C);
    }
}

// This code is contributed by lokeshmvs21.
