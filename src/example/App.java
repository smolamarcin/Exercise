package example;

import com.sun.tools.javac.util.List;
import generics.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static generics.Util.compare;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String name="Marcin";
        Stream<Character> sch = name.chars().mapToObj(i->(char)i);
        sch.forEach(ch->  System.out.printf("%c %s%n", ch, ch.getClass().getName()));
        OrderedPair<String,Integer> orderedPair=new OrderedPair<>("Siema",2);
        OrderedPair<Integer,Integer> orderedPair2=new OrderedPair<>(2,2);
        Pair<Integer,String> p1=new OrderedPair<>(1,"apple");
        Pair<Integer,String> p2=new OrderedPair<>(2,"orange");
        Pair<Integer,String> p3=new OrderedPair<>(2,"orange");
        boolean notSame= Util.compare(p1,p2);
        boolean same= Util.compare(p2,p3);
        System.out.println(notSame);
        System.out.println(same);
        Map<String, String> myMap = new HashMap();
        myMap.put("Siema", "Elo");
        java.util.ArrayList<BoxWithGenerics<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
        BoxDemo.addBox(Integer.valueOf(10),listOfIntegerBoxes);
        BoxDemo.<Integer>addBox(Integer.valueOf(20),listOfIntegerBoxes);
        BoxDemo.<Integer>addBox(Integer.valueOf(30),listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);
    }
}
