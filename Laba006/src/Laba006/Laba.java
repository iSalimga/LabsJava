package Laba006;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Laba extends JFrame {
    public static void main (String []args){
        Laba example = new Laba();
    }
    public Laba(){
        JFrame frame = new JFrame("Example");
        JTextArea text = new JTextArea();
        JMenuBar menu = new JMenuBar();
        frame.add(text);
        menu.add(addColorMenu(text));
        menu.add(addFont(text));
        frame.setJMenuBar(menu);
        frame.setSize(600,300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    public JMenu addColorMenu(JTextArea text){
        JMenu color = new JMenu("Color");
        JMenuItem black = new JMenuItem("Black");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem blue = new JMenuItem("Blue");
        color.add(black);
        color.add(red);
        color.add(blue);
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLACK);
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.RED);
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLUE);
            }
        });
        return color;
    }
    public JMenu addFont(JTextArea text){
        JMenu font = new JMenu("Font");
        JMenuItem newTimeRoman = new JMenuItem("New Times Roman");
        JMenuItem msSanSerif = new JMenuItem("MS San Serif");
        JMenuItem courierNew = new JMenuItem("Courier New");
        font.add(newTimeRoman);
        font.add(msSanSerif);
        font.add(courierNew);
        newTimeRoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Times New Roman",Font.PLAIN,12));
            }
        });
        msSanSerif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("MS San Serif", Font.PLAIN, 12));
            }
        });
        courierNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Courier New",Font.PLAIN,12));
            }
        });
        return font;
    }
}
