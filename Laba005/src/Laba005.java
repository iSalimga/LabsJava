import javax.swing.*;
import java.awt.*;

class Laba005 extends JFrame {
    public static void main (String []args) {
        JFrame frame = new JFrame("Examplpe");

        ImageIcon img1 = new ImageIcon("f1.jpg");
        ImageIcon img2 = new ImageIcon("f2.jpg");
        ImageIcon img3 = new ImageIcon("f3.jpg");
        ImageIcon img4 = new ImageIcon("f4.jpg");
        ImageIcon img5 = new ImageIcon("f5.jpg");
        ImageIcon img6 = new ImageIcon("f6.jpg");
        ImageIcon[] img = new ImageIcon[]{img1, img2, img3, img4, img5, img6};
        JLabel picLabel = new JLabel();
        frame.setVisible(true);
        frame.add(picLabel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(80, 311);
        while (frame.isActive()) {
           for (int i = 0; i < 6; i++) {
                picLabel.setIcon(img[i]);
                try {Thread.sleep(100);}
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }



    }
}
