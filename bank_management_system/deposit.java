
package bank_management_system;
import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
import java.util.*;


public class deposit extends JFrame implements ActionListener {
    JTextField amount;
    JButton deposit, back, exit;
    String pinnumber;
    
    
    deposit(String pinnumber){
        this.pinnumber= pinnumber;
        
              setLayout(null);
              
              
              
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
    ImageIcon i3= new ImageIcon(i2);
    JLabel image= new JLabel(i3 );
    image .setBounds(0,0,900,900);
    add (image);
    
    
     JLabel  text= new JLabel("Enter the amount you want to deposit " );
    text.setFont(new Font("System",Font.BOLD,16));
    text.setBounds(170, 300,400  ,20);
    text.setForeground(Color.WHITE);   
    image.add(text);
    
    
       amount=new JTextField();
    amount.setBounds(170, 350, 320, 25);
     amount.setFont(new Font("Raleway", Font.BOLD,22));
    image.add(amount);
    
      // for next button for next page
    deposit= new JButton("Deposit");
    deposit.setForeground(Color.BLACK);
    deposit.setFont(new Font("Raleway", Font.BOLD, 13));
    deposit.setBounds(355, 485, 150, 30);
       deposit.addActionListener(this);
    image.add(deposit);
    
       back= new JButton("Back");
    back.setForeground(Color.BLACK);
    back.setFont(new Font("Raleway", Font.BOLD, 13));
    back.setBounds(355, 520, 150, 30);
    back.addActionListener(this);
    image.add(back);
    
     exit= new JButton("Exit");
    exit.setForeground(Color.BLACK);
    exit.setFont(new Font("Raleway", Font.BOLD, 13));
    exit.setBounds(170, 520, 150, 30);
    exit.addActionListener(this);
    image.add(exit );
    
            //  for size of frame
    setSize(900,900);  
    setLocation(300,0 );
    setUndecorated(true);
    setVisible(true);

        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== deposit){
              String number= amount.getText();
              Date date= new Date();
              if(number.equals("")){
                  JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
              } 
              else{
                  try{
                  Conn conn= new Conn();
                  String query="insert into bank values('"+pinnumber+"', '"+date+"','Deposit','"+number +"')";
                  conn.s.executeUpdate(query);
                  JOptionPane.showMessageDialog(null, "Rs"+ number+" Deposited Successfully");
                 setVisible(false);
             new Transaction(pinnumber).setVisible(true);
                  }
              catch(Exception e){
               System.out.println(e);
              }
              }
        }
        else if (ae.getSource()== back){
        setVisible(false);
             new Transaction(pinnumber).setVisible(true);
    }
       else if(ae.getSource() == exit){
             System.exit(0);   
         }
    }  
     
    
    
    public static void main(String args[]){
        new deposit("");
    }
}
