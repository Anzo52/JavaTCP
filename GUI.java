// Java GUI for TCPServer.java and TCPClient.java


// for layout managers and more
import java.awt.FlowLayout;
// for action events
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// for JFrame, JButton, JTextField, JLabel
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI {
    // create a frame
    private JFrame frame;
    // create a button
    private JButton button;
    // create a text field
    private JTextField textField;
    // create a label
    private JLabel label;

    public GUI() {
        // create a frame
        frame = new JFrame("TCP Client");
        // set the layout manager
        frame.setLayout(new FlowLayout());
        // create a button
        button = new JButton("Send");
        // create a text field
        textField = new JTextField(20);
        // create a label
        label = new JLabel("Enter a message");
        // add the components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        // add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // get the text from the text field
                String text = textField.getText();
                // send the text to the server
                TCPClient.send(text);
            }
        });
        // set the size of the frame
        frame.setSize(300, 200);
        // make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // create a GUI
        new GUI();
    }
}