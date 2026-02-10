import javax.swing.JFrame;

public class EmptyFrameViewer {
    public static void main(String[] args){
        // Create a frame instance of FillJavaFrame class
        JFrame frame = new FillJavaFrame();

        frame.setTitle("A Frame with two components");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
