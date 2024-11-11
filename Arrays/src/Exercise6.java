import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of students: ");
        int n = sc.nextInt();
        float[] grades = new float[n];
        float grades_sum = 0f;

        for (int i = 0; i < n; i++) {
            System.out.format("Input the grade of the student %d: ", i + 1);
            grades[i] = sc.nextFloat();
        }

        for (int i = 0; i < n; i++) {
            grades_sum = grades[i] + grades_sum;
        }

        for (int a = 0; a < n; a++) {
            System.out.format("%d. %f -> %f\n", a + 1, grades[a], grades_sum / n);
        }
    }
}
