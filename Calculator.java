
import java.awt.event.*;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        final JTextField display = new JTextField();
        display.setBounds(50,50,150,50);
        JButton eqButton = new JButton("=");
        JButton multButton = new JButton("×");
        JButton divButton = new JButton("÷");
        JButton percButton = new JButton("%");
        JButton posnegButton = new JButton("+/-");
        JButton clearButton = new JButton("AC");
        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton zeroButton = new JButton("0");
        eqButton.setBounds(350,450,40,40);
        eqButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("=");
            }
        });
        f.add(eqButton);
        f.add(display);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
