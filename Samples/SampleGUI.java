package Samples;

import javax.swing.*;

public class SampleGUI {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input your name :");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Input your age :"));
        double hight = Double.parseDouble(JOptionPane.showInputDialog("Input your hight :"));
        JOptionPane.showMessageDialog(null,"Hello " + name + "!\n You are " + age + " yars old.\n Your hight is " + hight + " cm");
    }
}
