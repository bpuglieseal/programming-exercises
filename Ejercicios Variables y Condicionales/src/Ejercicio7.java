import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input, lower;
        String vowel = "aeiou";
        String consonant = "bcdfghjklmnpqrstvwxyz";

        System.out.print("Digite una letra: ");
        input = scan.nextLine();
        lower = input.toLowerCase();

        if (vowel.contains(lower)) {
            System.out.print("La letra es una vocal.");
        }

        if (consonant.contains(lower)) {
            System.out.print("La letra es una consonante.");
        }
    }
}

