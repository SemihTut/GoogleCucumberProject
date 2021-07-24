package gameArt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {
    public static void main(String[] args) {
        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Predicate<Integer>isOdd = n->n%2==0;
        Predicate<Integer>isDivisibleBy3 = k->k%3==0;
        myList.removeIf(isDivisibleBy3);
        myList.removeIf(isOdd);
        //myList.forEach(System.out::print);

        List<String>myStr = new ArrayList<>(Arrays.asList("semih","alp","samet","hasan","yusuf"," "," "));
        myStr.removeIf(n -> n.startsWith(" "));
        myStr.removeAll(myStr.stream().filter(x->x.startsWith("s")).collect(Collectors.toList()));
        myStr.forEach(System.out::println);
        System.out.println("myStr = " + myStr.size());

    }
}
