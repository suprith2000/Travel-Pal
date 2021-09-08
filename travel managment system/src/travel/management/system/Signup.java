package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Signup extends JFrame implements ActionListener{
    
    JButton b1,b2,b3;
    JTextField t1,t2,t3,t4,t5,t6,t8;
    Choice c1; 
    Signup(){
        setBounds(200,100,900,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(230,230,250));
        p1.setBounds(0,0,520,600);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1=new JLabel("Username :");
        l1.setFont(new Font("Tahoma" ,Font.BOLD,14));
        l1.setBounds(40, 30, 100, 25);
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBounds(190, 30, 180, 25);
        p1.add(t1);
        
        
        
        JLabel l2=new JLabel("full name :");
        l2.setFont(new Font("Tahoma" ,Font.BOLD,14));
        l2.setBounds(40, 80, 100, 25);
        p1.add(l2);
        
        t2=new JTextField();
        t2.setBounds(190, 80, 180, 25);
        p1.add(t2);
        
    
        JLabel l3=new JLabel("Phone number :");
        l3.setFont(new Font("Tahoma" ,Font.BOLD,14));
        l3.setBounds(40, 130, 120, 25);
        p1.add(l3);
        
        t3=new JTextField();
        t3.setBounds(190, 130, 180, 25);
        p1.add(t3);
        
        
        JLabel l4=new JLabel("Email :");
        l4.setFont(new Font("Tahoma" ,Font.BOLD,14));
        l4.setBounds(40, 180, 100, 25);
        p1.add(l4);
        
        t4=new JTextField();
        t4.setBounds(190, 180, 180, 25);
        p1.add(t4);
        
        
        
        JLabel l5=new JLabel("Password :");
        l5.setFont(new Font("Tahoma" ,Font.BOLD,14));
        l5.setBounds(40, 230, 100, 25);
        p1.add(l5);
        
        t5=new JTextField();
        t5.setBounds(190, 230, 180, 25);
        p1.add(t5);
        
        JLabel l6=new JLabel("Confirm Password :");
        l6.setFont(new Font("Tahoma" ,Font.BOLD,14));
        l6.setBounds(40, 280, 160, 25);
        p1.add(l6);
        
        t6=new JTextField();
        t6.setBounds(190, 280, 180, 25);
        p1.add(t6);
        
        
        JLabel l7=new JLabel("security questions :");
        l7.setFont(new Font("Tahoma" ,Font.BOLD,14));
        l7.setBounds(40, 330, 150, 25);
        p1.add(l7);
        
        c1=new Choice ();
        c1.add("What was your childhood nickname?");
        c1.add("In what city or town was your first job?");
        c1.add("What is your favorite color?");
        c1.add("Which is your favorite animal");
        c1.setBounds(190,330,200,30);
        p1.add(c1);
        
        
        JLabel l8=new JLabel("Answer :");
        l8.setFont(new Font("Tahoma" ,Font.BOLD,14));
        l8.setBounds(40, 380, 100, 25);
        p1.add(l8);
        
        t8=new JTextField();
        t8.setBounds(190, 380, 180, 25);
        p1.add(t8);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icon/signup.png"));
          Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
          JLabel l9= new JLabel(i3);
          l9.setBounds(550, 100, 300, 300);
          add(l9);
        
        b1=new JButton("Create");
        b1.setFont(new Font ("Tahoma" ,Font.BOLD,14));
        b1.setBackground(new Color(95,158,160));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBounds(80, 450, 80, 30);
        b1.addActionListener(this);
        p1.add(b1);
        
        
       b2=new JButton("Back");
        b2.setFont(new Font ("Tahoma",Font.BOLD,14));
        b2.setForeground(new Color(95,158,160));
        b2.setBackground(Color.WHITE);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setBounds(240, 450, 80, 30);
        b2.addActionListener(this);
        p1.add(b2);
        
        
        
        b3=new JButton("Confirm");
        b3.setFont(new Font ("Tahoma" ,Font.PLAIN,14));
        b3.setForeground(new Color(95,158,160));
        b3.setBackground(Color.WHITE);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.setBounds(375, 280, 70, 25);
        b3.addActionListener(this);
        p1.add(b3);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource()==b3){
            
            
            String password=t5.getText();
            String confirm_password=t6.getText();
            
            
             if(password.equals(confirm_password)){
                JOptionPane.showMessageDialog(null,"password verified");
            }
            
            
             else if(password!=confirm_password){
                JOptionPane.showMessageDialog(null,"cross verify your password");
               
            }
            
            
        }
        
        
        
        
        if(ae.getSource()==b1){
            String username=t1.getText();
            String name=t2.getText();
            String phone_number=t3.getText();
            String email=t4.getText();
            String password=t5.getText();
            String confirm_password=t6.getText(); 
            String Password=confirm_password;
            String security=c1.getSelectedItem();
            String answer=t8.getText();
            
           
            String query1="insert into account values ('"+username+"','"+name+"','"+phone_number+"','"+email+"','"+Password+"') ";
            String query2="insert into security values('"+username+"' , '"+security+"','"+answer+"')" ;
            try{
                Conn c=new Conn();
                int a=c.s.executeUpdate(query1);
                int b=c.s.executeUpdate(query2);
                System.out.println(a);
                System.out.println(b);
                
                
                
                
                JOptionPane.showMessageDialog(null,"Account created succesfully");
                
                this.setVisible(false);
                new Login().setVisible(true);
            }
            catch(SQLIntegrityConstraintViolationException e1){
               
                JOptionPane.showMessageDialog(null,"Password exist try for new one");
                
            }
            catch(Exception e){
                
                System.out.println(e);
                
            }
            
            
            
            
        }
        
        else if(ae.getSource()==b2){
            new Login().setVisible(true);
            this.setVisible(false);
            
            
        }
    }
    
    
    public static void main(String[] args){
        new Signup().setVisible(true);
        
    }
    
}

