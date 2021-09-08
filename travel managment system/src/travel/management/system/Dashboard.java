
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Dashboard extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1;
    JPanel p1,p2;
    
    
    
    Dashboard(){
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1950, 50);
        p1.setBackground(new Color(0,43,128));
        add(p1);
       
       b1=new JButton("startrt Booking");
       b1.setFont(new Font ("Tahoma" ,Font.BOLD,14));
       b1.setBackground(new Color(95,158,160));
       b1.setForeground(Color.WHITE);
       b1.setBorder(BorderFactory.createEmptyBorder());
       b1.setBounds(0, 8, 150, 30);
       b1.addActionListener(this);
       p1.add(b1);
        
        
        b2=new JButton("Booking history");
        b2.setBackground(new Color(95,158,160));
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
//        b2.setMargin(new Insets(0,0,0,60));
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,8,150,30);
        b2.addActionListener(this);
        p1.add(b2);
        
        
        b3=new JButton("profile details");
        b3.setBackground(new Color(95,158,160));
        b3.setFont(new Font("Tahoma",Font.BOLD,14));
//        b3.setMargin(new Insets(0,0,0,80));
        b3.setForeground(Color.WHITE);
        b3.setBounds(400,8,150,30);
        b3.addActionListener(this);
        p1.add(b3);
     
        
        
        
        b6=new JButton("contact us");
        b6.setBackground(new Color(95,158,160));
        b6.setFont(new Font("Tahoma",Font.BOLD,14));
        b6.setForeground(Color.WHITE);
        b6.setBounds(600,8,150,30);
        b6.addActionListener(this);
        p1.add(b6);
        
        
        l1=new JLabel("Thank you for choosing TravelPal! ");
       l1.setFont(new Font("Serif",Font.BOLD,27));
       l1.setForeground(Color.WHITE);
       l1.setBounds(100, 100, 1000, 35);
       add(l1);
        
        
        
        
       
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icon/home.jpg"));
        Image  i5=i4.getImage().getScaledInstance(1950,900,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(0, 0, 1950, 900);
        add(l2);
        
        

         
          
          
        
          
          
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icon/signup.png"));
        Image  i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0, 0, 70, 70);
        add(l1);     
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new Dashboard().setVisible(false);
            new StartBooking().setVisible(true);
            
        }
        if(ae.getSource()==b2){
            
            new BookingHistory().setVisible(true);
            
        }
        
        if(ae.getSource()==b3){
//          this  .setVisible(false);
            new Profiledetails().setVisible(true);
        }
        if(ae.getSource()==b6){
            new Contactus().setVisible(true);
        }
        
        
    }
    
    
    public static void main(String[] args){
        new Dashboard().setVisible(true);
    }
    
}
