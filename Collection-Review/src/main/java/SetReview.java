import java.util.*;

public class SetReview {
    public static void main(String[] args) {

        //1. create a set
        Set<Student> mySet=new HashSet<>();

        // 2 add element
        mySet.add(new Student(7, "Ibadet"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Muhabbet"));
        mySet.add(new Student(9, "Muhabbet"));

        System.out.println(mySet);

        Set<Integer> numSet=new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        //System.out.println(numSet);
        //System.out.println(numSet.add(2));

        System.out.println("firstRepeatingChar = " + firstRepeatingChar("java developer"));

    }

    public static Character firstRepeatingChar(String str){
        Set<Character>characters=new HashSet<>();
        // try to put every char one by one to "characters", if you get false this was the first repeating char
        // because set doesn't  accept same char again

        for (Character ch: str.toCharArray()) if(!characters.add(ch)) return ch;
        return null;
    }
}
