
package travel.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class Profiledetails extends JFrame implements ActionListener  {
    
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;
    
    Profiledetails(){
        
        
       setBounds(350,150,800,500);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       
       l1=new JLabel("profile details");
       l1.setFont(new Font("Tahoma",Font.BOLD,30));
       l1.setForeground(Color.GRAY);
       l1.setBounds(50, 15, 300, 40);
       add(l1);
       
       
       l2=new JLabel("enter password             ");
       l2.setFont(new Font("Tahoma",Font.BOLD,16));
       l2.setForeground(Color.GRAY);
       l2.setBounds(200, 80, 300, 40);
       add(l2);
       
       t1=new JTextField();
       t1.setBounds(400, 80, 180, 25);
       add(t1);
       
       
       b2=new JButton("confirm");
       b2.setFont(new Font ("Tahoma" ,Font.BOLD,14));
       b2.setForeground(new Color(95,158,160));
       b2.setBackground(Color.WHITE);
//       b2.setBorder(BorderFactory.createEmptyBorder());
       b2.setBounds(600, 80, 100, 30);
       b2.addActionListener(this);
       add(b2);
       
       
       
       
       
       l3=new JLabel("username                 ");
       l3.setFont(new Font("Tahoma",Font.BOLD,16));
       l3.setForeground(Color.GRAY);
       l3.setBounds(200, 130, 300, 40);
       add(l3);
       
       
       t2=new JTextField();
       t2.setBounds(400, 130, 180, 25);
       add(t2);
       
       
       
       l4=new JLabel("name  ");
       l4.setFont(new Font("Tahoma",Font.BOLD,16));
       l4.setForeground(Color.GRAY);
       l4.setBounds(200, 180, 300, 40);
       add(l4);
       
       
       t3=new JTextField();
        t3.setBounds(400, 180, 180, 25);
        add(t3);
       
       
       l5=new JLabel("phone number           ");
       l5.setFont(new Font("Tahoma",Font.BOLD,16));
       l5.setForeground(Color.GRAY);
       l5.setBounds(200, 230, 300, 40);
       add(l5);
       
       
       t4=new JTextField();
       t4.setBounds(400, 230, 180, 25);
       add(t4);
       
       
       
       
       l6=new JLabel("email        ");
       l6.setFont(new Font("Tahoma",Font.BOLD,16));
       l6.setForeground(Color.GRAY);
       l6.setBounds(200, 280, 320, 40);
       add(l6);
       
       
       t5=new JTextField();
       t5.setBounds(400, 280, 180, 25);
       add(t5);
       
       
       
       b1=new JButton("close");
       b1.setFont(new Font ("Tahoma" ,Font.BOLD,14));
       b1.setBackground(new Color(95,158,160));
       b1.setForeground(Color.WHITE);
       b1.setBorder(BorderFactory.createEmptyBorder());
       b1.setBounds(300, 350, 100, 30);
       b1.addActionListener(this);
       add(b1);
          
        
    }
    
    
 public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            
            this.setVisible(false);
            
            
        }
        
        if(ae.getSource()==b2){
            
             Conn c=new Conn();
            try{
                
                
            String sql="select * from account  where Password= '"+t1.getText()+"'";
             ResultSet rs=c.s.executeQuery(sql);
             if(rs.next()){
                 t2.setText(rs.getString("username"));
                 t3.setText(rs.getString("name"));
                 t4.setText(rs.getString("phone_number"));
                 t5.setText(rs.getString("email"));
               
                
        }
             
             else{
                 
                 JOptionPane.showMessageDialog(null,"your not allowed to accesses user data");
                     
                     }
             
            }catch (Exception e){
                
            }
            
            
         }
        
        
        
      }
     
    public static void main(String[] args){
        new Profiledetails().setVisible(true);
        
    }
    
    
}
