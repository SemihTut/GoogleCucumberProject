package oop;


import org.apache.hc.core5.util.Asserts;

public class MainTest {
    public static void main(String[] args) {
        /*BankAccount bankAccountSemih = new BankAccount(10000,"Semih","semihtut@gmail.com",12345678);
        BankAccount bankAccountSamet = new BankAccount(100,"Samet","sametgunerli@gmail.com",12345678);
        BankAccount bankAccountAlp = new BankAccount(10,"Alp","alpulker@gmail.com",12345678);
        BankAccount bankAccountYusuf = new BankAccount(100000,"Yusuf","yusuf@gmail.com",12345678);
        BankAccount bankAccountHasan = new BankAccount(-1000,"Hasan","hasankara@gmail.com",12345678);*/

        //*******************************************************************************//
       /* Wall wall = new Wall(10,10);
        System.out.println("wall.getArea() = " + wall.getArea());
        System.out.println("wall.getWidth() = " + wall.getWidth());
        System.out.println("wall.getHeight() = " + wall.getHeight());

        wall.setWidth(-20);
        System.out.println("wall.getArea() = " + wall.getArea());
        System.out.println("wall.getWidth() = " + wall.getWidth());
        System.out.println("wall.getHeight() = " + wall.getHeight());
        System.out.println("wall.getArea() = " + wall.getArea());*/

        //********************************************************************************//

       /* Point firstPoint = new Point(-6,5);
        Point secondPoint = new Point(3,1);

        System.out.println("firstPoint.distance() = " + firstPoint.distance());
        System.out.println("secondPoint.distance() = " + secondPoint.distance());
        System.out.println("firstPoint.distance(secondPoint) = " + firstPoint.distance(secondPoint));
        System.out.println("firstPoint.distance(2,2) = " + firstPoint.distance(2, 2));*/

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4);
        Calculator calculator = new Calculator(carpet,floor);
        System.out.println("calculator.getTotalCost() = " + calculator.getTotalCost());
        carpet.setCost(-3);
        System.out.println("calculator.getTotalCost() = " + calculator.getTotalCost());

    }
}
