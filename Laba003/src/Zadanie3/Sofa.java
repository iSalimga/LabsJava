package Zadanie3;

public class Sofa extends Furniture{
    protected double lenght;
    Sofa(){
        this.name = "Sofa";
        this.material = "Woolen";
        this.price = 12000;
        this.lenght = 3;
    }
    Sofa(double lenght){
        this.name = "Sofa";
        this.material = "Woolen";
        this.price = 10000;
        this.lenght = lenght;
    }
    Sofa (String name, String material, double price, double lenght){
        this.name = name;
        this.material = material;
        this.price = price;
        this.lenght = lenght;
    }
    public double getLenght(){
        return this.lenght;
    }
    public String toString(){
        return "Name: "+this.getName()+" Material: "+this.getMaterial()+" Price: "+this.getPrice()+" Lenght: "+this.getLenght();
    }

}
