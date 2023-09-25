package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class miniStatement extends JFrame implements ActionListener {
    JButton b1, b2;
    String pinnumber;
    
    
    miniStatement(String pinnumber){
         this.pinnumber=pinnumber;
         
         setLayout(null);
         setTitle("MINI STATEMENT");
           
         JLabel mini = new JLabel();
          mini.setBounds(20, 140, 400, 500);
        add(mini);
        
         JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);
        
          
        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
        
        JLabel l4 = new JLabel();
        l4.setBounds(20, 550, 300, 20);
        add(l4);
        
         try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number:    " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
            }
        }catch(Exception e){
        System.out.println(e);
        }
         try{
            int bal = 0;
            Conn c1  = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    bal += Integer.parseInt(rs.getString("amount"));
                }else{
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            l4.setText("Your total Balance is Rs "+bal);
        }catch(Exception e){
            System.out.println(e);
        }
         
         
        b1 = new JButton("Exit");
         b1.setBounds(20, 600, 100, 25);
        b1.addActionListener(this);
        add(b1);
        
        
        
       
               
        setSize(400,700);
        setLocation(20, 20);
        getContentPane().setForeground(Color.WHITE);   
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
    this.setVisible(false);
     }
     
    public static void main(String args[]){
        new miniStatement("").setVisible(true);
    }
}
