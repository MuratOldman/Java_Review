package DoubleColonOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private String make;
    private int model;

    public Car() {
    }

    public Car(int model) {

        this.model = model;
    }

    public Car(String make, int model) {
        this.make = make;
        this.model = model;
    }
}
