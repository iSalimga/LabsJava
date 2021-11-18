package Laba003;

public class Car implements Nameable  {
    private String name;
    Car(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
