
import java.awt.event.*;
import javax.swing.*;


public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        final JLabel display = new JLabel();
        display.setBounds(180,-100,125,400);
        display.setText("0");
        JButton eqButton = new JButton("=");
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton multButton = new JButton("×");
        JButton divButton = new JButton("÷");
        JButton decButton = new JButton(".");
        JButton posnegButton = new JButton("+/-");
        JButton zeroButton = new JButton("0");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton eightButton = new JButton("8"); 
        JButton nineButton = new JButton("9");
        JButton percButton = new JButton("%");
        JButton clearButton = new JButton("AC");
        JButton oneButton = new JButton("1");
        JButton fourButton = new JButton("4");
        JButton sevenButton = new JButton("7");

        eqButton.setBounds (150,325,50,50);
        addButton.setBounds(150,275,50,50);
        subButton.setBounds(150,225,50,50);
        multButton.setBounds(150,175,50,50);
        divButton.setBounds(150,125,50,50);
        decButton.setBounds (100,325,50,50);
        zeroButton.setBounds (0,325,100,50);
        oneButton.setBounds(0,275,50,50);
        twoButton.setBounds(50,275,50,50);
        threeButton.setBounds(100,275,50,50);
        fourButton.setBounds(0,225,50,50);
        fiveButton.setBounds(50,225,50,50);
        sixButton.setBounds(100,225,50,50);
        sevenButton.setBounds(0,175,50,50);
        eightButton.setBounds(50,175,50,50);
        nineButton.setBounds(100,175,50,50);
        posnegButton.setBounds(50,125,50,50);
        clearButton.setBounds(0,125,50,50);
        percButton.setBounds(100,125,50,50);

        f.add(eqButton);
        f.add(addButton);
        f.add(subButton);
        f.add(multButton);
        f.add(divButton);
        f.add(decButton);
        f.add(zeroButton);
        f.add(oneButton);
        f.add(twoButton);
        f.add(threeButton);
        f.add(fourButton);
        f.add(fiveButton);
        f.add(sixButton);
        f.add(sevenButton);
        f.add(eightButton);
        f.add(nineButton);
        f.add(posnegButton);
        f.add(clearButton);
        f.add(percButton);
        f.add(display);
        f.setSize(200,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
