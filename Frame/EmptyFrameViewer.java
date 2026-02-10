import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class EmptyFrameViewer {
    public static void main(String[] args){
        JFrame frame = new JFrame();

        // no visual apperanace
        JButton button = new JButton("Click Me!");
        JLabel label = new JLabel("Hello World!");

        // create a panel object, and add button and label in panel
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);

        // add panel in frame to get the visual appearance
        frame.add(panel);

        final int FrameWidth = 300;
        final int FrameHeight = 400;
        frame.setSize(FrameHeight, FrameWidth);
        frame.setTitle("Frame");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
