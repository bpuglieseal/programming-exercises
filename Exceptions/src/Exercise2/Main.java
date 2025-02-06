package Exercise2;

public class Main {
    public static void add (String... numbers) {
        int sum = 0;
        int count = 0;
        for (String i : numbers) {
            try {
                int a = Integer.parseInt(i);
                sum += a;
            } catch (NumberFormatException e) {
                System.out.format("\"%s\" cannot be added\n", i);
                count++;
            }
        }

        System.out.format("total sum: %d\n", sum);
        System.out.format("numbers that were not added: %d\n", count);
    }

    public static void main(String[] args) {
        add("212", "1", "a", "56", "sdf", "100");
    }
}
