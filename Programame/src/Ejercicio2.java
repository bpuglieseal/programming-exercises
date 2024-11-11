import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amhpw = 0;

        String sswbpm = "";
        double bpm = 0;

        double apm8 = 0, atm8 = 0;
        int s8counter = 0;

        int i = 1;
        while (i <= 5) {
            String code, sex;
            int hpw;
            double pm, tm;
            int q;

            System.out.print("Input the code of the subject " + i + ": ");
            code = scan.nextLine();
            System.out.print("Input the hours per week of the subject: ");
            hpw = scan.nextInt();
            System.out.print("Enter the number of students in the subject: ");
            q = scan.nextInt();
            scan.nextLine();

            if (hpw > 8) {
                s8counter++;
            }

            amhpw += hpw;

            for (int j = 1; j <= q; j++) {
                System.out.print("Enter the sex of the student " + j + ": ");
                sex = scan.nextLine();

                System.out.print("Enter the practical mark of the student " + j + ": ");
                pm = scan.nextInt();

                System.out.print("Enter the theory mark of the student " + j + ": ");
                tm = scan.nextInt();
                scan.nextLine();

                if (hpw > 8) {
                    apm8 = pm;
                    atm8 = tm;
                }

                if (pm > bpm) {
                    bpm = pm;
                    sswbpm = sex;
                }

                if (hpw >= 5 && hpw <= 15) {
                    System.out.println("Average mark of the student  " + j + ": " + ((pm + tm) / 2));
                }
            }

            i++;
        }

        if (s8counter > 0) {
            System.out.println("Average practical mark of the subjects: " + (apm8 / s8counter));
            System.out.println("Average theorical mark of the subjects: " + (atm8 / s8counter));
        }
        System.out.println("Average hours per week: " + amhpw / 5);
        System.out.println("Student sex with best practical mark: " + sswbpm);
    }
}
