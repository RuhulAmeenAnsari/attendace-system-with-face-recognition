
package attendance.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;



public class student extends JFrame implements ActionListener{
    JComboBox department,course,gender,year,semester,srch;
    JTextField stdnt_id , name ,srcht, rollno,enroll,birth,email,phone,address,teacher;
    JRadioButton tps,nps;
    JButton save , update ,delete,reset, takesample ,srchB, updatesample,showall;
    JTable t1,search;
    student(){
        
      setBounds(0,0,1550,900); 
      setLayout(null);
      
      
      // top images
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/label.jpeg"));
      Image i2 = i1.getImage().getScaledInstance(927, 176, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel l1 = new JLabel(i3);
      l1.setBounds(320,0,927,176);
      add(l1);
      ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icons/face.jpg"));
      Image im2 = im1.getImage().getScaledInstance(320, 213, Image.SCALE_DEFAULT);
      ImageIcon im3 = new ImageIcon(im2);
      JLabel lb1 = new JLabel(im3);
      lb1.setBounds(0,0,320,176);
      add(lb1);
      ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/face2.png"));
      Image img2 = img1.getImage().getScaledInstance(320, 213, Image.SCALE_DEFAULT);
      ImageIcon img3 = new ImageIcon(img2);
      JLabel lbl1 = new JLabel(img3);
      lbl1.setBounds(1247,0,320,176);
      add(lbl1);
      
      // label
      
      JLabel std = new JLabel("STUDENTS MANAGEMENT SYSTEM");
      std.setBounds(400,110,800,200);
      std.setForeground(Color.BLACK);
      std.setFont(new Font("Calibri",Font.BOLD,50));
      add(std);
              
     // creating container inside a frame
      
//      JPanel studentdetail = new JPanel();
//      studentdetail.setBounds(0,230,600,1200);
//      studentdetail.setBackground(Color.LIGHT_GRAY);
//      add(studentdetail);
//
//      JPanel studentdata = new JPanel();
//      studentdata.setBounds(610,230,1100,1200);
//      studentdata.setBackground(Color.LIGHT_GRAY);
//      add(studentdata);
      
      JLabel Std_detail = new JLabel("Students Infromation");
      Std_detail.setBounds(180,200,200,50);
      Std_detail.setFont(new Font("calibri",Font.ITALIC,20));
      add(Std_detail);
      
      JLabel course_detail = new JLabel("Current Course Details");
      course_detail.setBounds(5,210,220,50);
      course_detail.setFont(new Font("calibri",Font.ITALIC,15));
      add(course_detail);
      
      JLabel dep = new JLabel("Department");
      dep.setBounds(10,260,150,25);
      dep.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(dep);
      
      String dprmnt[]={"CSE","ME","Electrical","IT"};
      department = new JComboBox(dprmnt);
      department.setBounds(140,260,120,25);
      department.setBackground(Color.white);
      add(department);
      
      JLabel crs = new JLabel("Course");
      crs.setBounds(280,260,150,25);
      crs.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(crs);
      
      String cors[]={"B.Tech","BCA","Diploma",};
      course = new JComboBox(cors);
      course.setBounds(370,260,120,25);
      course.setBackground(Color.white);
      add(course);
      
      
      
      JLabel yr = new JLabel("Year");
      yr.setBounds(10,300 ,150 , 25);
      yr.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(yr);
      String yrs[]={"First","Second","Third","Fourth"};
      year = new JComboBox(yrs);
      year.setBounds(140,300,120,25);
      year.setBackground(Color.white);
      add(year);
      
      
      JLabel sem = new JLabel("Semester");
      sem.setBounds(280,300 ,150 , 25);
      sem.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(sem);
      
      String[] sms = {"1st","2nd","3rd","4th","5th","6th","7th","8th"};
      semester = new JComboBox(sms);
      semester.setBounds(370,300,120,25);
      semester.setBackground(Color.white);
      add(semester);
      
      JLabel class_Std_detail = new JLabel("Class Students Details");
      class_Std_detail.setBounds(180,335,200,50);
      class_Std_detail.setFont(new Font("calibri",Font.ITALIC,15));
      add(class_Std_detail);
      
      JLabel id = new JLabel("Student ID");
      id.setBounds(10,380,150,25);
      id.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(id);
      
      JLabel nm = new JLabel("Name");
      nm.setBounds(280,380,150,25);
      nm.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(nm);
      
      JLabel rn = new JLabel("Roll No.");
      rn.setBounds(10,420,150,25);
      rn.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(rn);
      
      JLabel en = new JLabel("Enrollment No.");
      en.setBounds(280,420,150,25);
      en.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(en);
      
      JLabel gn = new JLabel("Gender");
      gn.setBounds(10,460,150,25);
      gn.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(gn);
      
      JLabel dob = new JLabel("DOB");
      dob.setBounds(280,460,150,25);
      dob.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(dob);
      
      JLabel em = new JLabel("Email");
      em.setBounds(10,500,150,25);
      em.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(em);
      
      JLabel ph = new JLabel("Phone No.");
      ph.setBounds(280,500,150,25);
      ph.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(ph);
      
      JLabel ad = new JLabel("Address");
      ad.setBounds(10,540,150,25);
      ad.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(ad);
      
      JLabel tn = new JLabel("Teacher Name");
      tn.setBounds(280,540,150,25);
      tn.setFont(new Font("Times new roman",Font.PLAIN,15));
      add(tn);
      
      stdnt_id = new JTextField();
      stdnt_id.setBounds(100,380,150,20);
      add(stdnt_id);
      
      name = new JTextField();
      name.setBounds(380,380,150,20);
      add(name);
      
      rollno = new JTextField();
      rollno.setBounds(100,420,150,20);
      add(rollno);
      
      enroll = new JTextField();
      enroll.setBounds(380,420,150,20);
      add(enroll);
      
      String [] Gndr = {"Male","Female"};
      gender = new JComboBox(Gndr);
      gender.setBackground(Color.white);
      gender.setBounds(100,460,150,20);
      add(gender);
      
      birth = new JTextField();
      birth.setBounds(380,460,150,20);
      add(birth);
      
      email = new JTextField();
      email.setBounds(100,500,150,20);
      add(email);
      
      phone = new JTextField();
      phone.setBounds(380,500,150,20);
      add(phone);
      
      address = new JTextField();
      address.setBounds(100,540,150,20);
      add(address);
      
      teacher = new JTextField();
      teacher.setBounds(380,540,150,20);
      add(teacher);
      
      tps = new JRadioButton("Take Photo Sample");
      tps.setFont(new Font("Times new roman",Font.PLAIN,15));
      tps.setBounds(100,580,150,20);
      add(tps);
      
      nps = new JRadioButton("No Photo Sample");
      nps.setFont(new Font("Times new roman",Font.PLAIN,15));
      nps.setBounds(380,580,150,20);
      add(nps);
      
      ButtonGroup bg = new ButtonGroup();
      bg.add(tps);
      bg.add(nps);
      
      save = new JButton("Save");
      save.setFont(new Font("Times new roman",Font.PLAIN,15));
      save.setBackground(Color.black);
      save.setForeground(Color.white);
      save.setBounds(150,620,300,20);
      save.addActionListener(this);
      add(save);
      
//      update = new JButton("Update");
//      update.setFont(new Font("Times new roman",Font.PLAIN,15));
//      update.setBackground(Color.black);
//      update.setForeground(Color.white);
//      update.setBounds(380,620,150,20);
//      add(update);
      
      delete = new JButton("Delete");
      delete.setFont(new Font("Times new roman",Font.PLAIN,15));
      delete.setBackground(Color.black);
      delete.setForeground(Color.white);
      delete.setBounds(150,660,300,20);
      delete.addActionListener(this);
      add(delete);
      
//      reset = new JButton("Reset");
//      reset.setFont(new Font("Times new roman",Font.PLAIN,15));
//      reset.setBackground(Color.black);
//      reset.setForeground(Color.white);
//      reset.setBounds(380,660,150,20);
//      add(reset);
      
      takesample = new JButton("Take Photo Sample");
      takesample.setFont(new Font("Times new roman",Font.PLAIN,15));
      takesample.setBackground(Color.black);
      takesample.setForeground(Color.white);
      takesample.setBounds(150,700,300,20);
      add(takesample);
      
      updatesample = new JButton("Update Photo Sample");
      updatesample.setFont(new Font("Times new roman",Font.PLAIN,15));
      updatesample.setBackground(Color.black);
      updatesample.setForeground(Color.white);
      updatesample.setBounds(150,740,300,20);
      add(updatesample);
      
      JLabel search = new JLabel("Search by");
      search.setBounds(570, 250, 80, 20);
      search.setFont(new Font("Times new roman",Font.PLAIN,20));
      search.setForeground(Color.red);
      add(search);
      
      search = new JLabel("student_id");
      search.setFont(new Font("Times new roman",Font.PLAIN,20));
      search.setBackground(Color.white);
      search.setBounds(670,250,250,20);
      add(search);
      
      srchB = new JButton("Search");
      srchB.setBounds(1000,250,150,20);
      srchB.setBackground(Color.black);
      srchB.setForeground(Color.white);
      add(srchB);
      srchB.addActionListener(this);
      showall = new JButton("Show All");
      showall.setBounds(1170,250,150,20);
      showall.setBackground(Color.black);
      showall.setForeground(Color.white);
      add(showall);
      showall.addActionListener(this);
      
      srcht = new JTextField();
      srcht.setBounds(780,250,200,20);
      add(srcht);
      
      
      
      
//      Object data[][] ={};
//      Object columnNames[]={"Student ID","Name","Roll No.","Enrollment No.","Gender","DOB","Email","Phone No.","Address","Teacher Name","Department","Course","year","Semester"};
        t1 = new JTable();
      t1.setBackground(Color.white);
      t1.setBounds(540,280,950,470);
      add(t1);
      
       JScrollBar y = new JScrollBar(JScrollBar.VERTICAL);
      y.setBounds(1520,280,15,550);
      add(y);
      
      JScrollBar x = new JScrollBar(JScrollBar.HORIZONTAL);
      x.setBounds(540,780,980,15);
      add(x);
      
      JScrollPane sp = new JScrollPane(t1);
      sp.setBackground(Color.white);
      sp.setBounds(540,280,980,500);
      add(sp);
      
      
      
      
      

      setVisible(true);
      
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String dep = (String)department.getSelectedItem();
        String crs = (String)course.getSelectedItem();
        String yrs = (String)year.getSelectedItem();
        String smstr = (String)semester.getSelectedItem();
        String s_id = stdnt_id.getText();
        String nm = name.getText();
        String rl = rollno.getText();
        String enrl = enroll.getText();
        String gn = (String)gender.getSelectedItem();
        String brth = birth.getText();
        String eml = email.getText();
        String phn = phone.getText();
        String Adrs = address.getText();
        String tch = teacher.getText();
        String srchtxt = srcht.getText();
        try{
             conn c = new conn();
           if(ae.getSource()== save){
           
            String query1 = "insert into student_info values('"+s_id+"','"+nm+"','"+rl+"','"+enrl+"','"+gn+"','"+brth+"','"+eml+"','"+phn+"','"+Adrs+"','"+tch+"','"+dep+"','"+crs+"','"+yrs+"','"+smstr+"')";
           
            c.s.executeUpdate(query1);
            
            JOptionPane.showMessageDialog(null, "Student added successfully");
}
            else if (ae.getSource() == showall){
                    
                    
                   ResultSet rs =  c.s.executeQuery("select * from student_info");
                   t1.setModel(DbUtils.resultSetToTableModel(rs));
                    
                    
                    }
            else if (ae.getSource() == search ){                 
                   ResultSet rs =  c.s.executeQuery("select * from student_info where s_id = '"+ srchtxt +"'");
                   t1.setModel(DbUtils.resultSetToTableModel(rs));                                           
            } 
            else if(ae.getSource() == delete){
                ResultSet rs = c.s.executeQuery("delete from student_info where s_id = '"+ srchtxt +"'");
                t1.setModel(DbUtils.resultSetToTableModel(rs));  
            }
                  
        
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    
    public static void main(String []args){
        
        new student();
        
    }
}
