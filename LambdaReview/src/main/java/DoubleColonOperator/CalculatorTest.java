package DoubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculate s1= Calculator::findSum;
        s1.calculate(4,4);

        Calculate m1=(x,y)->new Calculator().findMultiply(x,y);
        m1.calculate(5,5);

        Calculate m2=new Calculator()::findMultiply;
        m2.calculate(5,10);


//         BiFunction<String,Integer,String> fn=(str,i)->str.substring(i);
        BiFunction<String,Integer,String> fn= String::substring;
        System.out.println("fn.apply(\"Developer\",5) = " + fn.apply("Developer", 5));

//        Consumer<Integer> display = i -> System.out.println(i);
//        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(50);

    }
}
