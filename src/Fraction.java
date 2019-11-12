public class Fraction implements Comparable<Fraction> {
    private int numerator, denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public Fraction sumFractions(Fraction f){
        int numerator = this.denominator * f.numerator + this.numerator * f.denominator;
        int denominator = f.denominator * this.denominator;
        return new Fraction(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public String toStringAbs() {
        return Math.abs(numerator) + "/" + Math.abs(denominator);
    }

    @Override
    public int compareTo(Fraction fr) {
        double diff = (double) numerator / denominator - (double) fr.numerator / fr.denominator;
        return diff > 0 ? 1 : (diff < 0 ? -1 : 0);
    }
}