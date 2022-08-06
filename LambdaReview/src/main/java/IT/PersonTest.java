package IT;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class PersonTest {
    public static void main(String[] args) {
        Person murat = Person.builder().name("Murat").job(Job.TESTER).team("QA").build();
        Person josh = Person.builder().name("Josh").job(Job.PO).team("Business").build();
        Person kim = Person.builder().name("Kim").job(Job.SCRUM_MASTER).team("Business").build();
        Person susan = Person.builder().name("Susan").job(Job.BIT).team("BIT").build();
        Person paramvir = Person.builder().name("Paramvir").job(Job.TESTER).team("QA").build();
        Person jordan = Person.builder().name("Jordan").job(Job.DEVELOPER).team("Developer").build();
        Person priyanka = Person.builder().name("Priyanka").job(Job.DEVELOPER).team("Developer").build();
        Person jaydeep = Person.builder().name("Jaydeep").job(Job.DEVELOPER).team("Developer").build();

        List<Person>employees=new ArrayList<>(Arrays.asList(murat,josh,kim,susan,paramvir,jordan,priyanka,jaydeep));

        Classification qaFilter=p->p.getJob().equals(Job.TESTER);
        Classification devFilter=p->p.getJob().equals(Job.DEVELOPER);
        Classification businessFilter=p->p.getJob().equals(Job.PO)||p.getJob().equals(Job.SCRUM_MASTER);
        System.out.println("=============QA TEAM================");
        List<Person> qaTeam = employeeFilter(employees, qaFilter);
        System.out.println("qaTeam = " + qaTeam);
        System.out.println("===========DEV TEAM================");
        List<Person> devTeam = employeeFilter(employees, devFilter);
        System.out.println("devTeam = " + devTeam);
        System.out.println("===========BUSINESS TEAM================");
        List<Person> businessTeam = employeeFilter(employees, businessFilter);
        System.out.println("businessTeam = " + businessTeam);



    }
    private static List<Person> employeeFilter(List<Person> list, Classification classification){
        List<Person>result=new ArrayList<>();
        for (Person person:list) {
           if(classification.test(person)) result.add(person);
        }
        return result;
    }

}
