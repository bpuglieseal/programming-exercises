public class Ejercicio6 {
    public static void main(String[] args) {
        for (int i = 1, counter = 0; i < Integer.MAX_VALUE && counter < 10; i++) {
            if (i % 2 == 0) {
                System.out.format("Número par: %d\n", i);
                counter++;
            }
        }
    }
}
