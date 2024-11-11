import java.util.Scanner;

public class Exercises {
    public static int[] copy_bigger_than(int[] original, int bigger_than) {
        int[] new_array;
        int c = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] > bigger_than) c++;
        }
        if (c == 0) return new int[0];

        new_array = new int[c];
        for (int i = 0, j = 0; i < original.length; i++) {
            if (original[i] > bigger_than) {
                new_array[j] = original[i];
                j++;
            }
        }
        return new_array;
    }

    public static int[] create(int size) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];
        System.out.print("Values: ");
        for (int i = 0; i < array.length; i++) array[i] = sc.nextInt();
        return array;
    }

    public static void print_array(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.print("]\n");
    }

    public static int find_element(int[] array, int e) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e) return i;
        }
        return -1;
    }

    public static void copy(int[] from, int[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    public static int[] push(int[] from, int push) {
        int[] new_array = new int[from.length + 1];
        copy(from, new_array);
        new_array[from.length] = push;
        return new_array;
    }

    public static int[] remove(int[] from) {
        int[] new_array = new int[from.length - 1];
        for (int i = 0; i < new_array.length; i++) new_array[i] = from[i];
        return new_array;
    }

    public static int[] mix(int[] first, int[] second) {
        int[] new_array = new int[first.length + second.length];
        int pos = 0;

        for (int i = 0; i < first.length; i++, pos++) new_array[pos] = first[i];
        for (int i = 0; i < second.length; i++, pos++) new_array[pos] = second[i];

        return new_array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5};
        int option;

        do {
            System.out.println("1. Crear nuevo array de números: ");
            System.out.println("2. Imprimir números: ");
            System.out.println("3. Agregar número.");
            System.out.println("4. Agregar multiples números.");
            System.out.println("5. Eliminar último nùmero.");
            System.out.println("6. Filtrar números.");
            System.out.print(".- Digite su opción: ");
            option = sc.nextInt();

            if (option == 0) System.out.println("Good Bye!");
            if (option < 0 || option > 6) System.out.println("Opción invalida.");

            switch (option) {
                case 1: {
                    System.out.print("Digite el tamaño del nuevo array: ");
                    int n = sc.nextInt();
                    a = create(n);
                    System.out.println("Array creado.");
                    break;
                }
                case 2: {
                    print_array(a);
                    break;
                }
                case 3: {
                    System.out.print("Digite el nuevo número que se agregará: ");
                    int n = sc.nextInt();
                    a = push(a, n);
                    System.out.println("Número agregado.");
                    break;
                }
                case 4: {
                    System.out.print("Digite la cantidad de números que se agregarán: ");
                    int n = sc.nextInt();
                    int[] b = create(n);
                    a = mix(a, b);
                    System.out.println("Números agregados.");
                    break;
                }
                case 5: {
                    a = remove(a);
                    System.out.println("Número eliminado.");
                    break;
                }
                case 6: {
                    System.out.print("Digite el número por el cual se filtrará el array: ");
                    int n = sc.nextInt();
                    a = copy_bigger_than(a, n);
                    break;
                }
                default: break;
            }

        } while (option != 0);
    }
}
