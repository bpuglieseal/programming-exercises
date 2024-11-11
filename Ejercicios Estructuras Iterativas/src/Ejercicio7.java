import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vowels = "aeiou";
        int vowels_count = 0;
        String input;

        do {
            input = scan.nextLine();

            if (vowels.contains(input.toLowerCase())) {
                vowels_count++;
            }

        } while (!input.contains("$"));

        System.out.println("Número de vocales agregadas: " + vowels_count);
    }
}
