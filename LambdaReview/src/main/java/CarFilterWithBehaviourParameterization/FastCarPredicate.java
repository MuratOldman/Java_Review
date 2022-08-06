package CarFilterWithBehaviourParameterization;

public class FastCarPredicate implements CarFilter{
    @Override
    public boolean test(Car car) {
        return car.getTopSpeed()>160;
    }
}
