public class Exercise11 {
    //    Mix two arrays with the same size
    public static void print_array(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.print("]\n");
    }

    public static int[] mix (int[] array, int[] array2) {
        int[] new_array = new int[array.length + array2.length];
        for (int i = 0, j = 0; j < array.length; i += 2, j++) {
            new_array[i] = array[j];
            new_array[i + 1] = array2[j];
        }
        return new_array;
    }

    public static void main(String[] args) {
        int[] array = {1};
        int[] array2 = {2};
        array = mix(array, array2);
        print_array(array);
    }
}


