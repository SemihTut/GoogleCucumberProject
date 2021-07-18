package oop;

import lombok.*;

@Getter @Setter @NoArgsConstructor
public class Wall {

//Phone commit
    private double width;
    private double height;

    public Wall(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = Math.max(height, 0);
    }

    public void setWidth(double width){
        this.width = Math.max(width,0);
    }

    public double getArea(){
        return getHeight()*getWidth();
    }
}
