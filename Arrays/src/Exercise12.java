public class Exercise12 {
    //    Mix two arrays different sizes
    public static void print_array(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.print("]\n");
    }

//    public static int[] mix (int[] array, int[] array2) {
//        int[] new_array = new int[array.length + array2.length];
//        int[] aux;
//
//        if (array.length > array2.length) aux = array;
//        else aux = array2;
//    }

    public static void main(String[] args) {
//        int[] array = {1};
//        int[] array2 = {2};
//        array = mix(array, array2);
//        print_array(array);
    }
}
