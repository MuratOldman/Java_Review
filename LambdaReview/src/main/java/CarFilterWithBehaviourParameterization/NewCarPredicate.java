package CarFilterWithBehaviourParameterization;

public class NewCarPredicate implements CarFilter{
    @Override
    public boolean test(Car car) {
       return  car.getYear()>2015;
    }
}
