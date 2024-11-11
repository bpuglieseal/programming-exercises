public class Introduction {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) a[i] = i + 1;
        for (int j : a) System.out.print(j + " ");
    }
}
