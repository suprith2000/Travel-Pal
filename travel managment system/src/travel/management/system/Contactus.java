
package travel.management.system;

import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Contactus extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton b1;
    
    
    
    
    
    Contactus(){
        
        setBounds(350,150,900,500);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       l1=new JLabel("customer contact details ");
       l1.setFont(new Font("Tahoma",Font.BOLD,27));
       l1.setForeground(Color.GRAY);
       l1.setBounds(50, 0, 500, 35);
       add(l1);
       
       
       
       l1=new JLabel("Company name                               :");
       l1.setFont(new Font("Tahoma",Font.BOLD,16));
       l1.setForeground(Color.GRAY);
       l1.setBounds(200, 80, 300, 40);
       add(l1);
       
       l2=new JLabel("TravelPal");
       l2.setFont(new Font("Tahoma",Font.BOLD,16));
       l2.setForeground(Color.GRAY);
       l2.setBounds(500, 80, 300, 40);
       add(l2);
       
       l3=new JLabel("contact number                               :");
       l3.setFont(new Font("Tahoma",Font.BOLD,16));
       l3.setForeground(Color.GRAY);
       l3.setBounds(200, 130, 300, 40);
       add(l3);
       
       l4=new JLabel("9535457971");
       l4.setFont(new Font("Tahoma",Font.BOLD,16));
       l4.setForeground(Color.GRAY);
       l4.setBounds(500, 130, 300, 40);
       add(l4);
       
       
       
       l5=new JLabel("company email                                  :");
       l5.setFont(new Font("Tahoma",Font.BOLD,16));
       l5.setForeground(Color.GRAY);
       l5.setBounds(200, 180, 300, 40);
       add(l5);
       
       
       l6=new JLabel("travelpal2000@gmail.com");
       l6.setFont(new Font("Tahoma",Font.BOLD,16));
       l6.setForeground(Color.GRAY);
       l6.setBounds(500, 180, 300, 40);
       add(l6);
       
       
       
       l6=new JLabel("headoffice located at                      :");
       l6.setFont(new Font("Tahoma",Font.BOLD,16));
       l6.setForeground(Color.GRAY);
       l6.setBounds(200, 230, 300, 40);
       add(l6);
       
       
       l7=new JLabel("Banglore");
       l7.setFont(new Font("Tahoma",Font.BOLD,16));
       l7.setForeground(Color.GRAY);
       l7.setBounds(500, 230, 300, 40);
       add(l7);
      
  
       l8=new JLabel("Gst number                                       :");
       l8.setFont(new Font("Tahoma",Font.BOLD,16));
       l8.setForeground(Color.GRAY);
       l8.setBounds(200, 280, 320, 40);
       add(l8);
       
       
       l9=new JLabel("29GGGGG1314R9Z6");
       l9.setFont(new Font("Tahoma",Font.BOLD,16));
       l9.setForeground(Color.GRAY);
       l9.setBounds(500, 280, 320, 40);
       add(l9);
       
       
       
       
       
       b1=new JButton("close");
       b1.setFont(new Font ("Tahoma" ,Font.BOLD,14));
       b1.setBackground(new Color(95,158,160));
       b1.setForeground(Color.WHITE);
       b1.setBorder(BorderFactory.createEmptyBorder());
       b1.setBounds(400, 380, 100, 30);
       b1.addActionListener(this);
       add(b1);
    
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            
            this.setVisible(false);
            
            
        }
        
        
    }
    
    
    
    
    
    public static void main(String[] args){
        
        new Contactus().setVisible(true);
        
    }
    
    
    
    
    
    
    
}

