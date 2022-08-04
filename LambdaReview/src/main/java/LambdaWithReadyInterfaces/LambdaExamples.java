package LambdaWithReadyInterfaces;

import java.util.function.*;

public class LambdaExamples {
    public static void main(String[] args) {

        System.out.println("=====PREDICATE=====");
        // Implementation of test method that belongs to Predicate interface
        //  returns boolean
        Predicate<Integer>lessThan=a->a<18;
        boolean test = lessThan.test(15);
        System.out.println("test = " + test);

        System.out.println("======CONSUMER=======");
        Consumer<Integer>display= System.out::println;
        display.accept(5);

        System.out.println("=====BI CONSUMER==========");
        BiConsumer<Integer,Integer>addTwo=(x,y)-> System.out.println(x+y);
        addTwo.accept(25,75);

        System.out.println("======FUNCTION==========");
        Function<String,String>fun=s->4+s;
        System.out.println("fun.apply(\" you\") = " + fun.apply(" you"));

        System.out.println("========SUPPLIER===========");
        Supplier<Double>randomValue= Math::random;
        System.out.println("randomValue.get() = " + randomValue.get());


    }
}
