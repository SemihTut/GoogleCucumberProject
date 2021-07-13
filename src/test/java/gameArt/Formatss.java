package gameArt;

public class Formatss {


    public static void main(String[] args) {

        String semih = String.format("My name is %s", "semih");
        System.out.println("semih = " + semih);

        String xpath = String.format("//span[@class='%s']","SEMIH");

        System.out.println(xpath);
    }
}
