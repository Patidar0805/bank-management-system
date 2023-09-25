package bank_management_system;
import java.awt.*;
import javax.swing.*;
import java.util.*; 
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
 
public class SignupOne extends JFrame implements ActionListener {
    
    long random;   
    JTextField nameTextField,fnameTextField, emailTextField, addressTextField , pincodeTextField, stateTextField, cityTextField;
    JButton next;
    JRadioButton male, female, others, married,unmarried;
    JDateChooser dateChooser;
    
    SignupOne(){
        setTitle("SIGN UP ONE");
        setLayout(null);
        
        // for generate random form number
        Random ran =new Random();
         random=(Math.abs(ran.nextLong()%9000L)+ 1000L );

    // for print application no. + random no.
     JLabel formno= new JLabel("APPLICATION FORM NO. "+ random );
    formno.setFont(new Font("Raleway",Font.BOLD,38));
    formno.setBounds(140, 20,600  ,40 );
    add(formno);
    
    // for print personal details 
     JLabel  personDetails= new JLabel("Page 1: Personal Details" );
    personDetails.setFont(new Font("Raleway",Font.BOLD,22));
    personDetails.setBounds(290, 80,400  ,30 );
    add(personDetails);
      // for name
         JLabel  name= new JLabel("Name" );
    name.setFont(new Font("Raleway",Font.BOLD,22));
    name.setBounds(100, 140,100  ,30 );
    add(name);
    
    // for name's textfield
    nameTextField=new JTextField();
    nameTextField.setBounds(300, 140, 400, 30);
    nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
    add(nameTextField);
    
    // for father's name
    JLabel  fname= new JLabel("Father's Name" );
    fname.setFont(new Font("Raleway",Font.BOLD,22));
    fname.setBounds(100, 190,200  ,30 );
      add(fname);
    
      // for father's name 's textfield
     fnameTextField=new JTextField();
    fnameTextField.setBounds(300, 190, 400, 30);
    fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
    add(fnameTextField);
          
    
    // for date of birth
      JLabel  dob= new JLabel("Date of Birth" );
     dob.setFont(new Font("Raleway",Font.BOLD,22));
    dob.setBounds(100, 240,200  ,30 );
    add(dob);
     
    //for calender
     dateChooser =new JDateChooser();
     dateChooser.setBounds(300, 240,400, 30);  
      dateChooser.setFont(new Font("Raleway",Font.BOLD,22));
     dateChooser.setForeground(Color.BLACK);
     add(dateChooser);
    
     // for gender
        JLabel  gender= new JLabel("Gender" );
     gender.setFont(new Font("Raleway",Font.BOLD,22));
    gender.setBounds(100, 290,200  ,30 );
    add(gender);
     // generate radio button for male option of gender
     male = new JRadioButton("Male");
    male.setBounds(300, 290, 120, 30);
    male.setBackground(Color.WHITE);
    add(male);
    // generate radio button for female option of gender
    female = new JRadioButton("female");
    female.setBounds(450, 290, 120, 30);
    female.setBackground(Color.WHITE);
    add(female);
    
    // for grouping of male and female in which we can choose any one option
    ButtonGroup gendergroup= new ButtonGroup();
    gendergroup.add(male);
    gendergroup.add(female);
    
    // for email
        JLabel  email= new JLabel("Email Address" );
     email.setFont(new Font("Raleway",Font.BOLD,22));
    email.setBounds(100, 340,200  ,30 );
    add(email);
     
    // for email's textfield 
     emailTextField=new JTextField();
    emailTextField.setBounds(300, 340, 400, 30);
    emailTextField.setFont(new Font("Raleway", Font.BOLD,14));
    add(emailTextField);
    
    // for marital
        JLabel  marital= new JLabel("Marital Status " );
     marital.setFont(new Font("Raleway",Font.BOLD,22));
    marital.setBounds(100, 390,200  ,30 );
    add(marital);
     
     // for radio button of married
    married = new JRadioButton("Married");
    married.setBounds(300, 390, 100, 30);
    married.setBackground(Color.WHITE); 
    add(married);
    // for radio button of unmarried
    unmarried = new JRadioButton("Unmarried");
    unmarried.setBounds(450, 390, 100, 30);
    unmarried.setBackground(Color.WHITE);
    add(unmarried);
     //for radio button of others
     others = new JRadioButton("Others");
    others.setBounds(630, 390, 100, 30);
    others.setBackground(Color.WHITE);
    add(others);
    
    // for grouping of married, unmarried and others
        ButtonGroup maritalgroup= new ButtonGroup();
    maritalgroup.add(married);
    maritalgroup.add(unmarried);
    maritalgroup.add(others);
    
    // for address
        JLabel Address = new JLabel("Address " );
     Address.setFont(new Font("Raleway",Font.BOLD,22));
    Address.setBounds(100, 440,200  ,30 );
    add(Address);
    
    
    // for address's textfield
     addressTextField=new JTextField();
    addressTextField.setBounds(300, 440, 400, 30);
    addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
    add(addressTextField);
    
    // for city
     JLabel City = new JLabel("City " );
     City.setFont(new Font("Raleway",Font.BOLD,22));
    City.setBounds(100, 490,200  ,30 );
    add(City );
    // for city's textfield
     cityTextField=new JTextField();
    cityTextField.setBounds(300, 490, 400, 30);
    cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
    add(cityTextField);
    
    // for  state
     JLabel state = new JLabel("State" );
      state.setFont(new Font("Raleway",Font.BOLD,22));
     state.setBounds(100, 540,200  ,30 );
    add( state );
    
    // for state's textfeild
     stateTextField=new JTextField();
    stateTextField.setBounds(300, 540, 400, 30);
    stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
    add(stateTextField);
    
    // for pincode
    JLabel pincode = new JLabel("Pin Code" );
      pincode.setFont(new Font("Raleway",Font.BOLD,22));
    pincode.setBounds(100, 590,200  ,30 );
    add( pincode);
     
    // for pincode's textfield
     pincodeTextField=new JTextField();
    pincodeTextField.setBounds(300, 590, 400, 30);
    pincodeTextField.setFont(new Font("Raleway", Font.BOLD,14));
    add(pincodeTextField);
    
    // for next button for next page
    next= new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBounds(620, 660, 80, 30);
    next.addActionListener(this);
    add(next);
     
    //for size of frame
     setSize(850,800);
    setLocation(350,10 );
    setVisible(true);

    getContentPane().setBackground(Color.WHITE); 
    } 

