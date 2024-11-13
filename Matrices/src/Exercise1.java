import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static int[][] create_and_fill_matrix (int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) matrix[i][j] = 0;
        }
        return matrix;
    }

    public static void print_matrix_by_row (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] count_marks (int[][] marks) {
        int[][] marks_count = create_and_fill_matrix(marks[0].length, 4);

        for (int i = 0; i < marks[0].length; i++) {
            for (int j = 0; j < marks.length; j++) {
                if (marks[j][i] < 5) marks_count[i][0]++;
                if (marks[j][i] >= 5 && marks[j][i] <= 7) marks_count[i][1]++;
                if (marks[j][i] > 7 && marks[j][i] <= 9) marks_count[i][2]++;
                if (marks[j][i] == 10) marks[i][3]++;
            }
        }

        return marks_count;
    }

    public static int[] get_highest_marks (int[][] matrix) {
        int[] highest_marks = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            int major = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > major) major = matrix[j][i];
            }
            highest_marks[i] = major;
        }
        return highest_marks;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m, d;
        int average_mark = 0;
        int[] highest_marks;

        System.out.print("Input the number of students: ");
        n = scan.nextInt();

        System.out.print("Input the number of marks of each student: ");
        m = scan.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("Input the mark %d of the student %d: ", j + 1, i + 1);
                matrix[j][i] = scan.nextInt();
            }
        }

        System.out.print("------------------\n");
        System.out.format("Which of the %d students you want to calc the average mark: ", n);
        d = scan.nextInt();


        for (int i = d - 1; i == (d - 1); i++) {
            for (int j = 0; j < matrix.length; j++) {
                average_mark += matrix[j][i];
            }
        }


        System.out.format("Average mark of the student %d is %d\n", d, average_mark / m);
        System.out.print("------------------");


        highest_marks = get_highest_marks(matrix);
        System.out.print("\nHighest mark of each student:\n");
        for (int i = 0; i < highest_marks.length; i++) {
            System.out.format("Highest mark of the student %d: %d\n", i + 1, highest_marks[i]);
        }

        System.out.print("------------------\n");
        int[][] counted_marks = count_marks(matrix);
        print_matrix_by_row(counted_marks);
    }
}
