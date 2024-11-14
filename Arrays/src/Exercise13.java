import java.util.Scanner;

public class Exercise13 {
    public static void print_array(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.print("]\n");
    }

    public static int[] mix (int[] first_array, int[] second_array) {
        int[] new_array = new int[first_array.length + second_array.length];
        for (int i = 0, j = 0, aux = 0; aux < new_array.length;) {
            if (i == first_array.length) {
                new_array[aux] = second_array[j];
                aux++;
                j++;
            } else if (j == second_array.length) {
                new_array[aux] = first_array[i];
                aux++;
                i++;
            } else if (first_array[i] <= second_array[j]) {
                new_array[aux] = first_array[i];
                i++;
                aux++;
            } else if (second_array[j] <= first_array[i]) {
                new_array[aux] = second_array[j];
                j++;
                aux++;
            }
        }

        return new_array;
    }

    public static  void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the N size of the two arrays: ");
        int n = scan.nextInt();

        int[] first_array = new int[n];
        int[] second_array = new int[n];

        for (int i = 0; i < first_array.length; i++) {
            System.out.format("Input the element %d of the first array: ", i + 1);
            first_array[i] = scan.nextInt();
        }

        for (int i = 0; i < first_array.length; i++) {
            System.out.format("Input the element %d of the second array: ", i + 1);
            second_array[i] = scan.nextInt();
        }

        sort(first_array);
        sort(second_array);

        first_array = mix(first_array, second_array);

        System.out.print("Result array: ");
        print_array(first_array);
    }
}
