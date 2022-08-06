package CarFilterWithBehaviourParameterization;

public class DurableCarPredicate implements CarFilter{
    @Override
    public boolean test(Car car) {
        return car.getMake().equals("Toyota");
    }
}
