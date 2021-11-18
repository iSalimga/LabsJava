package Zadanie3;
import java.util.ArrayList;
import java.util.Scanner;
public class FurnitureShop {
    private ArrayList <Furniture> shop = new ArrayList<>();
    Scanner in = new Scanner (System.in);
    public void fillFurnitureShop() {
        String furniture = in.nextLine();
        if (!furniture.equals("end")) {
            switch (furniture) {
                case ("sofa"): {
                    System.out.println("Name Material Price Lenght");
                    String name = in.next();
                    String material = in.next();
                    double price = in.nextDouble();
                    double lenght = in.nextDouble();
                    shop.add(new Sofa(name, material, price, lenght));
                    break;
                }
                case ("Sofa"): {
                    System.out.println("Name Material Price Lenght");
                    String name = in.next();
                    String material = in.next();
                    double price = in.nextDouble();
                    double lenght = in.nextDouble();
                    shop.add(new Sofa(name, material, price, lenght));
                    break;
                }
                case ("table"): {
                    System.out.println("Name Material Price Legs quantaty");
                    String name = in.next();
                    String material = in.next();
                    double price = in.nextDouble();
                    int legsQuantuty = in.nextInt();
                    shop.add(new Table(name, material, price, legsQuantuty));


                    break;
                }
                case ("Table"): {
                    System.out.println("Name Material Price Legs quantaty");
                    String name = in.next();
                    String material = in.next();
                    double price = in.nextDouble();
                    int legsQuantuty = in.nextInt();
                    shop.add(new Table(name, material, price, legsQuantuty));
                    break;
                }
                case ("chair"): {
                    System.out.println("Name Material Price Legs quantaty");
                    String name = in.next();
                    String material = in.next();
                    double price = in.nextDouble();
                    int legsQuantuty = in.nextInt();
                    shop.add(new Chair(name, material, price, legsQuantuty));
                    break;
                }
                case ("Chair"): {
                    System.out.println("Name Material Price Legs quantaty");
                    String name = in.next();
                    String material = in.next();
                    double price = in.nextDouble();
                    int legsQuantuty = in.nextInt();
                    shop.add(new Chair(name, material, price, legsQuantuty));
                    break;
                }
            }
            this.fillFurnitureShop();
        }
        }

    public void getShop() {
        if (shop.size()> 0) {
            for (int i = 0; i < shop.size();i++) {
                System.out.println(shop.get(i));
            }
        } else {
            System.out.println("Магазин пуст");
        }
    }
}
