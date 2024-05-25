package attendance.system;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class FaceDetection {
    public static void main(String[] args) {
        // Load the OpenCV native library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Load the cascade classifier for face detection
        CascadeClassifier faceCascade = new CascadeClassifier();
        faceCascade.load("data/haarcascade_frontalface_alt2.xml"); // You need to provide the path to the XML file

        // Read input image
        Mat image = Imgcodecs.imread("images/faces.jpg"); // Provide the path to your input image
        
        // Convert image to grayscale
        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);

        // Detect faces in the image
        MatOfRect faceDetections = new MatOfRect();
        faceCascade.detectMultiScale(grayImage, faceDetections);

        // Draw rectangles around detected faces
        for (Rect rect : faceDetections.toArray()) {
            Imgproc.rectangle(image, rect.tl(), rect.br(), new Scalar(0, 255, 0), 3);
        }

        // Save the output image
        Imgcodecs.imwrite("output_image.jpg", image);
    }
}

