package Book;

import java.util.Scanner;

public class TestBook {
    public static void main (String [] args){
        Book first = new Book();
        Scanner in = new Scanner(System.in);

        String a;
        a = in.nextLine();
        first.setName(a);

        a = in.nextLine();
        first.setAuthor(a);

        a = in.nextLine();
        first.setColor(a);

        int x;

        x = in.nextInt();
        first.setDateOfWritten(x);

        x = in.nextInt();
        first.setPageQuantaty(x);

        System.out.println(first);
    }
}
