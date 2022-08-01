import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        // Add Elements to ArrayList
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));
     //   System.out.println(students);
        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        //   for(int i=0; i<students.size();i++) System.out.println(students.get(i));
        // 2. Iterator
        // Forward Iteration
        System.out.println("Printing with Iterator Forward........");

        Iterator iterator=students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        Iterator iter=students.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }

        // Backwards Iteration
        System.out.println("Printing with Iterator Backwards........");

        while (((ListIterator<?>)iterator).hasPrevious()){
            System.out.println(((ListIterator<?>)iterator).previous());
        }

        // 3. for each loop
        System.out.println("Printing For each loop..........");
        for(Student student:students) System.out.println(student);

        System.out.println("Printing with Lambda..........");
        // 4. Lambda

        students.forEach(each-> System.out.println(each));

        // Sorting Elements in List
        System.out.println("Printing with sorted List by comp..........");
        Collections.sort(students,new sortedByIdDesc());
        System.out.println(students);

        System.out.println("Printing with sorted List by Name Desc..........");
        Collections.sort(students,new sortedByNameDesc());
        System.out.println(students);


    }

    static class sortedByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id; // this means from biggest id to the lowest
        }
    }

    static class sortedByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
