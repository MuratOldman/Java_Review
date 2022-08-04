package FuntionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTestWithLambda {
    public static void main(String[] args) {

        List<Apple> apples =new ArrayList<>();
        apples.add(new Apple(300,Color.GREEN));
        apples.add(new Apple(100,Color.RED));
        apples.add(new Apple(200,Color.GREEN));
        apples.add(new Apple(50,Color.RED));

        // print all apples
        System.out.println("print all apples================");
        List<Apple> filter = filter(apples, apples::contains);
        System.out.println(filter);

        // print all green apples
        System.out.println("print all green apples================");
        List<Apple> filter1 = filter(apples, p -> p.getColor().equals(Color.GREEN));
        System.out.println(filter1);
        // print all apples if it is RED and heavier than 50g
        System.out.println("print all apples if it is RED and heavier than 50g================");
        List<Apple> filter2 = filter(apples, p -> p.getWeight() > 50 && p.getColor().equals(Color.RED));
        System.out.println(filter2);
    }

    private static List<Apple> filter(List<Apple> appleList, Predicate<Apple> a){
        List<Apple>result=new ArrayList<>();
        for (Apple apple:appleList){
            if(a.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
