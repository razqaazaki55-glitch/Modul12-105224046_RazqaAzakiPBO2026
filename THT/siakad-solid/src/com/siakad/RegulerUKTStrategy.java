package com.siakad;

public class RegulerUKTStrategy implements UKTCalculationStrategy {
    @Override
    public double hitungUKT(int totalSks) {
        return 5000000 + (totalSks * 100000);
    }
}
