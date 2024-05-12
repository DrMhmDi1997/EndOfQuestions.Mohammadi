package ir.MatrixProject;

public class Saddle {

        public static void main(String args[])
        {
//initializing a matrix
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int m = 3, k;
//variables to store min and max elements
            int min = 0, max = 0;
            int [][]index = new int[3][3];
            System.out.print("The matrix is: \n");
            int i,j;
//prints the given matrix
//outer loop for rows
            for (i = 0; i < m; i++)
            {
//inner loop for columns
                for (j = 0; j < m; j++)
                {
//prints the element of the matrix
                    System.out.print(matrix[i][j] + " " );
                }
//throws cursor to the next line
                System.out.println();
            }
//logic to find the saddle points in the given matrix
//finds the minimum element in the row
            for (i = 0; i < m; i++)
            {
                min = matrix[i][0];
                for (j = 0; j < m; j++)
                {
                    if (min >= matrix[i][j])
                    {
                        min = matrix[i][j];
                        index[0][0] = i;
                        index[0][1] = j;
                    }
                }
//finds the maximum element in the same column
                j = index[0][1];
                max = matrix[0][j];
                for (k = 0; k < m; k++)
                {
                    if (max <= matrix[k][j])
                    {
                        max = matrix[i][j];
                        index[1][0] = k;
                        index[1][1] = j;
                    }
                }
//saddle point is the minimum of a row and maximum of the column
                if (min == max)
                {
                    if (index[0][0] == index[1][0] && index[0][1] == index[1][1])
                    {
                        System.out.print("\nSaddle point in the matrix is at index: (" + index[0][0] + ", " + index[0][1] + ") : " + max + "\n");
                    }
                }
            }
        }
    }

