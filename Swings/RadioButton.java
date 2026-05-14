import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class RadioButton{
    public static void main(String[]args){
        JFrame fr=new JFrame("Factoral Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(null);
        fr.setSize(700,500);

        JLabel lblRate=new JLabel("Enter Rate:");
        lblRate.setBounds(10,10,100,40);
        JTextField tfRate=new JTextField();
        tfRate.setBounds(110,20,100,30);

        JLabel lblQty=new JLabel("Enter Quantity:");
        lblQty.setBounds(10,40,100,40);
        JTextField tfQty=new JTextField();
        tfQty.setBounds(110,50,100,30);

        JLabel lblAmt=new JLabel("Amount:");
        lblAmt.setBounds(10,70,100,40);
        JTextField tfAmt=new JTextField();
        tfAmt.setBounds(110,80,100,30);

        JLabel lblTotal=new JLabel("Total Amount:");
        lblTotal.setBounds(10,100,100,40);
        JTextField tfTotal=new JTextField();
        tfTotal.setBounds(110,110,100,30);

        JRadioButton rbCos=new JRadioButton("10% GST of Cosmetics");
        rbCos.setBounds(320,30,200,40);
        JRadioButton rbVeg=new JRadioButton("5% GST of Vegitables");
        rbVeg.setBounds(320,60,200,40);

        ButtonGroup grp=new ButtonGroup();
        grp.add(rbCos);
        grp.add(rbVeg);

        JButton btn=new JButton("Calculate");
        btn.setBounds(320,150,130,30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int rate=Integer.parseInt(tfRate.getText());
                int qty=Integer.parseInt(tfQty.getText());
                int amt=rate*qty;
                tfAmt.setText(Integer.toString(amt));
            }
        });

        rbCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int total=Integer.parseInt(tfAmt.getText());
                tfTotal.setText(Float.toString(total+total*0.10F));
            }
        });

        rbVeg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int total=Integer.parseInt(tfAmt.getText());
                tfTotal.setText(Float.toString(total+total*0.05F));
            }
        });

        fr.setVisible(true);
        fr.add(lblRate);
        fr.add(tfRate);
        fr.add(lblQty);
        fr.add(tfQty);
        fr.add(lblAmt);
        fr.add(tfAmt);
        fr.add(lblTotal);
        fr.add(tfTotal);
        fr.add(btn);
        fr.add(rbCos);
        fr.add(rbVeg);
    }
}