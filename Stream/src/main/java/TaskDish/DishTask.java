package TaskDish;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //Print Three High Caloric Dish Name(>300)
        DishData.getAll().stream()
                .filter(i->i.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("***********************");
        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                .sorted(comparing(Dish::getCalories)) // if I put here .reversed() it returns from higher to lower
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
