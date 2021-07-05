package oop;

import lombok.*;

@Getter @Setter @NoArgsConstructor
public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
    }

    public void setCost(double cost){
        this.cost = Math.max(cost,0);
    }
}
