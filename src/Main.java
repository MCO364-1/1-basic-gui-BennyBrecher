import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Benny's Homework");
        window.setSize(800,600);
        window.setLayout(new FlowLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textBox1 = new JTextField(20);
        JTextField textBox2 = new JTextField(20);
        window.add(textBox1);
        window.add(textBox2);

        JButton button = new JButton("Add To Label");

        JLabel label = new JLabel("     ");
        window.add(label);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(textBox1.getText()+textBox2.getText());
            }
        });
        window.add(button);


        window.setVisible(true);
    }
}