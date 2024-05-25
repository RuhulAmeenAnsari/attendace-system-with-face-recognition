
package attendance.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JTextField username;JPasswordField password;
    JButton Login,Cancel;
    
    Login() {
        getContentPane().setBackground(Color.white);
        setBounds(0, 0, 1550, 900);
        setLayout(null);
         ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
        Image img2 = img.getImage().getScaledInstance(1550, 900, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel l1 = new JLabel(img3);
        l1.setBounds(0, 0, 1550, 900);
        add(l1);
       

        JLabel user = new JLabel("Username");
        user.setBounds(630,400, 100, 30);
        user.setForeground(Color.white);
        user.setFont(new Font("Times new Roman",Font.BOLD,20));
        l1.add(user);

        username = new JTextField();
        username.setBounds(750, 400, 170, 25);
       l1. add(username);

        JLabel pass = new JLabel("Password");
        pass.setBounds(630,450, 100, 30);
        pass.setForeground(Color.white);
        pass.setFont(new Font("Times new Roman",Font.BOLD,20));
        l1.add(pass);

        password = new JPasswordField();
        password.setBounds(750, 450, 170, 25);
        l1.add(password);

         Login = new JButton("LOG IN ");
        Login.setBounds(630, 500, 120, 30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.white);
        l1.add(Login);
        Login.addActionListener(this);

        Cancel = new JButton(" CANCEL ");
        Cancel.setBounds(800, 500, 120, 30);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.white);
        l1.add(Cancel);
        Cancel.addActionListener(this);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon1 = new JLabel(i3);
        icon1.setBounds(675, 180, 200, 200);
        l1.add(icon1);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==Login){
          String user = username.getText();
          String pass = password.getText();
          try{
             conn c = new conn();
             String query = " select * from Login where username = '"+ user +"' and password = '"+ pass +"' ";
             ResultSet rs = c.s.executeQuery(query);
             if(rs.next()){
                 setVisible(false);
                 new dashboard();
             }
             else{
                 JOptionPane.showMessageDialog(null,"invalid username or password");
                 setVisible(false);
             }
          }catch(Exception e){
              e.printStackTrace();
          }
      }
      else if (ae.getSource()==Cancel){
          setVisible(false);
      }
    }
    public static void main(String[] args) {
        new Login();
    }
}
