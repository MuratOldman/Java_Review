package VoteEligibilityWithLambda;

public class Human  {

    private String name;
    public int SSN;
    private int age;
    private boolean mentalHealth;

    public Human(String name, int SSN, int age, boolean mentalHealth) {
        this.name = name;
        this.SSN = SSN;
        this.age = age;
        this.mentalHealth = mentalHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMentalHealth() {
        return mentalHealth;
    }

    public void setMentalHealth(boolean mentalHealth) {
        this.mentalHealth = mentalHealth;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", SSN=" + SSN +
                ", age=" + age +
                ", mentalHealth=" + mentalHealth +
                '}';
    }

}
