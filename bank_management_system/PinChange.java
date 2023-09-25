package bank_management_system;

import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField pin, repin;
    JButton change, back;
    String pinnumber;

    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250, 280, 500, 35);
        text.setForeground(Color.WHITE);
        image.add(text);

        JLabel pintext = new JLabel("New Pin");
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setBounds(165, 320, 180, 25);
        pintext.setForeground(Color.WHITE);
        image.add(pintext);

        pin = new JPasswordField();
        pin.setBounds(330, 320, 180, 25);
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(pin);

        JLabel repintext = new JLabel("Re-enter New Pin");
        repintext.setFont(new Font("System", Font.BOLD, 16));
        repintext.setBounds(165, 360, 180, 25);
        repintext.setForeground(Color.WHITE);
        image.add(repintext);

        repin = new JPasswordField();
        repin.setBounds(330, 360, 180, 25);
        repin.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(repin);

        change = new JButton("CHANGE");
        change.setForeground(Color.BLACK);
        change.setFont(new Font("Raleway", Font.BOLD, 13));
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Raleway", Font.BOLD, 13));
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
    try {
            String npin = pin.getText();
            String rpin = repin.getText();
            if (!npin.equals(rpin)) {
                JOptionPane.showMessageDialog(null, "Entered PIN does not  match");
            }
                    if(ae.getSource() == change){

            if (npin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter new PIN");
                return;
            }
            if (rpin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
                return;
            }

            Conn conn = new Conn();
            String query1 = "update bank set pin = '" + rpin + "' where pin='" + pinnumber + "'  ";
            String query2 = "update login set pin = '" + rpin + "' where pin='" + pinnumber + "'  ";
            String query3 = "update signupthree set pin_number = '" + rpin + "' where pin_number='" + pinnumber + "'  ";

            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            JOptionPane.showMessageDialog(null, "PIN changed successfully");
            setVisible(false);
            new Transaction(rpin).setVisible(true);
                    }
                    else if(ae.getSource()==back) {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new PinChange("").setVisible(true);
    }

}
