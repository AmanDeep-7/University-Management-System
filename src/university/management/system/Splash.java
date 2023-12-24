
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image ii= i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(ii);
        JLabel image = new JLabel(i2);
        add(image);
         setVisible(true);
        t = new Thread(this);
        t.start();
        int x=0;
        for(int i=2; i<=500 ; i++, x++)
        {
            setLocation(700-(i+x)/2, 500-(i+x)/2);
            setSize(i+x,i+x/3);
            
            try {
                Thread.sleep(1);
            }
            catch(Exception e){}
        }
        
       
    }

    public void run(){
        try{
            //firstFrame close
            Thread.sleep(7000);
            setVisible(false);
            
           //next frame
          new Login();
           
        } catch (Exception e){}
    }
    
    
    public static void main(String[] args) {
        new Splash();
    }
    
}
