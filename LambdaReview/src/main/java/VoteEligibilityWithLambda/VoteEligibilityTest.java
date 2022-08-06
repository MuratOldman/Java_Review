package VoteEligibilityWithLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class VoteEligibilityTest {
    public static void main(String[] args) {
   

        List<Human>humans=new ArrayList<>();

        humans.add(new Human("Alex",123456, 18, true));
        humans.add(new Human("Dora",123556, 28, false));
        humans.add(new Human("Ali",173456, 15, true));
        humans.add(new Human("John",126456, 44, true));
        humans.add(new Human("Josh",223456, 21, false));
        humans.add(new Human("Kim",123458, 17, true));


        List<Human>eligibleHumans=new ArrayList<>();
        List<Human>notEligibleHumans=new ArrayList<>();

        Predicate<Human>eligible=h-> h.isMentalHealth() && h.getAge()>=18;
        for (Human each:humans) {
            if(eligible.test(each)){
                eligibleHumans.add(each);
            }else {
                notEligibleHumans.add(each);
            }
        }

        System.out.println("eligibleHumans = " + eligibleHumans);
        System.out.println("===============================");
        System.out.println("notEligibleHumans = " + notEligibleHumans);

           Eligibility voteEligibility=h->h.isMentalHealth()&&h.getAge()>=18;
           Eligibility drive=h->h.getAge()>16;

        System.out.println("===============================");
        List<Human> drivers = eligiblePersons(humans, drive);
        System.out.println("drivers = " + drivers);
        System.out.println("===============================");
        List<Human> voters = eligiblePersons(humans, voteEligibility);
        System.out.println("voters = " + voters);

    }
    private static List<Human> eligiblePersons(List<Human> list, Eligibility eligibility){
        ArrayList<Human>eligibilityList=new ArrayList<>();
        for (Human each:list) {
            if(eligibility.eligibility(each)){
                eligibilityList.add(each);
            }
        }
        return eligibilityList;
    }
}
