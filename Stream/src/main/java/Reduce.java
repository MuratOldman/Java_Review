import TaskDish.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        Integer result1 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("result1 = " + result1);

        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a + b);
        System.out.println("result2 = " + result2);

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());

        // TASK
        //How would you count the dish using map and reduce

        Integer integer = DishData.getAll().stream().map(dish -> 1).reduce(0, (a, d) -> a + d);
        System.out.println("integer = " + integer);

        long count = DishData.getAll().stream().count();
        System.out.println("count = " + count);

    }
}
