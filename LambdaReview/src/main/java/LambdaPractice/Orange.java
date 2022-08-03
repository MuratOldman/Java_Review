package LambdaPractice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Orange {
    private int weight;
    private Color color;

}

/*
To use lambda expression we need to create an interface. Because lambda is a value and this value type will be the interface type.
 */