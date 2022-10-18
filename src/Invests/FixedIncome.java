package Invests;

import static java.lang.Math.pow;

public class FixedIncome {

    public double annualRate(double yieldRate, double inflation){
        return ((1 - yieldRate) / (1 + inflation) - 1) * 100;
    }

    public double monthlyRate(double annualRate){
        return (pow((1 + annualRate), 1/12) - 1) * 100;
    }
}
