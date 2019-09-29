package es.upm.miw.iwvg.ecosystem.practica;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Boolean isPropia(){
        return numerator < denominator;
    }
    public Boolean isImpropia(){
        return numerator > denominator;
    }

    public Boolean isEquivalent(Fraction secondFraction){
        return this.numerator * secondFraction.denominator == this.denominator * secondFraction.numerator;
    }

    public Fraction product(Fraction secondFraction){
        return new Fraction(this.numerator * secondFraction.numerator,this.denominator * secondFraction.denominator);
    }



}