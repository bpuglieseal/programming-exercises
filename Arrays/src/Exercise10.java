public class Exercise10 {
    //    Add an element in a specific position
    public static void print_array(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.print("]\n");
    }

    public static int[] delete_element (int[] array, int position) {
        int[] new_array = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != (position - 1)) {
                new_array[j] = array[i];
                j++;
            }
        }
        return new_array;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] array = {1, 2, 3, 4, 5};
        array = delete_element(array, 3);
        array = delete_element(array, 4);
        array = delete_element(array, 1);
        print_array(array);
    }
}

