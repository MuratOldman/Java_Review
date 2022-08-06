package CarFilterWithBehaviourParameterization;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.*;

public class ReadyInterfacesPractice {
    public static void main(String[] args) {

        // accepts one parameter and returns boolean --> Predicate. it works with test() method.
        //methodName.test(parameter);
        Predicate<Integer> greaterThan15=p->p>15;
        System.out.println("greaterThan15.test(14) = " + greaterThan15.test(14));

        //BiPredicate . accepts twp parameter and returns boolean
        BiPredicate<Integer,Integer>compare=(x,y)->x>y;
        System.out.println("compare.test(5,3) = " + compare.test(5, 3));

        // one parameter no returns --> Consumer . it works with accept() method
        // methodName.accept(parameter);
        Consumer<String>showUp= System.out::println;
        showUp.accept("Java Developer");
        // biConsumer , takes two parameter no returns

        BiConsumer<String,String> combine = (str1, str2) -> System.out.println(str1+" "+str2);
        combine.accept("Harold","Finch");

        //create a method that takes string and integer, print the string given number of times

        BiConsumer<String,Integer> printMultipleTimes = (str,num) ->{
            for (int i = 0; i < num; i++) {
                System.out.println(str);
            }
        };

        printMultipleTimes.accept("Albus",10);

        //another task
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Steven",6000);
        map.put("Mike",7000);
        map.put("Joe",3000);
        map.put("Harold",4500);
        map.put("Albus",5500);

        //print the name of the employees whose salary is grater than 5000 (forEach)
        map.forEach((key, value)->{
            if(value>5000) System.out.println("key = " + key);
        });


        // takes one parameter and return one --> Function interface
        // Function<ParameterType, ReturnType>
        Function<Integer,Integer>multiply=x->x*x;
        System.out.println("multiply.apply(5) = " + multiply.apply(5));


    }
}
