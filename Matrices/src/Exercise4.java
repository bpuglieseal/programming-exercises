import java.util.Scanner;

public class Exercise4 {
    public static void print_matrix (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void convert_matrix (int[][] matrix) {
        int aux;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                if (j == i && matrix[i][j] < 0) {
                    matrix[i][j] = 0;
                } else if (j != i) {
                    aux = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int[][] matrix;

        System.out.print("Input the rows and columns of the matrix: ");
        n = scan.nextInt();
        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Input in the position " + (i + 1) + " " + (j + 1) + ": ");
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.print("\n------------------\n");
        System.out.print("Matrix before convert: \n");
        print_matrix(matrix);
        System.out.print("------------------\n");
        convert_matrix(matrix);
        System.out.print("Matrix after convert: \n");
        print_matrix(matrix);
    }
}
