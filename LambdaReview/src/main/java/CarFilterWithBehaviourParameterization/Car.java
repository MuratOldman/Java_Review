package CarFilterWithBehaviourParameterization;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Car {
    /*
    TASK:
WE have an application that helps filtering cars,

if the year is greater than 2015 -> it is an new car
if top speed is greater than 160 -> it is a fast car

write a program using BP to filter cars, it should be easliy adapt new filtering requirements.

make,year,topSpee
     */

    private String make;
    private int year;
    private int topSpeed;
}
