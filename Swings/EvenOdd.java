import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class EvenOdd{
    public static void main(String[] args) {
        JFrame fr=new JFrame("Factoral Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(null);
        fr.setSize(500,500);

        JLabel lbl1=new JLabel("Enter a Number:");
        lbl1.setBounds(10,10,100,30);
        JTextField tf1=new JTextField();
        tf1.setBounds(110,20,100,20);

        JLabel lbl2=new JLabel("Result:");
        lbl2.setBounds(10,50,100,30);
        JTextField tf2=new JTextField();
        tf2.setBounds(110,60,100,20);

        JButton btn=new JButton("Find");
        btn.setBounds(50,110,80,20);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int n=Integer.parseInt(tf1.getText());
                if(n%2==0){
                    tf2.setText("Even");
                }else{
                    tf2.setText("Odd");
                }
            }
        });

        fr.add(lbl1);
        fr.add(lbl2);
        fr.add(tf1);
        fr.add(tf2);
        fr.add(btn);
        fr.setVisible(true);

    }
}