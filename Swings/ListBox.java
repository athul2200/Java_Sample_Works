import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class ListBox{
    public static void main(String[] args) {
        JFrame fr=new JFrame("Factoral Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(null);
        fr.setSize(500,500);

        JTextField tf=new JTextField();
        tf.setBounds(160,40,150,30);

        String[] states={"Kerala","Tamil Nadu","Maharastra"};
        String[] capitals={"Thiruvanthapuram","Chennai","Mumbai"};

        JList sts=new JList<String>(states);
        sts.setBounds(40,40,100,100);

        sts.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e){
                int index=sts.getSelectedIndex();
                tf.setText(capitals[index]);
            }
        });

        fr.setVisible(true);
        fr.add(tf);
        fr.add(sts);
    }
}