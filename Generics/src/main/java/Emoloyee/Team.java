package Emoloyee;

import java.util.ArrayList;

public class Team <T extends Employee>{

    private String name;

    private ArrayList<T>members=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addEmployee(T employee){
        if(members.contains(employee)){
            System.out.println(employee.getName()+" is already a member");
            return false;
        }else{
            members.add(employee);
            System.out.println(employee.getName()+" added");
            return true;
        }
    }
    public int numEmployees(){
        return this.members.size();
    }

}
