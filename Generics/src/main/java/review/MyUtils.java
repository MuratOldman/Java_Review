package review;

import java.util.ArrayList;
import java.util.List;

public class MyUtils<T > {

     public void printInfos(List<T> list){
         for (T each:list) {
             System.out.println(each);
         }
         System.out.println("Total number: "+list.size());
     }

     public void addEmployee(T employee, List<T> list) throws Exception {
         if(employee instanceof Developer && !list.contains(employee)){
             list.add(employee);

         }else if(employee instanceof Tester && !list.contains(employee)){
             list.add(employee);

         }else{
             throw new Exception(employee+ " is not instance of related class");
         }
     }
}
