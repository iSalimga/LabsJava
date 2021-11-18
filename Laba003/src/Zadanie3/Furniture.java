package Zadanie3;

abstract public class Furniture {
    protected String name;
    protected String material;
    protected double price;
    public Furniture(){
        this.name = "Something";
        this.name = "Something";
        this.price = 0;
    }
    public Furniture(String name, String material, double price){
        this.name = name;
        this.material = material;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public String getMaterial(){
        return this.material;
    }
    public double getPrice(){
        return this.price;
    }
}
