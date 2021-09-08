package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class BookingConfirm extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3;
    JButton b1,b2;
    JTextField t1,t2;
    Choice c1;
    
    
    BookingConfirm(String user){
    
         String username=user;
        
        setBounds(350,200,700,400);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
      
        
        l1=new JLabel("your total expense:");
       l1.setFont(new Font("Tahoma",Font.BOLD,16));
       l1.setForeground(Color.GRAY);
       l1.setBounds(150, 80, 350, 40);
       add(l1);
       
       t1=new JTextField();
        t1.setBounds(380, 85, 150, 20);
        add(t1);
        
        
        
        
        
        l2=new JLabel("confirm customer name:");
       l2.setFont(new Font("Tahoma",Font.BOLD,16));
       l2.setForeground(Color.GRAY);
       l2.setBounds(150, 10, 350, 40);
       add(l2);
       
       t2=new JTextField();
        t2.setBounds(380, 12, 150, 20);
        add(t2);
       
        
        
       l3=new JLabel("mode of payment:");
       l3.setFont(new Font("Tahoma",Font.BOLD,16));
       l3.setForeground(Color.GRAY);
       l3.setBounds(150, 150, 200, 40);
       add(l3);
       
      c1=new Choice (); 
        c1.add("Phone-pay");
        c1.add("BHIM UPI");
        c1.add("Paytm");
        c1.add("Net Banking");
        c1.add("Credit Card");
        c1.add("Debit Card");
        c1.add("G-pay");
        c1.setBounds(380,150,250,40);
        add(c1);
       
       
       
       b1=new JButton("pay now");
       b1.setFont(new Font ("Tahoma" ,Font.BOLD,14));
       b1.setBackground(new Color(95,158,160));
       b1.setForeground(Color.WHITE);
       b1.setBorder(BorderFactory.createEmptyBorder());
       b1.setBounds(200, 250, 150, 30);
       b1.addActionListener(this);
       add(b1);
       
       
       b2=new JButton("Back");
          b2.addActionListener(this);
          b2.setBounds(400,250,130,30);
          b2.setForeground(new Color(95,158,160));
          b2.setBackground(Color.WHITE);
          b2.setBorder(new LineBorder (new Color(230,230,250)));
          add(b2);
          
          
           
          
          
          Conn c=new Conn();
          try{    
            String sql1="select * from bill where username='"+username+"'";
             ResultSet rs1=c.s.executeQuery(sql1);
             
             while(rs1.next()){
                 t1.setText(rs1.getString("bill"));
                 
             }    
            }catch (Exception e){
                
            }
          
        
        
    }
    
    
     public void actionPerformed(ActionEvent ae){
         
         if(ae.getSource()==b1){
             
             
             
             String username=t2.getText();
          String payment_mode=c1.getSelectedItem();
          
           String query="insert into payment values('"+username+"','"+payment_mode+"')";
            
            try{
                Conn c=new Conn();
                int a=c.s.executeUpdate(query);
                System.out.println(a);
                System.out.println(username);
                System.out.println(payment_mode);
                
            }catch(Exception e){
                
                System.out.println(e);
                
            }
            
             this.setVisible(false);
             new Thankyou(t2.getText()).setVisible(true);
             
            
         }
         if(ae.getSource()==b2){
             this.setVisible(false);
             new BookingSummary("").setVisible(true);
             
         }
     }
    
    public static void main(String[] args){
        new BookingConfirm("").setVisible(true);
        
    }
    
    
    
}
