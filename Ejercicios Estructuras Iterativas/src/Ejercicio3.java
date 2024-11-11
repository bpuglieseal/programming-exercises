public class Ejercicio3 {
    //    Write a program that can add the first 5 positive integer numbers
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.format("%d\n", sum);
    }
}
