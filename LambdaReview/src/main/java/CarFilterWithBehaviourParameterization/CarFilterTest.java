package CarFilterWithBehaviourParameterization;

import java.util.ArrayList;
import java.util.List;

public class CarFilterTest {
    public static void main(String[] args) {
        List<Car>carList=new ArrayList<>();
        carList.add(Car.builder().make("Mercedes").topSpeed(170).year(2018).build());
        carList.add(Car.builder().make("BMV").topSpeed(160).year(2014).build());
        carList.add(Car.builder().make("Honda").topSpeed(140).year(2019).build());
        carList.add(Car.builder().make("Mazda").topSpeed(190).year(2020).build());
        carList.add(Car.builder().make("Toyota").topSpeed(170).year(2022).build());
        carList.add(Car.builder().make("Subaru").topSpeed(170).year(2021).build());

        FastCarPredicate fastCarPredicate=new FastCarPredicate();
        NewCarPredicate newCarPredicate=new NewCarPredicate();

        System.out.println("========FAST CARS==================");
        List<Car> fastCars = filter(carList, fastCarPredicate);
        System.out.println("fastCars = " + fastCars);
        System.out.println("========NEW CARS==================");
        List<Car> newCars = filter(carList, newCarPredicate);
        System.out.println("newCars = " + newCars);

        System.out.println("========DURABLE CARS==================");
        List<Car> durableCars = filter(carList, new DurableCarPredicate());
        System.out.println("durableCars = " + durableCars);

        // when we use lambda we don't need any implement predicate classes. We don't need any more DurableCarPredicate.java , FastCarPredicate.java , NewCarPredicate.java
        CarFilter newCarFilter=c->c.getYear()>2015;
        List<Car> newCarsWithLambda = filter(carList, newCarFilter);
        System.out.println("newCarsWithLambda = " + newCarsWithLambda);

        List<Car> fasterCarsWithLambda = filter(carList, c -> c.getTopSpeed() > 160);
        System.out.println("fasterCarsWithLambda = " + fasterCarsWithLambda);

        List<Car> durableCarsWithLambda = filter(carList, c -> c.getMake().equals("Toyota"));
        System.out.println("durableCarsWithLambda = " + durableCarsWithLambda);


    }

    private static List<Car> filter(List<Car>list,CarFilter carFilter){
        List<Car>result=new ArrayList<>();
        for(Car car:list){
            if(carFilter.test(car))
                result.add(car);
        }
        return result;
    }

}
