package ir.MatrixProject;

public class Matrix {

    public static void main(String[] args) {

        int a [][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        int b [][] = {{9,8,7,6}, {7,6,5,4}, {5,4,3,2,}, {1,2,3,4}, {3,4,5,6}};

        int c [][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    c[i][j] = a[i][k] * b[k][j];
                }

                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }


    }
}
