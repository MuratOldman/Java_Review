import TaskDish.Dish;
import TaskDish.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier) : is used to create a collection using collector
        System.out.println("********TOCOLLECTION()***********");
        ArrayList<Integer> collect = numbers.stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("collect = " + collect);

        HashSet<Integer> integerHashSet = numbers.stream().collect(Collectors.toCollection(HashSet::new));

        //toList() : returns a Collector interface that gathers the input data into a new list
        System.out.println("********TOLIST()***********");
        List<Integer> collect1 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);

        //toSet() : returns a Collector interface that gathers the input data into a new set

        System.out.println("********TOSET()***********");
        Set<Integer> collect2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .collect(Collectors.toSet());
        System.out.println("collect2 = " + collect2);

        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        System.out.println("********TOMAP()***********");
        Map<String, Integer> collect3 = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println("collect3 = " + collect3);

        //counting() : returns a Collector that counts the number of the elements
        System.out.println("********COUNTING()***********");
        long count = DishData.getAll().stream()
                .map(Dish::getName)
                .distinct().count();
        System.out.println("count = " + count);


        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a integer-valued func
        System.out.println("********SUMMINGINT()***********");
//        Integer collect4 = DishData.getAll().stream()
//                .collect(Collectors.summingInt(Dish::getCalories));

        Integer collect5 = DishData.getAll().stream().mapToInt(Dish::getCalories).sum();

        //averagingInt(ToIntFunction) : returns the average of the integers passed values
        OptionalDouble average1 = DishData.getAll().stream().mapToInt(Dish::getCalories).average();
        System.out.println("average1 = " + average1);
        Double average2 = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("average2 = " + average2);

        //joining() : is used to join various elements of a character or string array into a single string object
        System.out.println("********JOINING()***********");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String joining1 = courses.stream()
                .collect(Collectors.joining());
        System.out.println("joining1 = " + joining1);
        String joining2 = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println("joining2 = " + joining2);
        String joining3 = String.join("", courses);
        System.out.println("joining3 = " + joining3);


        //partioningBy() : is used to partition a stream of objects(or set of elements) based on a given predicate
        System.out.println("********PARTIONINGBY()***********");
        Map<Boolean, List<Dish>> booleanListMap = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println("booleanListMap = " + booleanListMap);

        //groupingBy() : is used for groping objects by some property and storing results in a map instance
        System.out.println("********GROUPINGBY()***********");
        Map<String, List<Dish>> groupingByName = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getName));
        System.out.println("groupingByName = " + groupingByName);

        Map<Boolean, List<Dish>> groupingByIsVegetarian = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::isVegetarian));
        System.out.println("groupingByIsVegetarian = " + groupingByIsVegetarian);



    }
}
