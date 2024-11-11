import java.util.Scanner;
import java.util.stream.IntStream;

// If the mark is between 0 and 4,99, it will be a D.
// If the mark is between 5 and 6,99, it will be a C.
// If the mark is between 7 and 8,99 it will be a B.
// If the mark is between 9 and 10 it will be an A.


public class Exercise4 {
    public static void main(String[] args) {
        int m = 2;
        Scanner sc = new Scanner(System.in);
        String[] names = new String[m];
        float[] grades = new float[m];
        char[] qualification = new char[m];

        IntStream.range(0, m).forEach(n -> {
            System.out.format("Input the name of the student %d: ", n + 1);
            names[n] = sc.nextLine();
            System.out.format("Input the grade of the student %d: ", n + 1);
            grades[n] = sc.nextFloat();
            sc.nextLine();

            if (grades[n] > 0 && grades[n] <= 4.99) { qualification[n] = 'D'; }
            if (grades[n] >= 5 && grades[n] <= 6.99) { qualification[n] = 'C'; }
            if (grades[n] >= 7 && grades[n] <= 8.99) { qualification[n] = 'B'; }
            if (grades[n] >= 9 && grades[n] <= 10) { qualification[n] = 'A'; }
        });

        IntStream.range(0, m).forEach(n -> {
            System.out.format("grade and qualification of %s: %f -> %s\n", names[n], grades[n], qualification[n]);
        });
    }
}
