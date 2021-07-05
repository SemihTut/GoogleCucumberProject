package oop;

import lombok.*;

@NoArgsConstructor @Getter @Setter
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return distance(0,0);
    }

    public double distance(int x, int y){
        return distance(new Point(x,y));
    }

    public double distance(Point point){
        return Math.sqrt((point.getX()-this.x)*(point.getX()-this.x)+(point.getY()-this.y)*(point.getY()-this.y));
    }
}
