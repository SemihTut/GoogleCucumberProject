package oop;

public class SwitchStatement {
    public static void main(String[] args) {

        System.out.println("getCustomerId(\"Semih\") = " + getCustomerId("Semih"));


    }
    public static String getCustomerId(String name){
        String id = switch(name){
            case "Semih" -> "1234";
            case "Alperen" -> "2345";
            case "Yusuf" -> "3456";
            case "Samet" -> "4567";
            default -> "";
        };

        return id;
    }
}
