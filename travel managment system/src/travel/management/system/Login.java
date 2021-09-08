
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    
    
    
    Login(){
//        setSize(400,400);
//        setLocation(400,200)

          setLayout(null);
          getContentPane().setBackground(Color.WHITE);
          setBounds(400,300,800,400);
          
          JPanel p1=new JPanel();
          p1.setBackground(new Color (230,230,250));
          p1.setBounds(0, 0, 400, 400);
//          p1.setLayout(null);
          add(p1);
          
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icon/login (1).png"));
          Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
          JLabel l1= new JLabel(i3);
          l1.setBounds(200, 300, 100, 200);
          p1.add(l1);
          
          JPanel p2=new JPanel();
          p2.setBackground(new Color (192,192,192));
          p2.setBounds(400, 0, 400, 400);
          p2.setLayout(null);
          add(p2);
          
          JLabel l2=new JLabel("Username");
          l2.setBounds(60,20,100,25);
          l2.setFont(new Font ("SAN_SERIF",Font.PLAIN,20));
          p2.add(l2);
          
          
          t1=new JTextField();
          t1.setBounds(60, 60, 300, 30);
          t1.setBorder(BorderFactory.createEmptyBorder());
          p2.add(t1);
          
          
           JLabel l3=new JLabel("Passward");
          l3.setBounds(60,110,100,25);
          l3.setFont(new Font ("SAN_SERIF",Font.PLAIN,20));
          p2.add(l3);
          
          
          t2=new JPasswordField();
          t2.setBounds(60, 150, 300, 30);
          t2.setBorder(BorderFactory.createEmptyBorder());
          p2.add(t2);
          
          b1=new JButton("Login");
           b1.addActionListener(this);
          b1.setBounds(60,250,130,30);
          b1.setBackground(new Color(95,158,160));
          b1.setForeground(Color.WHITE);
          b1.setBorder(BorderFactory.createEmptyBorder());
          p2.add(b1);
          
          
          b2=new JButton("signup");
          b2.addActionListener(this);
          b2.setBounds(220,250,130,30);
          b2.setForeground(new Color(95,158,160));
          b2.setBackground(Color.WHITE);
          b2.setBorder(new LineBorder (new Color(230,230,250)));
          p2.add(b2);
          
          
          b3=new JButton("forgot password");
          b3.addActionListener(this);
          b3.setBounds(150,300,100,25);
          b3.setForeground(new Color(95,158,160));
          b3.setBackground(Color.WHITE);
          b3.setBorder(new LineBorder (new Color(230,230,250)));
          p2.add(b3);
          
          
          setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            
           Boolean status = false;
		try {
                    Conn con = new Conn();
                    String sql = "select * from account where username=? and Password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, t1.getText());
                    st.setString(2, t2.getText());

                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        this.setVisible(false);
                        new Loading(t1.getText()).setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
                }
        }
                else if(ae.getSource()==b2){
            this.setVisible(false);
            new Signup().setVisible(true);
            this.setVisible(false);
            
            
        }else if (ae.getSource()==b3){
            
            this.setVisible(false);
            new ForgotPassword().setVisible(true);
            }
        
    }
    
    public static void main(String[] args){
       new Login();
    }
    
}
