
package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;


public class Thankyou extends JFrame implements ActionListener {
   
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3;
    JButton b1;
    
   Thankyou(String user){
        
       String username=user; 
       
       setBounds(350,150,830,460);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       
       l1=new JLabel("once again thank you very much for choosing TravelPal  ! ");
       l1.setFont(new Font("Tahoma",Font.BOLD,22));
       l1.setForeground(Color.GRAY);
       l1.setBounds(50, 15, 700, 40);
       add(l1);
       
       
       
       
       l3=new JLabel("customer name                         :");
       l3.setFont(new Font("Tahoma",Font.BOLD,16));
       l3.setForeground(Color.GRAY);
       l3.setBounds(200, 100, 300, 40);
       add(l3);
       
       t1=new JTextField();
       t1.setText(username);
       t1.setBounds(500, 100, 180, 25);
       t1.setBorder(BorderFactory.createEmptyBorder());
       add(t1);
       
       
       
       l4=new JLabel("mode of payment                     :");
       l4.setFont(new Font("Tahoma",Font.BOLD,16));
       l4.setForeground(Color.GRAY);
       l4.setBounds(200, 150, 300, 40);
       add(l4);
       
       
       t2=new JTextField();
       t2.setBounds(500, 150, 180, 25);
       t2.setBorder(BorderFactory.createEmptyBorder());
       add(t2);
       
       
       
       l5=new JLabel("paymet status                           :");
       l5.setFont(new Font("Tahoma",Font.BOLD,16));
       l5.setForeground(Color.GRAY);
       l5.setBounds(200, 200, 300, 40);
       add(l5);
       
       
       t3=new JTextField("updated");
        t3.setBounds(500, 200, 180, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        add(t3);
        
        
       b1=new JButton("Back to home Page");
       b1.setFont(new Font ("Tahoma" ,Font.BOLD,14));
       b1.setBackground(new Color(95,158,160));
       b1.setForeground(Color.WHITE);
       b1.setBorder(BorderFactory.createEmptyBorder());
       b1.setBounds(300, 300, 150, 30);
       b1.addActionListener(this);
       add(b1);
       
       
       Conn c=new Conn();
          try{    
            String sql1="select * from payment where username='"+username+"'";
             ResultSet rs1=c.s.executeQuery(sql1);
             
             while(rs1.next()){
                 t2.setText(rs1.getString("payment_mode"));
                 t1.setText(rs1.getString("username"));
                 
             }    
            }catch (Exception e){
                
                
                
            }
 
   
   }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            
            this.setVisible(false);
        
            
            
        }
        
        
    }
    
    
    
    public static void main(String[] args){
        
        new Thankyou("").setVisible(true);
        
    }
    
    
    
}
