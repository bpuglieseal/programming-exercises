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
        Fraction.simplify(this);
    }

    public static Fraction add (Fraction a, Fraction b) throws FractionException {
        if (a.denominator == b.denominator) {
            return new Fraction(a.numerator + b.numerator, a.denominator);
        }

        int c = a.numerator * b.denominator;
        int d = a.denominator * b.numerator;

        Fraction newFraction = new Fraction(c + d, a.denominator * b.denominator);
        Fraction.simplify(newFraction);
        return newFraction;
    }

    public static Fraction substract (Fraction a, Fraction b) throws FractionException {
        if (a.denominator == b.denominator) {
            return new Fraction(a.numerator - b.numerator, a.denominator);
        }

        int c = a.numerator * b.denominator;
        int d = a.denominator * b.numerator;

        Fraction newFraction = new Fraction(c - d, a.denominator * b.denominator);
        Fraction.simplify(newFraction);
        return newFraction;
    }

    public static Fraction multiply (Fraction a, Fraction b) throws FractionException {
        Fraction newFraction = new Fraction(a.numerator * b.numerator, a.denominator * b.denominator);
        Fraction.simplify(newFraction);
        return newFraction;
    }

    public static Fraction divide (Fraction a, Fraction b) throws FractionException {
        int c = a.numerator * b.denominator;
        int d = a.denominator * b.numerator;

        if (d == 0) {
            throw new FractionException("This operation results in an invalid fraction");
        }

        Fraction newFraction = new Fraction(c, d);
        Fraction.simplify(newFraction);
        return newFraction;
    }

    public static void simplify (Fraction fraction) {
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        int major = Math.max(fraction.getNumerator(), fraction.getDenominator());
        for (int i = 2; i < major; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
                fraction.setNumerator(numerator);
                fraction.setDenominator(denominator);
            }
        }
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }
}
