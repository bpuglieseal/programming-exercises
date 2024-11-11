import java.util.Scanner;

public class Exercise8 {
    public static int calc_position(int position, int moves, int size) {
        if ((position + moves) > size - 1) return (position + moves) - size;
        return position + moves;
    }

    public static void print_array(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original, copy;
        int n, M;

        System.out.print("Input the n spaces of your array: ");
        n = sc.nextInt();
        System.out.print("Input the M spaces that you want elements move: ");
        M = sc.nextInt();

        original = new int[n];
        copy = new int[n];

        if (M > n) { M = M % n; }

        for (int i = 0; i < original.length; i++) {
            System.out.print("Input the number " + (i + 1) + ": ");
            original[i] = sc.nextInt();
        }

        for (int i = 0; i < original.length; i++) {
            int new_position = calc_position(i, M, n);
            copy[new_position] = original[i];
        }

        System.out.print("Original array: ");
        print_array(original);

        System.out.print("Move array: ");
        print_array(copy);
    }
}
