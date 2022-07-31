package Emoloyee;

public class TeamTest {
    public static void main(String[] args) {

        Business josh=new Business("josh", 123);
        Business kim=new Business("kim",124);

        Tech murat=new Tech("murat", 222);
        Tech susan=new Tech("susan",223);

        Team<Tech>techTeam=new Team<>("techTeam");
        Team<Business>businessTeam=new Team<>("businessTeam");

        businessTeam.addEmployee(josh);
        businessTeam.addEmployee(kim);



        techTeam.addEmployee(murat);
        techTeam.addEmployee(susan);

        System.out.println("techTeam.numEmployees() = " + techTeam.numEmployees());
        System.out.println("businessTeam.numEmployees() = " + businessTeam.numEmployees());

    }
}
