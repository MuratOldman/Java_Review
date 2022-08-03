
package Lombok;


import lombok.*;

//@RequiredArgsConstructor
//@NoArgsConstructor
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Data
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
}

/*
@Data
It will generate :
• getters for all fields
• toString method
•  hashCode and equals implementations
• setters for all non-final fields
• constructor(@RequiredArgsConstructor)
 */