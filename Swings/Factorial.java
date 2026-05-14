import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class Factorial{
    public static void main(String[] args) {
        JFrame fr=new JFrame("Factoral Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(null);
        fr.setSize(500,500);

        JLabel lblNum=new JLabel("Enter a Number:");
        lblNum.setBounds(10,10,100,40);
        JTextField tfNum=new JTextField();
        tfNum.setBounds(110,20,100,30);

        JLabel lblFact=new JLabel("Factorial:");
        lblFact.setBounds(10,40,100,40);
        JTextField tfFact=new JTextField();
        tfFact.setBounds(110,50,100,30);

        JButton btn=new JButton("Find");
        btn.setBounds(50,100,60,40);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int n=Integer.parseInt(tfNum.getText());
                int fact=1;
                for(int i=1;i<=n;i++){
                    fact*=i;
                }
                tfFact.setText(Integer.toString(fact));
            }
        });

        fr.add(lblNum);
        fr.add(tfNum);
        fr.add(lblFact);
        fr.add(tfFact);
        fr.add(btn);
        fr.setVisible(true);

    }
}