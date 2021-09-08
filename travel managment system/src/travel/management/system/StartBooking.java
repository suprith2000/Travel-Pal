

package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class StartBooking extends JFrame implements ActionListener{
    
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    Choice c1,c2,c3,c4,c5,c6;
    JTextField t1,t2,t3;
    JButton b1,b2,b3;
    
    
    
   StartBooking(){
       
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setLayout(null);
       
       setBounds(350,130,1000,650);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       l1=new JLabel("what place u need to Explore ?");
       l1.setFont(new Font("Tahoma",Font.BOLD,25));
       l1.setForeground(Color.GRAY);
       l1.setBounds(80, 10, 400, 40);
       add(l1);
       
       
       l2=new JLabel("choose destinations  :");
       l2.setFont(new Font("Tahoma",Font.BOLD,16));
       l2.setForeground(Color.GRAY);
       l2.setBounds(80, 80, 300, 40);
       add(l2);
       
       
       
       c1=new Choice ();
        c1.add("Banglore");
        c1.add("Mysore");
        c1.add("vijayapur");
        c1.add("chikamagaluru");
        c1.setBounds(400,80,300,30);
        add(c1);
        
        
        
          
          
          
       l3=new JLabel("sites to visit at your destination :");
       l3.setFont(new Font("Tahoma",Font.BOLD,16));
       l3.setForeground(Color.GRAY);
       l3.setBounds(80, 150, 300, 40);
       add(l3);
       
       

       t1=new JTextField();
       t1.setBounds(400,150,300,30);
       add(t1);
       
        
        
       
        
       l4=new JLabel("How do you want to travel ?");
       l4.setFont(new Font("Tahoma",Font.BOLD,25));
       l4.setForeground(Color.GRAY);
       l4.setBounds(80, 210, 400, 40);
       add(l4);
       
       
       
       l8=new JLabel("customer name");
       l8.setFont(new Font("Tahoma",Font.BOLD,16));
       l8.setForeground(Color.GRAY);
       l8.setBounds(80, 280, 300, 40);
       add(l8);
       
       
       
       
       t2=new JTextField();
       t2.setBounds(400,280,300,25);
       add(t2);
       
       
       
       
       
 
       l5=new JLabel("number of people");
       l5.setFont(new Font("Tahoma",Font.BOLD,16));
       l5.setForeground(Color.GRAY);
       l5.setBounds(80, 330, 300, 40);
       add(l5);
       
       c3=new Choice ();
       c3.add("1 to 2 people");
       c3.add("3 to 5 people");
       c3.add("5 to 10 people");
       c3.add("more than 10 people");
       c3.setBounds(400,330,300,30);
       add(c3);
      
       l6=new JLabel("vehicle type");
       l6.setFont(new Font("Tahoma",Font.BOLD,16));
       l6.setForeground(Color.GRAY);
       l6.setBounds(80, 380, 300, 40);
       add(l6);
       
       
       c4=new Choice();
       c4.add("moped");
       c4.add("sports bike");
       c4.add("SUV car");
       c4.add("jeepse");
       c4.add("cruser");
       c4.add("mini bus");
       c4.setBounds(400,380,300,30);
       add(c4);
       
       
       l7=new JLabel("mode of driving");
       l7.setFont(new Font("Tahoma",Font.BOLD,16));
       l7.setForeground(Color.GRAY);
       l7.setBounds(80, 430, 300, 40);
       add(l7);
       
       c5=new Choice ();
       c5.add("self-driving");
       c5.add("paid driving");
       c5.setBounds(400,430,300,30);
       add(c5);
       
       
       
        l8=new JLabel("number of days");
       l8.setFont(new Font("Tahoma",Font.BOLD,16));
       l8.setForeground(Color.GRAY);
       l8.setBounds(80, 480, 300, 40);
       add(l8);
       
       
       String dy1="one day";
       String dy2="three days";
       String dy3="five days";
       
       
       c6=new Choice ();
       c6.add(dy1);
       c6.add(dy2);
       c6.add(dy3);
       c6.setBounds(400,480,300,30);
       add(c6);
       
       
        b1=new JButton("Confirm");
        b1.setFont(new Font ("Tahoma" ,Font.BOLD,14));
        b1.setBackground(new Color(95,158,160));
        b1.setForeground(Color.WHITE);
//        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBounds(300, 550, 100, 30);
        b1.addActionListener(this);
        add(b1);
       
 
       b3=new JButton("Back");
       b3.setFont(new Font ("Tahoma" ,Font.BOLD,14));
       b3.setForeground(new Color(95,158,160));
       b3.setBackground(Color.WHITE);
//       b3.setBorder(BorderFactory.createEmptyBorder());
       b3.setBounds(500, 550, 80, 30);
       b3.addActionListener(this);
       add(b3);
    
       
       
       
       
       
   }
   
   
   
   public void actionPerformed(ActionEvent ae){
       
       if(ae.getSource()==b1){
            String city=c1.getSelectedItem();
            String places=t1.getText();
            String username=t2.getText();
            String people=c3.getSelectedItem();
            String vehicle=c4.getSelectedItem();
            String driving_mode=c5.getSelectedItem();
            String days=c6.getSelectedItem();
            
           
             
           
           String a1="1 to 2 people";
           String a2="3 to 5 people";
           String a3="5 to 10 people";
           String a4="more than 10 people";
           
           
           String v1="moped";
           String v2="sports bike";
           String v3="SUV car";
           String v4="jeepse";
           String v5="cruser";
           String v6="mini bus";
           
           
           
           String d1="self-driving";
           String d2="paid driving";
           
           
           
           String dy1="one day";
           String dy2="three days";
           String dy3="five days";
           
           
           int bill=0;
             
             if(vehicle==v1){
                 if(driving_mode==d1 && days==dy1){
                     bill=500;
                 }
                 if(driving_mode==d1 && days==dy2){
                     bill=1000;
                 }
                 if(driving_mode==d1 && days==dy3){
                     bill=1500;
                 }
                 if(driving_mode==d2 && days==dy1){
                     bill=1000;
                 }
                 if(driving_mode==d2 && days==dy2){
                     bill=2000;
                 }
                 if(driving_mode==d2 && days==dy3){
                     bill=3000;
                 }
             }
             if(vehicle==v2){
                 if(driving_mode==d1 && days==dy1){
                     bill=1000;
                 }
                 if(driving_mode==d1 && days==dy2){
                     bill=1500;
                 }
                 if(driving_mode==d1 && days==dy3){
                     bill=2000;
                 }
                 if(driving_mode==d2 && days==dy1){
                     bill=2000;
                 }
                 if(driving_mode==d2 && days==dy2){
                     bill=3000;
                 }
                 if(driving_mode==d2 && days==dy3){
                     bill=4000;
                 }
             }
             if(vehicle==v3){
                 if(driving_mode==d1 && days==dy1){
                     bill=1500;
                 }
                 if(driving_mode==d1 && days==dy2){
                     bill=2000;
                 }
                 if(driving_mode==d1 && days==dy3){
                     bill=2500;
                 }
                 if(driving_mode==d2 && days==dy1){
                     bill=3000;
                 }
                 if(driving_mode==d2 && days==dy2){
                     bill=4000;
                 }
                 if(driving_mode==d2 && days==dy3){
                     bill=5000;
                 }
             }
              if(vehicle==v4){
                 if(driving_mode==d1 && days==dy1){
                     bill=2000;
                 }
                 if(driving_mode==d1 && days==dy2){
                     bill=2500;
                 }
                 if(driving_mode==d1 && days==dy3){
                     bill=3000;
                 }
                 if(driving_mode==d2 && days==dy1){
                     bill=4000;
                 }
                 if(driving_mode==d2 && days==dy2){
                     bill=5000;
                 }
                 if(driving_mode==d2 && days==dy3){
                     bill=6000;
                 }
             }
             if(vehicle==v5){
                 if(driving_mode==d1 && days==dy1){
                     bill=2500;
                 }
                 if(driving_mode==d1 && days==dy2){
                     bill=3000;
                 }
                 if(driving_mode==d1 && days==dy3){
                     bill=3500;
                 }
                 if(driving_mode==d2 && days==dy1){
                     bill=5000;
                 }
                 if(driving_mode==d2 && days==dy2){
                     bill=6000;
                 }
                 if(driving_mode==d2 && days==dy3){
                     bill=7000;
                 }
             }
             
             if(vehicle==v6){
                 if(driving_mode==d1 && days==dy1){
                     bill=3000;
                 }
                 if(driving_mode==d1 && days==dy2){
                     bill=3500;
                 }
                 if(driving_mode==d1 && days==dy3){
                     bill=4000;
                 }
                 if(driving_mode==d2 && days==dy1){
                     bill=6000;
                 }
                 if(driving_mode==d2 && days==dy2){
                     bill=7000;
                 }
                 if(driving_mode==d2 && days==dy3){
                     bill=8000;
                 }
             }
             
    
             
             
             
         String query1="insert into booking values ('"+username+"','"+city+"','"+places+"','"+people+"','"+vehicle+"','"+driving_mode+"','"+days+"') ";
         String query2="insert into bill values ('"+username+"','"+bill+"')";
         
             
   
             
         
           try{
                Conn c=new Conn();
                int a=c.s.executeUpdate(query1);
                int b=c.s.executeUpdate(query2);
                System.out.println(a);
                System.out.println(b);
//                JOptionPane.showMessageDialog(null,"Account created succesfully");
                
                this.setVisible(false);
                new BookingSummary(t2.getText()).setVisible(true);
            }catch(Exception e){
                
                System.out.println(e);
                
            }
       if(ae.getSource()==b3){
           this.setVisible(false);
     
           
       }
       
      new StartBooking().setVisible(false); 
   }
   
   
    
   }
   
   public static void main(String[] args){
 new StartBooking().setVisible(true);

}
   
   
}


