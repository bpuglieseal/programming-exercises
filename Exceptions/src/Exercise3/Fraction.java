package Exercise3;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) throws FractionException {
        if (denominator == 0) {
            throw new FractionException("Cannot instantiate a fraction with denominator 0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction add (Fraction a, Fraction b) throws FractionException {
        if (a.denominator == b.denominator) {
            return new Fraction(a.numerator + b.numerator, a.numerator);
        }

        int c = a.numerator * b.denominator;
        int d = a.denominator * b.numerator;
        return new Fraction(c + d, a.denominator * b.denominator);
    }

    public static Fraction substract (Fraction a, Fraction b) throws FractionException {
        if (a.denominator == b.denominator) {
            return new Fraction(a.numerator - b.numerator, a.denominator);
        }

        int c = a.numerator * b.denominator;
        int d = a.denominator * b.numerator;

        return new Fraction(c - d, a.denominator * b.denominator);
    }

    public static Fraction multiply (Fraction a, Fraction b) throws FractionException {
        return new Fraction(a.numerator * b.numerator, a.denominator * b.denominator);
    }

    public static Fraction divide (Fraction a, Fraction b) throws FractionException {
        int c = a.numerator * b.denominator;
        int d = a.denominator * b.numerator;

        if (d == 0) {
            throw new FractionException("This operation results in an invalid fraction");
        }

        return new Fraction(c, d);
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
