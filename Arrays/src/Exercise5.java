import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercise5 {
    public static void main(String[] args) {
        int[] a = IntStream.rangeClosed(1, 10).toArray();
        int[] b = new int[10];

        IntStream.range(0, 10).forEach(n -> { b[(b.length - 1) - n] = a[n]; });

        System.out.print("Array original: ");
        Arrays.stream(a).forEach(n -> System.out.print(n + " "));

        System.out.format("\n");

        System.out.print("Array reversed: ");
        Arrays.stream(b).forEach(n -> System.out.print(n + " "));
    }
}
