package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class BookingSummary extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JLabel t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    
    
    
    
    BookingSummary(String user){
        
       String username =user;
       
       setBounds(350,150,900,500);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
        
       
       l1=new JLabel("Booking Summary ");
       l1.setFont(new Font("Tahoma",Font.BOLD,27));
       l1.setForeground(Color.GRAY);
       l1.setBounds(50, 0, 300, 35);
       add(l1);
       
       
       
       l9=new JLabel("customer name                               :");
       l9.setFont(new Font("Tahoma",Font.BOLD,16));
       l9.setForeground(Color.GRAY);
       l9.setBounds(200, 40, 300, 40);
       add(l9);
       
       t7=new JLabel();
       t7.setFont(new Font("Tahot7ma",Font.BOLD,16));
       t7.setForeground(Color.GRAY);
       t7.setBounds(500, 40, 180, 25);
       add(t7);
       
       l2=new JLabel("your destination                               :");
       l2.setFont(new Font("Tahoma",Font.BOLD,16));
       l2.setForeground(Color.GRAY);
       l2.setBounds(200, 80, 300, 40);
       add(l2);
       
       t1=new JLabel();
       t1.setFont(new Font("Tahot7ma",Font.BOLD,16));
       t1.setForeground(Color.GRAY);
       t1.setBounds(500, 80, 180, 25);
       add(t1);
       
       
       
       l3=new JLabel("site you have choosed                     :");
       l3.setFont(new Font("Tahoma",Font.BOLD,16));
       l3.setForeground(Color.GRAY);
       l3.setBounds(200, 130, 300, 40);
       add(l3);
       
       
       t2=new JLabel();
       t2.setFont(new Font("Tahot7ma",Font.BOLD,16));
       t2.setForeground(Color.GRAY);
       t2.setBounds(500, 130, 180, 25);
       add(t2);
       
       
       
       l5=new JLabel("number of people tacking service  :");
       l5.setFont(new Font("Tahoma",Font.BOLD,16));
       l5.setForeground(Color.GRAY);
       l5.setBounds(200, 180, 300, 40);
       add(l5);
       
       
       t3=new JLabel();
       t3.setFont(new Font("Tahot7ma",Font.BOLD,16));
       t3.setForeground(Color.GRAY);
       t3.setBounds(500, 180, 180, 25);
        add(t3);
       
       
       l6=new JLabel("vehicle type                                     :");
       l6.setFont(new Font("Tahoma",Font.BOLD,16));
       l6.setForeground(Color.GRAY);
       l6.setBounds(200, 230, 300, 40);
       add(l6);
       
       
       t4=new JLabel();
       t4.setFont(new Font("Tahot7ma",Font.BOLD,16));
       t4.setForeground(Color.GRAY);
       t4.setBounds(500, 230, 180, 25);
       add(t4);
  
       l7=new JLabel("mode of driving                               :");
       l7.setFont(new Font("Tahoma",Font.BOLD,16));
       l7.setForeground(Color.GRAY);
       l7.setBounds(200, 280, 320, 40);
       add(l7);
       
       
       t5=new JLabel();
       t5.setFont(new Font("Tahot7ma",Font.BOLD,16));
       t5.setForeground(Color.GRAY);
       t5.setBounds(500, 280, 180, 25);
       add(t5);
        
       l8=new JLabel("number of days                               :");
       l8.setFont(new Font("Tahoma",Font.BOLD,16));
       l8.setForeground(Color.GRAY);
       l8.setBounds(200, 330, 320, 40);
       add(l8);
       
       
       t6=new JLabel();
       t6.setFont(new Font("Tahot7ma",Font.BOLD,16));
       t6.setForeground(Color.GRAY);
       t6.setBounds(500, 330, 180, 25);
       add(t6);
       
  
       b1=new JButton("Generate Bill");
       b1.setFont(new Font ("Tahoma" ,Font.BOLD,14));
       b1.setBackground(new Color(95,158,160));
       b1.setForeground(Color.WHITE);
       b1.setBorder(BorderFactory.createEmptyBorder());
       b1.setBounds(300, 400, 150, 30);
       b1.addActionListener(this);
       add(b1);
       
       
       b2=new JButton("Back");
          b2.addActionListener(this);
          b2.setBounds(500,400,130,30);
          b2.setForeground(new Color(95,158,160));
          b2.setBackground(Color.WHITE);
          b2.setBorder(new LineBorder (new Color(230,230,250)));
          add(b2);
          
          
          
          Conn c=new Conn();
          try{    
            String sql1="select * from booking where username='"+username+"'";
             ResultSet rs1=c.s.executeQuery(sql1);
             
             while(rs1.next()){
                 t1.setText(rs1.getString("city"));
                 t2.setText(rs1.getString("places"));
                 t3.setText(rs1.getString("people"));
                 t4.setText(rs1.getString("vehicle"));
                 t5.setText(rs1.getString("driving_mode"));
                 t6.setText(rs1.getString("days"));
                 t7.setText(rs1.getString("username"));
                 
             }    
            }catch (Exception e){
                
            }
          
          
          
          
          
          
          
          
     }
    
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
           this.setVisible(false);
            new BookingConfirm(t7.getText()).setVisible(true);
        }
        
        if(ae.getSource()==b2){
             this.setVisible(false);
            new StartBooking().setVisible(true);
        }
        
       
        
        
    }
    
    public static void main (String[] args){

new BookingSummary("").setVisible(true);
}
    
    
}


