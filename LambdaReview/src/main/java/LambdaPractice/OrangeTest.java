package LambdaPractice;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange>inventory=new ArrayList<>();

        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(Orange.builder().color(Color.GREEN).weight(150).build());
        inventory.add(Orange.builder().color(Color.RED).weight(150).build());
        inventory.add(Orange.builder().color(Color.GREEN).weight(260).build());
        inventory.add(Orange.builder().color(Color.RED).weight(150).build());
        inventory.add(Orange.builder().color(Color.GREEN).weight(250).build());

      //  System.out.println("inventory = " + inventory);

        OrangeFormatter simpleFormatter=(orange)->"An orange of "+orange.getWeight()+"g";
        prettyPrint(inventory,simpleFormatter);

        OrangeFormatter fancyFormatter= orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A "+characteristic+" "+orange.getColor()+" orange";
        };
        prettyPrint(inventory,fancyFormatter);


    }

    private static void prettyPrint(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange:inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println("output = " + output);
        }
        
    }
}
