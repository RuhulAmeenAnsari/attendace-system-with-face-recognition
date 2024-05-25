package attendance.system;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

public class WebcamCapture extends JPanel implements ActionListener {

  private JButton captureButton;
  private Mat frame;
  private JFrame frameWindow;

  public WebcamCapture() {
    captureButton = new JButton("Capture");
    captureButton.addActionListener(this);
    add(captureButton);

    if (!Highgui.isOpened(0)) {
      System.err.println("Error opening camera!");
      System.exit(1);
    }

    frame = new Mat();
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(640, 480);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (frame != null) {
      // Convert Mat to BufferedImage
      MatOfByte byteFrame = new MatOfByte();
      Imgproc.cvtColor(frame, byteFrame, Imgproc.COLOR_BGR2GRAY);
      BufferedImage image = null;
      try {
        image = ImageIO.read(new ByteArrayInputStream(byteFrame.toArray()));
      } catch (IOException e) {
        e.printStackTrace();
      }
      if (image != null) {
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == captureButton) {
      Highgui.read(0, frame);
      repaint();
    }
  }

  public static void main(String[] args) {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // Load OpenCV library

    WebcamCapture capturePanel = new WebcamCapture();
    capturePanel.setOpaque(true);

    JFrame frame = new JFrame("Webcam Capture");
    frame.setContentPane(capturePanel);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

