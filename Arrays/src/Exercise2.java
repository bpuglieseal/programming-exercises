import java.util.stream.IntStream;

public class Exercise2 {
    public static void main(String[] args) {
        int n = 100;
        int sum = IntStream.rangeClosed(1, n).reduce(0, Integer::sum);
        System.out.format("Suma de los números desde el 1 hasta el 100: %d\n", sum);
        System.out.format("Promedio de la suma: %d", sum / n);
    }
}
