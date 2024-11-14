import com.sun.source.tree.ArrayAccessTree;

import java.util.Scanner;

public class Exercise3 {
    public static void print_matrix (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static int[][] transpose_matrix (int[][] matrix) {
        int[][] transposed_matrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) transposed_matrix[j][i] = matrix[i][j];
        }

        return transposed_matrix;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        int[][] matrix;

        System.out.print("Input the number of rows of the matrix: ");
        n = scan.nextInt();
        System.out.print("Input the number of columns of the matrix: ");
        m = scan.nextInt();

        matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Input in the position " + (i + 1) + " " + (j + 1) + ": ");
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.print("\n------------------\n");
        System.out.print("Matrix before transpose: \n");
        print_matrix(matrix);
        System.out.print("------------------\n");
        matrix = transpose_matrix(matrix);
        System.out.print("Matrix after transpose: \n");
        print_matrix(matrix);
    }
}
