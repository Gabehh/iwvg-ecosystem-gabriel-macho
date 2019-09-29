package es.upm.miw.iwvg.ecosystem.practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        this.validateIsNullOrEmpty();
        /*
        Version java 1.7
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
        */
        // return this.collection.stream().mapToDouble(value -> value).sum();
        return this.collection.stream().mapToDouble(Double::doubleValue).sum();

    }

    private void validateIsNullOrEmpty() {
        if ((this.collection == null) || this.collection.isEmpty()) {
            throw new ArithmeticException("Null or Empty collection");
        }
    }

    public double higher() {
        this.validateIsNullOrEmpty();
        return Collections.max(this.collection);
    }

    public double min() {
        this.validateIsNullOrEmpty();
        return Collections.min(this.collection);
    }

    public double product(){
        this.validateIsNullOrEmpty();
        return this.collection.stream().reduce((a, b) -> a * b).orElse(-1.0);
    }

}