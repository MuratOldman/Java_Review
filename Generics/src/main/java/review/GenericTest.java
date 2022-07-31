package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) throws Exception {

       Tester murat=new Tester("murat",123);
       Tester paramvir=new Tester("paramvir",124);
       Tester alex=new Tester("alex",125);

        Developer jaydeep =new Developer("jaydeep",223);
        Developer priyanka =new Developer("priyanka",224);
       List<Tester>qa=new ArrayList<>();
       List<Developer>dev=new ArrayList<>(Arrays.asList(jaydeep,priyanka));
        qa.addAll(Arrays.asList(murat,paramvir,alex));

        Developer anelka=new Developer("anelka", 255);


       MyUtils myUtils=new MyUtils();
       myUtils.addEmployee(anelka,dev);
      // myUtils.addEmployee("nelka",dev);

       myUtils.printInfos(qa);
       myUtils.printInfos(dev);


    }
}
