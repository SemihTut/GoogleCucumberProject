package oop;

import lombok.*;

public class Calculator {
    private Carpet c;
    private Floor f;

    public Calculator(Carpet c, Floor f) {
        this.c = c;
        this.f = f;
    }

    public double getTotalCost(){
        return f.getArea()*c.getCost();
    }
}
