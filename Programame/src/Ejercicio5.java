import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 4, i = 0;

        while (i < n) {
            String province_code;
            String province_area_code;
            int province_towns;
            int j = 0;

            System.out.print("Código de la Provincia: ");
            province_code = scan.nextLine();
            System.out.print("Código de Area de la Provincia: ");
            province_area_code = scan.nextLine();
            System.out.print("Cantidad de casas de la Provincia: ");
            province_towns = scan.nextInt();
            scan.nextLine();

            while (j < province_towns) {
                String town_identification_code;
                String town_area;
                int town_family;
                float family_salary_average = 0;
                int m = 0;

                System.out.print("Código de la casa " + (j + 1) + ": ");
                province_code = scan.nextLine();
                System.out.print("Código de Area de la casa " + (j + 1) + ": ");
                province_area_code = scan.nextLine();
                System.out.print("Total de familiares residenciados en la casa " + j + 1 + ": ");
                town_family = scan.nextInt();
                scan.nextLine();

                while (m < town_family) {
                    String head_family_code;
                    float head_family_salary;
                    int children;

                    System.out.print("Código del lider de la familia " + (m + 1) + ": ");
                    head_family_code = scan.nextLine();
                    System.out.print("Salario del lider de la familia " + (m + 1) + ": ");
                    head_family_salary = scan.nextFloat();
                    System.out.print("Cantidad de niños de la familia " + (m + 1) + ": ");
                    children = scan.nextInt();
                    scan.nextLine();
                    family_salary_average += head_family_salary;

                    m++;
                }

                System.out.println("Promedio de los salarios de la familias en la provincia " + (j + 1) + ": " + family_salary_average / town_family);
                j++;
            }

            i++;
        }
    }
}
