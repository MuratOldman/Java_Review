package IT;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String name;
    private Job job;
    private String team;


}
