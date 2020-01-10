
import java.awt.event.*;
import javax.swing.*;


public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        final JLabel display = new JLabel();
        display.setBounds(0,0,125,400);
        display.setText("0");
        JButton eqButton = new JButton("=");
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton multButton = new JButton("×");
        JButton divButton = new JButton("÷");
        JButton decButton = new JButton(".");
        JButton threeButton = new JButton("3");
        JButton sixButton = new JButton("6");
        JButton nineButton = new JButton("9");
        JButton percButton = new JButton("%");
        /* JButton posnegButton = new JButton("+/-");
        JButton clearButton = new JButton("AC");
        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton zeroButton = new JButton("0"); */
        eqButton.setBounds (150,325,50,50);
        addButton.setBounds(150,275,50,50);
        subButton.setBounds(150,225,50,50);
        multButton.setBounds(150,175,50,50);
        divButton.setBounds(150,125,50,50);
        decButton.setBounds (100,325,50,50);
        threeButton.setBounds(100,275,50,50);
        sixButton.setBounds(100,225,50,50);
        nineButton.setBounds(100,175,50,50);
        percButton.setBounds(100,125,50,50);

        threeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("3");
            }
        });
        f.add(eqButton);
        f.add(addButton);
        f.add(subButton);
        f.add(multButton);
        f.add(divButton);
        f.add(decButton);
        f.add(threeButton);
        f.add(sixButton);
        f.add(nineButton);
        f.add(percButton);
        f.add(display);
        f.setSize(200,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
