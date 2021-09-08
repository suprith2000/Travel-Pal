
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class ForgotPassword extends JFrame implements ActionListener{
    
    JButton b1,b2,b3;
    JTextField t1,t2,t3,t4,t5;
    
    ForgotPassword(){
        
        setBounds(450,250,800,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icon/IconForgotPassword.jpg"));
        JLabel l6=new JLabel(i1);
        l6.setBounds(520, 20, 300, 300);
        add(l6);
        
        
        
        JPanel p =new JPanel();
        p.setLayout(null);
        p.setBounds(30,20,500,300);
        add(p);
        
        JLabel l1=new JLabel("username");
        l1.setBounds(40, 20, 100, 25);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l1);
        
        
        t1=new JTextField();
        t1.setBounds(220, 20, 150, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);
        
        
        
        b1=new JButton("search");
        b1.setFont(new Font ("Tahoma" ,Font.PLAIN,12));
        b1.setForeground(new Color(95,158,160));
        b1.setBackground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBounds(380, 20, 60, 20);
        b1.addActionListener(this);
        p.add(b1);
        
        
        JLabel l2=new JLabel("name");
        l2.setBounds(40, 60, 100, 25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l2);
        
        
        t2=new JTextField();
        t2.setBounds(220, 60, 150, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2);
        
        
        
        JLabel l3=new JLabel("your security question");
        l3.setBounds(40, 100, 200, 25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l3);
        
        
        t3=new JTextField();
        t3.setBounds(220, 100, 220, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3);
        
        JLabel l4=new JLabel("Answer");
        l4.setBounds(40, 140, 200, 25);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l4);
        
        
        t4=new JTextField();
        t4.setBounds(220, 140, 150, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);
        
        
        
        b2=new JButton("Retreive");
        b2.setFont(new Font ("Tahoma" ,Font.PLAIN,12));
        b2.setForeground(new Color(95,158,160));
        b2.setBackground(Color.WHITE);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        b2.setBounds(380, 140, 60, 20);
//        b1.addActionListener(this);
        p.add(b2);
        
        
        
        JLabel l5=new JLabel("password");
        l5.setBounds(40, 180, 200, 25);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l5);
        
        
        t5=new JTextField();
        t5.setBounds(220, 180, 150, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p.add(t5);
        
        
        
        
        b3=new JButton("Back");
        b3.setFont(new Font ("Tahoma" ,Font.PLAIN,12));
        b3.setBackground(new Color(95,158,160));
        b3.setForeground(Color.WHITE);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        b3.setBounds(120, 250, 80, 25);
//        b1.addActionListener(this);
        p.add(b3);
             
    }
    
    
    public void actionPerformed(ActionEvent ae){
       
        Conn c=new Conn();
        
        if(ae.getSource()==b1){
            
            
            try{
                
                
            String sql="select * from account  where username = '"+t1.getText()+"'";
            ResultSet rs=c.s.executeQuery(sql);
             if(rs.next()){
                 t2.setText(rs.getString("name"));
                 
             }
             
             
             String sq2="select * from security where username= '"+t1.getText()+"'";
             ResultSet rs1=c.s.executeQuery(sq2);
             if(rs1.next()){
             t3.setText(rs1.getString("security"));
             }
             
             
             else
                 JOptionPane.showMessageDialog(null,"invalid username");
             
            }catch (Exception e){
                
            }
            
        }else if(ae.getSource()==b2){
            try{
            
                
                
             String sql="select Password from account a inner join security s  on s.username=a.username  where s.answer = '"+t4.getText()+"' and s.username = '"+t1.getText()+"' ";
             
             ResultSet rs=c.s.executeQuery(sql);
                
             System.out.println(rs);
             while(rs.next()){
                 t5.setText(rs.getString("Password"));
             }
            }catch(Exception e){
                
            }
            
            
        }else if(ae.getSource()==b3){
         this.setVisible(false);
         new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new ForgotPassword ().setVisible(true);
    }
    
}
