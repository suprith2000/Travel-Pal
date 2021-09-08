
package travel.management.system;

import java.awt.*;
import javax.swing.*;


public class Loading extends JFrame implements Runnable {
    JProgressBar p;
    Thread t;
    
    public void run(){
        try{
            for(int i=0 ;i<=101 ;i++){
                int m=p.getMaximum();
                int n=p.getValue();
                if(n<m){
                    
                    p.setValue(p.getValue()+1);
                    
                }
                else{
                    i=101;
                    setVisible(false);
                    new Dashboard().setVisible(true);
                }
                Thread.sleep(60);
            }
        }catch(Exception e){
            
        }
    }
    
    
    Loading(String user){
        
        String username= user;
        t=new Thread(this);
        setBounds(500,200,600,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel l1=new JLabel("TravelPal travelling servieces");
        l1.setBounds(150, 150, 600, 40);
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setForeground(Color.GRAY);
        add(l1);
        
        
        
        p=new JProgressBar ();
        p.setStringPainted(true);
        p.setBounds(140, 200, 300, 20);
        add(p);
        
         JLabel l2=new JLabel("please wait...");
        l2.setBounds(240, 230, 300, 40);
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        l2.setForeground(Color.RED);
        add(l2);
        
         JLabel l3=new JLabel("welcome " + username +"!");
        l3.setBounds(50, 40, 180, 40);
        l3.setFont(new Font("Tahoma",Font.PLAIN,16));
        l3.setForeground(Color.GRAY);
        add(l3);
        
        
        JLabel l4=new JLabel("Thank for choosing TravelPal travelling accomodities ");
        l4.setBounds(50, 70, 600, 30);
        l4.setFont(new Font("Raleway",Font.BOLD,16));
        l4.setForeground(Color.GRAY);
        add(l4);
        
        
        
        t.start();
        
    }
    public static void  main(String[] args){
        new Loading("").setVisible(true);
    }
    
}
