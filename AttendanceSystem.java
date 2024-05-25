
package attendance.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AttendanceSystem extends JFrame implements ActionListener {
    JButton next;
    AttendanceSystem(){
        setSize(900, 500); // set frame size
        setLocation(100, 100); // set location of frame with respect to screen

        // we can use setBounds in place of setsize and setlocation
        // setBounds(100, 100, 1366, 565);

        setLayout(null); // set image layout (null means no layout so image will disappear if use null)
                         // border, grid are some of layout

        // Adding Image to Frame

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);// import
                                                                                        // image
                                                                                        // from
                                                                                        // device
        JLabel image = new JLabel(i1); // add image in label format
        image.setBounds(0, 0, 900, 500); // location x , location y , length , bradth (here the location are set with
                                          // respect to frame)
        add(image); // add "image" label in the frame

        // Adding Text on the image

        JLabel text = new JLabel("WELCOME TO ATTENDANCE SYSTEM");
        text.setBounds(20, 400, 800, 90);
        text.setForeground(Color.black); // Cange text colour
        text.setFont(new Font("serif", Font.BOLD, 30));
        image.add(text); // set text on image

        // Adding image on button
        
        ImageIcon nextb = new ImageIcon(ClassLoader.getSystemResource("icons/next.jpg"));
        Image nb = nextb.getImage().getScaledInstance(150, 50, Image.SCALE_DEFAULT);
        ImageIcon nxtb = new ImageIcon(nb);
       // adding button
        next = new JButton(nxtb);
        next.setBounds(700, 400, 150, 50);
        next.setForeground(Color.WHITE);
        next.setBackground(Color.darkGray);
        next.addActionListener(this);
        next.setFont(new Font("Time new Roman", Font.ITALIC, 24));
        image.add(next);

        setVisible(true);// set visibility

        // add blinking effect to the text

        while (true) {
            text.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            text.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void actionPerformed(ActionEvent ae){
       
            try{
            if (ae.getSource()== next){
                setVisible(false);
                new Login();
}
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    
    
    public static void main(String[] args) {
        new AttendanceSystem();
    }

    
}
