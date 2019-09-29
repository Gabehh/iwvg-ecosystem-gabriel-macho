package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(7, 8);
    }

    @Test
    void testFractionDecimal() {
        assertEquals(0.875, fraction.decimal());
    }

    @Test
    void testDecimal() {
        fraction = new Fraction(5, 8);
        assertEquals(0.625, fraction.decimal());
    }

    @Test
    void testDecimalDecimal() {
        fraction = new Fraction();
        assertEquals(1, fraction.decimal());
    }

    @Test
    void testNumerator() {
        assertEquals(7, fraction.getNumerator());
    }

    @Test
    void testNumeratorAndDenominator() {
        fraction = new Fraction(2, 5);
        assertEquals(2, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testDenominator() {
        assertEquals(8, fraction.getDenominator());
    }

    @Test
    void testIsPropia(){
        assertEquals(true,fraction.isPropia());
    }
    @Test
    void testIsPropiaPropia(){
        fraction = new Fraction(9,2);
        assertEquals(false,fraction.isPropia());
    }

    @Test
    void testIsImropia(){
        fraction = new Fraction(9,5);
        assertEquals(true,fraction.isImpropia());
    }

    @Test
    void testIsImropiaImpropia(){
        assertEquals(false,fraction.isImpropia());
    }
}