    public void actionPerformed(ActionEvent ae){
        String formno="" + random;
        String name= nameTextField.getText();
         String fname= fnameTextField.getText(); 
         String dob= ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
         String gender = null;
         if(male.isSelected()){
             gender ="Male";
         }
         else if(female.isSelected()){
             gender="Female";
         }
         String email= emailTextField.getText();
         String marital= null;
         if(married.isSelected()){
             marital="married";
            }
         else if(unmarried.isSelected()){
             marital="unmarried";
         }
         else if (others.isSelected()){
             marital="others";
         }
         String address=addressTextField.getText();
         String city=cityTextField.getText();
         String state=stateTextField.getText();
         String pincode=pincodeTextField.getText();
             
         
         try{
           if(name.equals("")){
               JOptionPane.showMessageDialog(null,"Name is required");
               
           }
             
           
            if(fname.equals("")){
               JOptionPane.showMessageDialog(null,"Father's Name is required");
               
           }
             if(dob.equals("")){
               JOptionPane.showMessageDialog(null,"dob is required");
               
           }
         //     if(gender.equals("")){
           //   JOptionPane.showMessageDialog(null,"gender is required");
               
          // }
               if(email.equals("")){
               JOptionPane.showMessageDialog(null,"email is required");
               
           }
             //   if(marital.equals("")){
             //  JOptionPane.showMessageDialog(null,"marital is required");
               
          // }
                 if(address.equals("")){
                JOptionPane.showMessageDialog(null,"address is required");
               
           } if(city.equals("")){
               JOptionPane.showMessageDialog(null,"city name is required");
               
           } if(state.equals("")){
               JOptionPane.showMessageDialog(null,"state is required");
               
           }
            if(pincode.equals("")){
               JOptionPane.showMessageDialog(null,"pincode is required");
               
           }
            else{
               
               Conn c = new Conn();
               String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
               c.s.executeUpdate(query); 
           
               setVisible(false);
              new Signuppagetwo(formno).setVisible(true);
           }
           
         }
         catch(Exception e){
             System.out.println(e);
         }
    }
     
public static void main(String args[]){
  new SignupOne();     
}
}