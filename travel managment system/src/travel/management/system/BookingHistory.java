package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class BookingHistory extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1,b2;
    
    
    
    
    BookingHistory(){
        
       
       
       
       setBounds(350,100,900,600);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
        
       
       l1=new JLabel("Booking History");
       l1.setFont(new Font("Tahoma",Font.BOLD,27));
       l1.setForeground(Color.GRAY);
       l1.setBounds(50, 0, 300, 35);
       add(l1);
       
       
       
       l2=new JLabel("enter customer name                      :");
       l2.setFont(new Font("Tahoma",Font.BOLD,16));
       l2.setForeground(Color.GRAY);
       l2.setBounds(200, 50, 300, 40);
       add(l2);
       
       t2=new JTextField();
       t2.setBounds(500, 50, 180, 25);
//       t2.setBorder(BorderFactory.createEmptyBorder());
       add(t2);
       
       l3=new JLabel("your destination                               :");
       l3.setFont(new Font("Tahoma",Font.BOLD,16));
       l3.setForeground(Color.GRAY);
       l3.setBounds(200, 100, 300, 40);
       add(l3);
       
       t3=new JTextField();
       t3.setBounds(500, 100, 180, 25);
       t3.setBorder(BorderFactory.createEmptyBorder());
       add(t3);
       
       
       
       l4=new JLabel("site you have choosed                     :");
       l4.setFont(new Font("Tahoma",Font.BOLD,16));
       l4.setForeground(Color.GRAY);
       l4.setBounds(200, 150, 300, 40);
       add(l4);
       
       
       t4=new JTextField();
       t4.setBounds(500, 150, 180, 25);
       t4.setBorder(BorderFactory.createEmptyBorder());
       add(t4);
       
       
       
       l5=new JLabel("number of people took service      :");
       l5.setFont(new Font("Tahoma",Font.BOLD,16));
       l5.setForeground(Color.GRAY);
       l5.setBounds(200, 200, 300, 40);
       add(l5);
       
       
       t5=new JTextField();
        t5.setBounds(500, 200, 180, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        add(t5);
       
       
       l6=new JLabel("vehicle type                                     :");
       l6.setFont(new Font("Tahoma",Font.BOLD,16));
       l6.setForeground(Color.GRAY);
       l6.setBounds(200, 250, 300, 40);
       add(l6);
       
       
       t6=new JTextField();
       t6.setBounds(500, 250, 180, 25);
       t6.setBorder(BorderFactory.createEmptyBorder());
       add(t6);
       
       
       
       
       l7=new JLabel("mode of driving                               :");
       l7.setFont(new Font("Tahoma",Font.BOLD,16));
       l7.setForeground(Color.GRAY);
       l7.setBounds(200, 300, 320, 40);
       add(l7);
       
       
       t7=new JTextField();
       t7.setBounds(500, 300, 180, 25);
       t7.setBorder(BorderFactory.createEmptyBorder());
       add(t7);
       
       
       
       
       l8=new JLabel("number of days                               :");
       l8.setFont(new Font("Tahoma",Font.BOLD,16));
       l8.setForeground(Color.GRAY);
       l8.setBounds(200, 350, 320, 40);
       add(l8);
       
       
       t8=new JTextField();
       t8.setBounds(500, 350, 180, 25);
       t8.setBorder(BorderFactory.createEmptyBorder());
       add(t8);
       
       
       l9=new JLabel("your total bill                                  :");
       l9.setFont(new Font("Tahoma",Font.BOLD,16));
       l9.setForeground(Color.GRAY);
       l9.setBounds(200, 400, 320, 40);
       add(l9);
       
       
       t9=new JTextField();
       t9.setBounds(500, 400, 180, 25);
       t9.setBorder(BorderFactory.createEmptyBorder());
       add(t9);
       
       
          b1=new JButton("ok");
          b1.addActionListener(this);
          b1.setBounds(700,40,60,30);
          b1.setBackground(new Color(95,158,160));
          b1.setForeground(Color.WHITE);
          b1.setBorder(new LineBorder (new Color(230,230,250)));
          add(b1);
       
       

          b2=new JButton("close");
          b2.addActionListener(this);
          b2.setBounds(400,500,100,30);
          b2.setBackground(new Color(95,158,160));
          b2.setForeground(Color.WHITE);
          b2.setBorder(new LineBorder (new Color(230,230,250)));
          add(b2);
          
          
          
          
          
          
          
          
          
          
          
          
     }
    
    
    
    public void actionPerformed(ActionEvent ae){
        
        
        if(ae.getSource()==b1){
            
            Conn c=new Conn();
          try{    
            String sql1="select * from booking where username='"+t2.getText()+"'";
             ResultSet rs1=c.s.executeQuery(sql1);
             
             if(rs1.next()){
                 t3.setText(rs1.getString("city"));
                 t4.setText(rs1.getString("places"));
                 t5.setText(rs1.getString("people"));
                 t6.setText(rs1.getString("vehicle"));
                 t7.setText(rs1.getString("driving_mode"));
                 t8.setText(rs1.getString("days"));
                 
             }   
             
             String sql2="select * from bill where username='"+t2.getText()+"'";
             ResultSet rs2=c.s.executeQuery(sql2);
             if(rs2.next()){
                 
                 t9.setText(rs2.getString("bill"));
                 
             }
              else{
                 JOptionPane.showMessageDialog(null,"your not allowed to accesses user data");
             }
            }catch (Exception e){
                
            }
          
            
            
            
            
        }
        
        
        
        
        if(ae.getSource()==b2){
             this.setVisible(false);
            
        }
        
       
        
        
    }
    
    public static void main (String[] args){

new BookingHistory().setVisible(true);
}
    
    
}
