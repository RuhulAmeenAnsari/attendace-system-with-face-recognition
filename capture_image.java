
package attendance.system;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;


public class capture_image extends JFrame {
    private JLabel camera;
    JButton captureImage;
    private VideoCapture capture;
    private Mat image;
    private Boolean clicked = false;
    
    capture_image(){
        
        setLayout(null);
        setBounds(450,100,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        captureImage = new JButton("Capture");
        captureImage.setBounds(260,490,100,30);
        add(captureImage);
        captureImage.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            clicked = true;
            }
    });
        
       
        setVisible(true);
        
        
    }
    
    public void startCamera(){
        capture = new VideoCapture();
        image = new Mat();
        byte[] imagedata;
        ImageIcon icon;
        while (true){
            //read image form matrix
            capture.read(image);
            //convert matrix to byte
            final MatOfByte buf = new MatOfByte();
            Imgcodecs.imencode(".jpg",image,buf);
            imagedata=buf.toArray();
            //add to  jlabel
            icon = new ImageIcon(imagedata);
            camera.setIcon(icon);
            //capture and save
            if ( clicked){
                //prompt for enter image name
                String name  = JOptionPane.showInputDialog(this,"enter image name");
                if (name == null){
                    name = new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss").format(new Date());
                }
                //write to file
                Imgcodecs.imwrite("images/" + name + ".jpg",image);
                
                clicked = false;
            }
        }
    }
    
    public static void main(String[]args){
       
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("Load Successful");
        EventQueue.invokeLater(new Runnable(){
            
        
        public void run(){
       capture_image capture_image = new capture_image();
        
       new Thread(new Runnable(){
          
           public void run(){
               capture_image.startCamera();
           } 
       }).start();
        }
        });
      }
     }
        
     
             
   