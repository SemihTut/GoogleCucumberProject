package gameArt;

import java.util.HashMap;
import java.util.Map;

public class findDuplicatesChar {
    public static void main(String[] args) {

        String str = "ass";
        System.out.println("isThereDuplicate(str) = " + isThereDuplicate(str));


    }

    public static boolean isThereDuplicate(String str){
        // Stringi char array e ceviriyoruz
        char[] chars = str.toCharArray();

        //bos bir Map objesi olusturuyoruz. hangi character kac kez kullanilmis bulmak icin
        Map<Character,Integer> freq = new HashMap<>();

        //basit bir for  each dongusu ile merge methodunu birlestirip sonucu elde ediyoruz
        // ornegin verilen string ass ise sonuc = a:1,s:2 olacak
        for(Character s : chars){
            freq.merge(s,1,Integer::sum);
        }
        // verilen string ile Map in uzunlugunu karsilastiriyoruz.
        // eger benzer harf varsa bu duplicate var demektir ve true olarak doner
        return str.length()!=freq.size();
    }
}
