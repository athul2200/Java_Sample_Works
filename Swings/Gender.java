import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Gender{
    public static void main(String[]args){
        JFrame fr=new JFrame("Factoral Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(null);
        fr.setSize(700,500);

        JLabel lbl1=new JLabel("Enter Name:");
        lbl1.setBounds(10,10,100,40);
        JTextField tf1=new JTextField();
        tf1.setBounds(110,20,100,30);

        JLabel lbl2=new JLabel("Name:");
        lbl2.setBounds(10,40,100,40);
        JTextField tf2=new JTextField();
        tf2.setBounds(110,50,100,30);

        JRadioButton rbM=new JRadioButton("Male");
        rbM.setBounds(320,30,200,40);
        JRadioButton rbF=new JRadioButton("Female");
        rbF.setBounds(320,60,200,40);

        ButtonGroup grp=new ButtonGroup();
        grp.add(rbM);
        grp.add(rbF);

        rbM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf2.setText("Mr."+tf1.getText());
            }
        });

        rbF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf2.setText("Mrs."+tf1.getText());
            }
        });

        fr.setVisible(true);
        fr.add(lbl1);
        fr.add(tf1);
        fr.add(lbl2);
        fr.add(tf2);
        fr.add(rbM);
        fr.add(rbF);
    }
}