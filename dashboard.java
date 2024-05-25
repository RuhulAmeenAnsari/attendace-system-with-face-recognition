
package attendance.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class dashboard extends JFrame implements ActionListener{
   JButton studentdetails,facedetector,attendance,helpdesk,train_data,photos,developer,exit;
    dashboard(){
        
        setBounds(0, 0, 1550, 900);
        setLayout(null);
        
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
        Image i2 = i.getImage().getScaledInstance(1550, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 900);
        add(l1);
        
        ImageIcon std = new ImageIcon(ClassLoader.getSystemResource("icons/student.jpg"));
        Image std2 = std.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon std3 = new ImageIcon(std2);
        
       // adding button
        studentdetails = new JButton(std3);
        studentdetails.setBounds(200, 170, 200, 200);
        studentdetails.setForeground(Color.WHITE);
        studentdetails.setBackground(Color.darkGray);
        //next.addActionListener(this);
        studentdetails.setFont(new Font("Time new Roman", Font.ITALIC, 24));
        studentdetails.addActionListener(this);
        l1.add(studentdetails);
        JLabel st = new JLabel("STUDENTS");
        st.setBounds(235, 50, 200, 200);
        st.setFont(new Font("Times New Roman",Font.BOLD,25));
        st.setForeground(Color.white);
        l1.add(st);
        
        
        ImageIcon f = new ImageIcon(ClassLoader.getSystemResource("icons/facedetect.jpg"));
        Image f2= f.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        
        
       // adding button
        facedetector = new JButton(f3);
        facedetector.setBounds(500, 170, 200, 200);
        facedetector.setForeground(Color.WHITE);
        facedetector.setBackground(Color.darkGray);
        //next.addActionListener(this);
        facedetector.setFont(new Font("Time new Roman", Font.ITALIC, 24));
        l1.add(facedetector);
        JLabel fc = new JLabel("FACE DETECTOR");
        fc.setBounds(496, 50, 400, 200);
        fc.setFont(new Font("Times New Roman",Font.BOLD,25));
        fc.setForeground(Color.white);
        l1.add(fc);
        
         ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icons/attendance.jpg"));
        Image a2= a.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        
       // adding button
        attendance = new JButton(a3);
        attendance.setBounds(800, 170, 200, 200);
        attendance.setForeground(Color.WHITE);
        attendance.setBackground(Color.darkGray);
        //next.addActionListener(this);
        attendance.setFont(new Font("Time new Roman", Font.ITALIC, 24));
        l1.add(attendance);
        JLabel at=  new JLabel("ATTENDANCE");
        at.setBounds(810, 50, 400, 200);
        at.setFont(new Font("Times New Roman",Font.BOLD,25));
        at.setForeground(Color.white);
        l1.add(at);
        
        ImageIcon h = new ImageIcon(ClassLoader.getSystemResource("icons/help.jpg"));
        Image h2= h.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon h3 = new ImageIcon(h2);
        
       // adding button
        helpdesk = new JButton(h3);
        helpdesk.setBounds(1100, 170, 200, 200);
        helpdesk.setForeground(Color.WHITE);
        helpdesk.setBackground(Color.darkGray);
        //next.addActionListener(this);
        helpdesk.setFont(new Font("Time new Roman", Font.ITALIC, 24));
        l1.add(helpdesk);
        JLabel hd=  new JLabel("HELP DESK");
        hd.setBounds(1130, 50, 400, 200);
        hd.setFont(new Font("Times New Roman",Font.BOLD,25));
        hd.setForeground(Color.white);
        l1.add(hd);
        
        
        ImageIcon t = new ImageIcon(ClassLoader.getSystemResource("icons/train.png"));
        Image t2= t.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon t3 = new ImageIcon(t2);
        
       // adding button
        train_data = new JButton(t3);
        train_data.setBounds(200, 470, 200, 200);
        train_data.setForeground(Color.WHITE);
        train_data.setBackground(Color.darkGray);
        //next.addActionListener(this);
        train_data.setFont(new Font("Time new Roman", Font.ITALIC, 24));
        l1.add(train_data);
        
        JLabel td=  new JLabel("TRAIN DATA");
        td.setBounds(225, 350, 400, 200);
        td.setFont(new Font("Times New Roman",Font.BOLD,25));
        td.setForeground(Color.white);
        l1.add(td);
        
        ImageIcon p = new ImageIcon(ClassLoader.getSystemResource("icons/images.png"));
        Image p2= p.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon p3 = new ImageIcon(p2);
        
       // adding button
        photos = new JButton(p3);
        photos.setBounds(500, 470, 200, 200);
        photos.setForeground(Color.WHITE);
        photos.setBackground(Color.darkGray);
        //next.addActionListener(this);
        photos.setFont(new Font("Time new Roman", Font.ITALIC, 24));
        l1.add(photos);
        
        JLabel ph=  new JLabel("PHOTOS");
        ph.setBounds(535, 350, 400, 200);
        ph.setFont(new Font("Times New Roman",Font.BOLD,25));
        ph.setForeground(Color.white);
        l1.add(ph);
        
        ImageIcon d = new ImageIcon(ClassLoader.getSystemResource("icons/developer.jpg"));
        Image d2= d.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon d3 = new ImageIcon(d2);
        
       // adding button
        developer = new JButton(d3);
        developer.setBounds(800, 470, 200, 200);
        developer.setForeground(Color.WHITE);
        developer.setBackground(Color.darkGray);
        //next.addActionListener(this);
        developer.setFont(new Font("Time new Roman", Font.ITALIC, 24));
        l1.add(developer);
        
        JLabel dv=  new JLabel("DEVELOPERS");
        dv.setBounds(815, 350, 400, 200);
        dv.setFont(new Font("Times New Roman",Font.BOLD,25));
        dv.setForeground(Color.white);
        l1.add(dv);


        ImageIcon e = new ImageIcon(ClassLoader.getSystemResource("icons/exit.jpg"));
        Image e2= e.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon e3 = new ImageIcon(e2);
        
       // adding button
        exit = new JButton(e3);
        exit.setBounds(1100, 470, 200, 200);
        exit.setForeground(Color.WHITE);
        exit.setBackground(Color.darkGray);
        exit.addActionListener(this);
        exit.setFont(new Font("Time new Roman", Font.ITALIC, 24));
        l1.add(exit);
        
        JLabel ex=  new JLabel("EXIT");
        ex.setBounds(1155, 350, 400, 200);
        ex.setFont(new Font("Times New Roman",Font.BOLD,25));
        ex.setForeground(Color.white);
        l1.add(ex);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        try{
            if(ae.getSource()==exit){
                setVisible(false);
            }
            if(ae.getSource()== studentdetails){
                new student();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
             
        
    }
    
   public static void main(String[]args){
       new dashboard();
   }
}
