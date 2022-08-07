import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> myList= Arrays.asList(1,2,3,4,3,5,9,2,2,6);
        myList.forEach(System.out::println);

        //FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(i->i%3==0)
                .distinct() // it doesn't show same value again. We had two 3 but after distinct() it shows 3 one time
                .forEach(System.out::println);

        //LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .filter(i->i%2==0)
                .limit(2)
                .forEach(System.out::println);


        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i%2==0)
                .skip(2)   // it skips first 2 items. Normally we should have 2,4,2,2,6.
                .forEach(System.out::println);

        //MAP
        System.out.println("MAP");
        myList.stream()
                .map(number -> number*2)
                .filter(i -> i%3 ==0)
                .forEach(System.out::println);

    }
}
