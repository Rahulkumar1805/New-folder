import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JButton addButton;
    JTextField t1, t2, t3;

    test() {
        l1 = new JLabel("Enter the value of A:");
        t1 = new JTextField("0", 10);
        l2 = new JLabel("Enter the value for B:");
        t2 = new JTextField("0", 10);
        l3 = new JLabel("Sum of A and B:");
        t3 = new JTextField("0", 10);
        addButton = new JButton("Add"); // Initialize the JButton
        //resetButton = new JButton("Reset");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(addButton); 
        //add(resetButton);// Add the button to the frame
        addButton.addActionListener(this);
        //resetButton.addActionListener(this);

        // Use appropriate layout manager, e.g., GridLayout
        setLayout(new GridLayout(4, 3));
        setSize(400, 400);
        setTitle("Addition");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
            float n1 = Float.parseFloat(t1.getText());
            float n2 = Float.parseFloat(t2.getText());
            float sum = n1 + n2;
            t3.setText(Float.toString(sum));
        }

    public static void main(String[] args) {
        test obj = new test();
        obj.setVisible(true);
        //new
    }
}
