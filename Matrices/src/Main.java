import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;

        System.out.print("Input the number of students: ");
        n = scan.nextInt();

        System.out.print("Input the number of marks of each student: ");
        m = scan.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("Input the mark %d of the student %d: ", j + 1, i + 1);
                matrix[j][i] = scan.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("%d ", matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}
