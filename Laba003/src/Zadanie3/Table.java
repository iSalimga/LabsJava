package Zadanie3;

public class Table extends Furniture{
    protected int legsQuantuty;
    Table(){
        this.name = "Table";
        this.material = "Woodean";
        this.price = 5000;
        this.legsQuantuty = 4;
    }
    Table(int legsQuantuty){
        this.name = "Table";
        this.material = "Iron";
        this.price = 8000;
        this.legsQuantuty = legsQuantuty;
    }
    Table(String name, String material, double price, int legsQuantaty){
        this.name = name;
        this.material = material;
        this.price = price;
        this.legsQuantuty = legsQuantaty;
    }
    public int getLegsQuantuty(){
        return legsQuantuty;
    }
    public String toString(){
        return "Name: "+this.getName()+" Material: "+this.getMaterial()+" Price: "+this.getPrice()+" Legs quantuty: "+this.getLegsQuantuty();
    }
}
