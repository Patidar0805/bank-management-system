package bank_management_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class fastCash extends JFrame implements ActionListener{
   JButton back, rs1 , rs2 , rs3, rs4, rs5, rs6;
    String pinnumber;    
    fastCash(String pinnumber){
        this.pinnumber =pinnumber;
        setLayout(null);

    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
    ImageIcon i3= new ImageIcon(i2);
    JLabel image= new JLabel(i3 );
    image .setBounds(0,0,900,900);
    add (image);
    
    JLabel  text= new JLabel("SELECT WITHDRAWL AMOUNT" );
    text.setFont(new Font("System",Font.BOLD,16));
    text.setBounds(210, 300,700  ,35  );
    text.setForeground(Color.WHITE);   
    image.add(text);
    
      // for next button for next page
    rs1= new JButton("RS 100");
    rs1.setForeground(Color.BLACK);
    rs1.setFont(new Font("Raleway", Font.BOLD, 13));
    rs1.setBounds(170, 415, 150, 30);
    rs1.addActionListener(this);
    image.add(rs1);
    
    rs2= new JButton("RS 500");
    rs2.setForeground(Color.BLACK);
    rs2.setFont(new Font("Raleway", Font.BOLD, 13));
    rs2.setBounds(355, 415, 150, 30);
    rs2.addActionListener(this);
    image.add(rs2);
    
        rs3= new JButton("RS 1000");
      rs3.setForeground(Color.BLACK);
    rs3.setFont(new Font("Raleway", Font.BOLD, 13));
    rs3.setBounds(170, 450, 150, 30);
   rs3.addActionListener(this);
    image.add(rs3);
    
    
     rs4= new JButton("RS 2000");
     rs4.setForeground(Color.BLACK);
    rs4.setFont(new Font("Raleway", Font.BOLD, 13));
    rs4.setBounds(355, 450, 150, 30);
   rs4.addActionListener(this);
    image.add(rs4);
    
    
     rs5= new JButton("RS 5000");
    rs5.setForeground(Color.BLACK);
    rs5.setFont(new Font("Raleway", Font.BOLD, 13));
    rs5.setBounds(170, 485, 150, 30);
   rs5.addActionListener(this);
    image.add(rs5);
    
       rs6= new JButton("RS 10000");
     rs6.setForeground(Color.BLACK);
    rs6.setFont(new Font("Raleway", Font.BOLD, 13));
    rs6.setBounds(355, 485, 150, 30);
   rs6.addActionListener(this);
    image.add(rs6 );
    
     back= new JButton("BACK");
    back.setForeground(Color.BLACK);
    back.setFont(new Font("Raleway", Font.BOLD, 13));
    back.setBounds(355, 520, 150, 30); 
    back.addActionListener(this);
    image.add(back );
    
    //  for size of frame
    setSize(900,900);  
    setLocation(300,0 );
    setUndecorated(true);
    setVisible(true);

    }
   
     public void actionPerformed(ActionEvent ae){
            
            try{ 
                
            
                String Amount =((JButton)ae.getSource()).getText().substring(3);
                Conn c= new Conn();
                 ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                 int balance =0;
                 while(rs.next()){
                     if(rs.getString("type").equals("Deposit")){
                         balance += Integer.parseInt(rs.getString("Amount"));
                     }
                     else{
                         balance -= Integer.parseInt(rs.getString("Amount"));
                     }
                 }
                 if(ae.getSource() != back && balance < Integer.parseInt(Amount)){
                     JOptionPane.showMessageDialog(null, "Insufficient Balance");
                     return;
                 }
                     if(ae.getSource() == back){
                    setVisible(false);
                     new Transaction(pinnumber).setVisible(true);
             
                     }
                     else {
         
                 Date date =  new Date();
                // String query="insert into bank values('"+pinnumber+"', '"+date+"','Withdrawl','"+amount+"')";
                 c.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"','Withdrawl','"+Amount+"')");
                JOptionPane.showMessageDialog(null, "Rs "+Amount+ "Debited sucessfully"); 
            setVisible(false);
              new Transaction(pinnumber).setVisible(true);
             
            }
     }
            catch(Exception e){
                System.out.println(e);
                     
                
            }
         }
       
     
    
    
    public static void main(String args[]){
        new fastCash(""); 
    }
}
