
package bank_management_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;




public class Signuppagetwo  extends JFrame implements ActionListener {
     JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton ayes, ano, eyes ,eno;
    JComboBox relegion, category, income, qualification, occuption;
    String formno;
    
    Signuppagetwo(String formno){
        this.formno=formno;
   
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setLayout(null);
        
         JLabel  additionalDetails= new JLabel("Page 2: Additional Details" );
    additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
    additionalDetails.setBounds(290, 80,400  ,30 );
    add(additionalDetails);
      // for  religion
         JLabel  Religion= new JLabel("Religion:" );
    Religion.setFont(new Font("Raleway",Font.BOLD,22));
    Religion.setBounds(100, 140,100  ,30 );
    add(Religion);
    
    // for religion inputfield
    String valRelegion[]={"HINDU", "MUSLIM", "SIKH", "CHRISTIAN","OTHER"};
   relegion= new JComboBox(valRelegion);
   relegion.setBounds(300, 140, 400, 30);
   relegion.setFont(new Font("Raleway", Font.BOLD,14));
   relegion.setBackground(Color.WHITE);
    add(relegion);
        
        
    
     // for category
    JLabel  Category= new JLabel("Category:" );
    Category.setFont(new Font("Raleway",Font.BOLD,22));
    Category.setBounds(100, 190,200  ,30 );
      add(Category);
     
      // for category's inputfield 
  String scategory[]={"GENERAL", "OBC", "SC", "ST","OTHER"};
  category= new JComboBox(scategory);
  category.setBounds(300, 190, 400, 30);
  category.setFont(new Font("Raleway", Font.BOLD,14));
  category.setBackground(Color.WHITE);  
  add(category);
  
  
  // for income
    JLabel  Income= new JLabel("Income:" );
    Income.setFont(new Font("Raleway",Font.BOLD,22));
    Income.setBounds(100, 240,200  ,30 );
    add(Income);
    
    // for income inputfield
    String valIncome[]={"NULL", "<1,50,000", "<2,50,000", "<5,00,000","UPTO 10,00,000"};
    income= new JComboBox(valIncome);
    income.setBounds(300, 240, 400, 30);
    income.setFont(new Font("Raleway", Font.BOLD,14));
    income.setBackground(Color.WHITE);  
    add(income);
    
    
      // for educational quification
        JLabel  Educational= new JLabel("Educational" );
     Educational.setFont(new Font("Raleway",Font.BOLD,22));
    Educational.setBounds(100, 290,200  ,30 );
    add(Educational);
  
        JLabel  Qualification= new JLabel("Qualification:" );
     Qualification.setFont(new Font("Raleway",Font.BOLD,22));
    Qualification.setBounds(100, 315,200  ,30 );
    add(Qualification);
    
      // for educational quification's inputfield
     String valqualification[]={"NON-GRADUATION", "GRADUATE", "POST-GRADUATION", "DOCTRATE","OTHERS"};
  qualification= new JComboBox(valqualification);
  qualification.setBounds(300, 315, 400, 30);
  qualification.setFont(new Font("Raleway", Font.BOLD,14));
  qualification.setBackground(Color.WHITE);  
  add(qualification);
  
  
    // for occuption
        JLabel  Occuption= new JLabel("Occuption:" );
     Occuption.setFont(new Font("Raleway",Font.BOLD,22));
    Occuption.setBounds(100, 390,200  ,30 );
    add(Occuption);
    
    
    
    // for occuption's inputfield
       String valOccuption[]={"SALARIED", "SELF-EMPLOYED", "BUSINESSMAN", "STUDENT","RETIRED","OTHERS"};
  occuption= new JComboBox(valOccuption);
  occuption.setBounds(300, 390, 400, 30);
  occuption.setFont(new Font("Raleway", Font.BOLD,14));
  occuption.setBackground(Color.WHITE);  
  add(occuption);
        
   // for pancard no.
          JLabel Pan = new JLabel("Pan Number:" );
     Pan.setFont(new Font("Raleway",Font.BOLD,22));
    Pan.setBounds(100, 440,200  ,30 );
    add(Pan);
    
    // for pancard's textfield
      panTextField=new JTextField();
    panTextField.setBounds(300, 440, 400, 30);
    panTextField.setFont(new Font("Raleway", Font.BOLD,14));
    add(panTextField);
    
    
    
     // for aadharno
     JLabel aadharno= new JLabel("Aadhar Number:" );
     aadharno.setFont(new Font("Raleway",Font.BOLD,22));
    aadharno.setBounds(100, 490,200  ,30 );
    add(aadharno);
    // for aadharno's textfield
     aadharTextField=new JTextField();
    aadharTextField.setBounds(300, 490, 400, 30);
    aadharTextField.setFont(new Font("Raleway", Font.BOLD,14));
    add(aadharTextField);
    
    
    
     // for seniorcitizen
     JLabel seniorcitizen = new JLabel("Senior Citizen:" );
      seniorcitizen.setFont(new Font("Raleway",Font.BOLD,22));
     seniorcitizen.setBounds(100, 540,200  ,30 );
    add(seniorcitizen);
    
    
    ayes = new JRadioButton("YES");
    ayes.setBounds(300, 540, 100, 30);
    ayes.setBackground(Color.WHITE); 
      add(ayes);
    
    ano = new JRadioButton("NO");
    ano.setBounds(450, 540, 100, 30);
    ano.setBackground(Color.WHITE);
    add(ano);
     // for grouping of seniorcitizen, yes and no
        ButtonGroup seniorgroup= new ButtonGroup();
    seniorgroup.add(ayes);
    seniorgroup.add(ano);
    
    
        // for exisitingaccount
    JLabel exisitingaccount= new JLabel("Exisiting account:" );
     exisitingaccount.setFont(new Font("Raleway",Font.BOLD,22));
    exisitingaccount.setBounds(100, 590,200  ,30 );
    add(exisitingaccount);
      
    eyes = new JRadioButton("YES");
    eyes.setBounds(300, 590, 100, 30);
    eyes.setBackground(Color.WHITE); 
    add(eyes);
    
    
        eno = new JRadioButton("NO");
    eno.setBounds(450, 590, 100, 30);
    eno.setBackground(Color.WHITE);
    add(eno);
     // for grouping of exisitingaccount, yes and no
        ButtonGroup accountgroup= new ButtonGroup();
    accountgroup.add(eyes);
    accountgroup.add(eno);
    
    
    
    // for next button for next page
    next= new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBounds(620, 660, 80, 30);
   next.addActionListener(this);
    add(next);
    
        
        //  for size of frame
     setSize(850,800);
    setLocation(350,10 );
    setVisible(true);

    getContentPane().setBackground(Color.WHITE); 
}
    
     public void actionPerformed(ActionEvent ae){
         String sreligion=(String)relegion.getSelectedItem(); 
         String scategory=(String)category.getSelectedItem(); 
         String sincome=(String)income.getSelectedItem();
         String squalification=(String)qualification.getSelectedItem(); 
         String soccuption=(String)occuption.getSelectedItem(); 
         String pan=panTextField.getText();
         String aadhar=aadharTextField.getText();
         
         
         
         String seniorcitizen = null;
         if(ayes.isSelected()){
             seniorcitizen ="YES";
         }
         else if(ano.isSelected()){
             seniorcitizen="NO";
         }
         
          String exisitingaccount = null;
         if(eyes.isSelected()){
             exisitingaccount ="YES";
         }
         else if(eno.isSelected()){
             exisitingaccount="NO";
         }
        
        
         try{              
               Conn c = new Conn();
               String query="insert into Signuppagetwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+squalification+"','"+soccuption+"','"+pan+"','"+aadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
               c.s.executeUpdate(query);    
                     
               
               setVisible(false);
              new Signuppagethree(formno).setVisible(true);
         }
         catch(Exception e){
             System.out.println(e);
         }
                 }
    
     
     
    public static void main(String args[]){
  new Signuppagetwo("");     
}
}

