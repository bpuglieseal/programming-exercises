package Exercise3;

public class Main {
    public static void main(String[] args) throws FractionException {
        System.out.println("Creando dos fracciones: 4/3, 1/8 y 0/3");

        Fraction a = new Fraction(160, 120);
        Fraction b = new Fraction(1, 8);
        Fraction c = new Fraction(0, 3);

        System.out.println("Fractions: ");
        System.out.print(a.toString() + "\n");
        System.out.print(b.toString() + "\n");
        System.out.print(c.toString() + "\n");

        System.out.println("result of add the fractions 4/3 y 1/8: ");
        System.out.println(Fraction.add(a, b).toString());

        System.out.println("result of substract the fractions 4/3 y 1/8: ");
        System.out.println(Fraction.substract(a, b).toString());

        System.out.println("result of multiply the fractions 4/3 y 1/8: ");
        System.out.println(Fraction.multiply(a, b).toString());

        System.out.println("result of divide the fractions 4/3 y 0/3: ");

        try {
            System.out.println(Fraction.divide(a, c).toString());
        } catch (FractionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
