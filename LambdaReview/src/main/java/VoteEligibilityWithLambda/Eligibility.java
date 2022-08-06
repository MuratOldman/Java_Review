package VoteEligibilityWithLambda;

@FunctionalInterface
public interface Eligibility {

    boolean eligibility(Human human);
}
