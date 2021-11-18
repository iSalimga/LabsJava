package Zadanie3;

public class Chair extends Table{
    Chair(){
        this.name = "Chair";
        this.material = "Plastic";
        this.price = 600;
        this.legsQuantuty = 4;
    }
    Chair(int legsQuantuty){
        this.name = "Chair";
        this.material = "Iron";
        this.price = 700;
        this.legsQuantuty = legsQuantuty;
    }
    Chair(String name, String material, double price, int legsQuantuty){
        this.name = name;
        this.material = material;
        this.price = price;
        this.legsQuantuty = legsQuantuty;
    }
    public String toString(){
        return "Name: "+this.getName()+" Material: "+this.getMaterial()+" Price: "+this.getPrice()+" Legs quantuty: "+this.getLegsQuantuty();
    }
}
