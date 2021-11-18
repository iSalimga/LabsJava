package Zadanie3;

import java.util.Scanner;

public class FurnitureShopTest {
    public static void main(String []args){
        FurnitureShop shop1 = new FurnitureShop();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите мебель:");
        shop1.fillFurnitureShop();
        shop1.getShop();
    }
}
