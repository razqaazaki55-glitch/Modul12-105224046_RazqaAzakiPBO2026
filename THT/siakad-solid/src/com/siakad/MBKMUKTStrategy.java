package com.siakad;

public class MBKMUKTStrategy implements UKTCalculationStrategy {
    @Override
    public double hitungUKT(int totalSks) {
        return 3000000 + (totalSks * 50000);
    }
}
