package travel.management.system;

import javax.swing.*;
import java.awt.*;
public class splash {
    public static void main(String[] args){
        new splashFrame().setVisible(true);
    }
    
}

class splashFrame extends JFrame implements Runnable{
    Thread t1;
    splashFrame(){
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icon/startpage.jpg"));
        Image i2= i1.getImage().getScaledInstance(1100, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        add(l1);
        
        
        setUndecorated(true);
        t1=new Thread(this);
        t1.start();
        
        
        setBounds(200,100,1100,600);
       
        
        
    }
   
    
    public void run(){
        try{
            Thread.sleep(3000);
            this.setVisible(false);
            new Login().setVisible(true);
        }catch(Exception e){
            
        }   
    }    
}


