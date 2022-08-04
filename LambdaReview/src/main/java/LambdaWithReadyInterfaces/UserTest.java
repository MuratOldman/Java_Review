package LambdaWithReadyInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User>userList=new ArrayList<>();

        userList.add(new User("Ali","Tayyar",15));
        userList.add(new User("John","Eomer",25));
        userList.add(new User("Kim","Ekinnan",55));
        userList.add(new User("Allison","Han",27));
        userList.add(new User("Susan","Tom",45));
        userList.add(new User("Josh","Ethan",35));


        //Print all elements in the list

        print(userList, userList::contains);
        System.out.println("==============================");
        //Print all elements if last name starts with E
        print(userList,p->p.getLastName().startsWith("E"));
        System.out.println("==============================");
        //Print all elements if age greater than 25
        print(userList,p->p.getAge()>25);

    }

    private static void print(List<User> list, Predicate<User> p){
        for(User user:list){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
