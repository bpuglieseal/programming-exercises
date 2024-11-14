import java.util.Scanner;

public class Exercise5 {
    public static void print_matrix (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static boolean is_symetric_matrix (int[][] matrix) {
        if (matrix.length != matrix[0].length) return false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[j][i]) return false;
            };
        }

        return true;
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

        print_matrix(matrix);
        if (is_symetric_matrix(matrix)) {
            System.out.print("Is a symetric matrix");
        } else {
            System.out.print("Is not a symetric matrix");
        }

    }
}
