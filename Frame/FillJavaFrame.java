import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;

public class FillJavaFrame extends JFrame {
    // components as a instance variables
    public JButton button;
    public JLabel label;

    public static final int FrameWidth = 300;
    public static final int FrameHeight = 100;

    // constructor
    public FillJavaFrame() {
        createComponent();
        setSize(FrameWidth, FrameHeight);
    }

    public void createComponent() {
        button = new JButton("Click Me!!!");
        label = new JLabel("Keep on Smiling 😁");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);

        ActionListener listener = new ClickListener();
        button.addActionListener(listener);

    }

}
