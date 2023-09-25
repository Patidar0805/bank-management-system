package bank_management_system;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Signuppagethree extends JFrame implements ActionListener  {
    
     JRadioButton a1, a2, a3, a4;
     JCheckBox e1, e2, e3, e4, e5, e6, e7;
     JButton submit, cancel;
     String formno;
    
 Signuppagethree( String formno){
     this.formno=formno;
     
     setLayout(null);  
     
     
     JLabel il= new JLabel("Page 3: Account Details");
        il.setFont(new Font("Raleway",Font.BOLD,22));
    il.setBounds(280, 80,400  ,40 );
    add(il);
     
     
     JLabel type= new JLabel("Account Type: ");
     type.setFont(new Font("Raleway",Font.BOLD,22));
    type.setBounds(100, 140,200  ,30 );
    add(type);
    
     a1 = new JRadioButton("Saving Account");
       a1.setFont(new Font("Raleway",Font.BOLD,16));
    a1.setBounds(100, 180, 180, 20);
    a1.setBackground(Color.WHITE); 
      add(a1);
    
    a2 = new JRadioButton("Fixed Deposit Account");
      a2.setFont(new Font("Raleway",Font.BOLD,16));
    a2.setBounds(350, 180, 300, 20);
    a2.setBackground(Color.WHITE);
    add(a2);
      a3 = new JRadioButton("Current Account");
        a3.setFont(new Font("Raleway",Font.BOLD,16));
    a3.setBounds(100, 220, 150, 20);
    a3.setBackground(Color.WHITE); 
      add(a3);
    
    a4 = new JRadioButton("Recuring Deposit Account");
      a4.setFont(new Font("Raleway",Font.BOLD,16));
    a4.setBounds(350, 220, 300, 20);
    a4.setBackground(Color.WHITE);
    add(a4);
     // for grouping of seniorcitizen, yes and no
        ButtonGroup typegroup= new ButtonGroup();
    typegroup.add(a1);
    typegroup.add(a2);
     typegroup.add(a3);
    typegroup.add(a4);
    
    
      JLabel card= new JLabel("Card Number: ");
     card.setFont(new Font("Raleway",Font.BOLD,22));
    card.setBounds(100, 300,200  ,30 );
    add(card);
     
       JLabel number= new JLabel("XXXX-XXXX-XXXX-8050");
     number.setFont(new Font("Raleway",Font.BOLD,22));
    number.setBounds(330 , 300,300  ,30 );
    add(number);
    
     JLabel info= new JLabel("Your 16 Digit Card Number");
     info.setFont(new Font("Raleway",Font.BOLD,12));
    info.setBounds(100, 330,200  ,20 );
    add(info);
     
     JLabel pin= new JLabel("Pin Number: ");
     pin.setFont(new Font("Raleway",Font.BOLD,22));
    pin.setBounds(100, 370,200  ,30 );
    add(pin);
     
       JLabel pnumber= new JLabel("XXXX");
     pnumber.setFont(new Font("Raleway",Font.BOLD,22));
    pnumber.setBounds(330 , 370,300  ,30 );
    add(pnumber);
     JLabel pinfo= new JLabel("Your 4 Digit Pin Number");
     pinfo.setFont(new Font("Raleway",Font.BOLD,12));
    pinfo.setBounds(100, 400,200  ,20 );
    add(pinfo);
     
       JLabel service= new JLabel("Service Required: ");
     service.setFont(new Font("Raleway",Font.BOLD,22));
    service.setBounds(100, 450,400  ,30 );
    add(service);
     
    e1=new JCheckBox ("ATM CARD");
        e1.setFont(new Font("Raleway",Font.BOLD,16));
    e1.setBounds(100,500, 150, 20);
    e1.setBackground(Color.WHITE); 
      add(e1);
    
     e2=new JCheckBox ("Internet Banking");
        e2.setFont(new Font("Raleway",Font.BOLD,16));
    e2.setBounds(350,500, 150, 20);
    e2.setBackground(Color.WHITE); 
      add(e2);
      
       e3=new JCheckBox ("Mobile Banking");
        e3.setFont(new Font("Raleway",Font.BOLD,16));
    e3.setBounds(100,550, 150, 20);
    e3.setBackground(Color.WHITE); 
      add(e3);
      
       e4=new JCheckBox ("Email & SMS Alerts");
        e4.setFont(new Font("Raleway",Font.BOLD,16));
    e4.setBounds(350,550, 150, 20);
    e4.setBackground(Color.WHITE); 
      add(e4);
      
       e5=new JCheckBox ("Cheque book");
        e5.setFont(new Font("Raleway",Font.BOLD,16));
    e5.setBounds(100,600, 150, 20);
    e5.setBackground(Color.WHITE); 
      add(e5);
      
      
       e6=new JCheckBox ("E-Statement");
        e6.setFont(new Font("Raleway",Font.BOLD,16));
    e6.setBounds(350,600, 150, 20);
    e6.setBackground(Color.WHITE); 
      add(e6);
      
       e7=new JCheckBox ("I hereby declares that above entered details are correct to the best of my knowledge");
        e7.setFont(new Font("Raleway",Font.BOLD,12));
    e7.setBounds(100,680, 600 , 20);
    e7.setBackground(Color.WHITE); 
      add(e7);
      
      
       // for next button for next page
    submit= new JButton("Submit");
    submit.setBackground(Color.BLACK);
    submit.setForeground(Color.WHITE);
    submit.setFont(new Font("Raleway", Font.BOLD, 14));
    submit.setBounds(250, 720, 100, 30);
   submit.addActionListener(this);
    add(submit);
    
     // for next button for next page
    cancel= new JButton("Cancel");
    cancel.setBackground(Color.BLACK);
    cancel.setForeground(Color.WHITE);
    cancel.setFont(new Font("Raleway", Font.BOLD, 14));
    cancel.setBounds(420, 720, 100, 30);
     cancel.addActionListener(this);
    add(cancel);
    
         //  for size of frame
     setSize(850,820);
    setLocation(350,10 );
    setVisible(true);

    getContentPane().setBackground(Color.WHITE);  
    
    
   
         
 }   
  
     public void actionPerformed(ActionEvent ae){
         
          if(ae.getSource() == submit){
              String type = null;
         if(a1.isSelected()){
             type ="Saving Account";
         }
         else if(a2.isSelected()){
             type="Fixed Deposit Account";
         }
          else if(a3.isSelected()){
             type="Current Account";
         }
          else if(a4.isSelected()){
             type="Recuring Deposit Account";
         }
         Random random=new Random();
         String cardnumber="" + Math.abs((random.nextLong()%90000000L) + 5040936000000000L);
            String pinnumber="" + Math.abs((random.nextLong()%9000L) + 1000L);
          String facility="";
          if (e1.isSelected()){
              facility= facility + "ATM CARD";
              
          }
          else if (e2.isSelected()){
              facility= facility + "Internet Banking";
              
          } 
           else if (e3.isSelected()){
              facility= facility + "Mobile Banking";
              
          }
           else if (e4.isSelected()){
              facility= facility + "Email & SMS Alerts";
              
          } 
           else if (e5.isSelected()){
              facility= facility + "Cheque book";
              
          } 
           else if (e6.isSelected()){
              facility= facility + "E-Statement";
           }
            try {               
              if(type.equals("")){
               JOptionPane.showMessageDialog(null,"Account Type is required");
              }
              else{
                  Conn conn=new Conn();
                  String query1="insert into signupthree values('"+formno+"','"+type+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                  String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                  conn.s.executeUpdate(query1);
                  conn.s.executeUpdate(query2);
                      
              JOptionPane.showMessageDialog(null, "Card Number:" +cardnumber+ "\n Pin:"+ pinnumber);
                 
              setVisible(false);
              new deposit(pinnumber).setVisible(false);
              
              }
           }
         catch(Exception e){
             System.out.println(e);
         }
          }
          else if(ae.getSource()== cancel){
              setVisible(false);
              new Login().setVisible(true);
          }      
            
         }
 
 public static void main(String []args){
     new Signuppagethree("");
 }
}
