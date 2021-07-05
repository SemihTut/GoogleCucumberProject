package oop;

import lombok.*;

@Getter @Setter @NoArgsConstructor
public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width){
        this.width = Math.max(width,0);
    }

    public void setLength(double length){
        this.length = Math.max(length,0);
    }

    public double getArea(){
        return width*length;
    }
}
