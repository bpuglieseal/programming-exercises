import java.util.Scanner;

public class Exercise7 {
    public static void print_matrix (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void fill_matrix_inverse_diagonal_with_1 (int[][] matrix) {
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) matrix[i][j] = 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the size of the matrix: ");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];

        fill_matrix_inverse_diagonal_with_1(matrix);
        print_matrix(matrix);
    }
}