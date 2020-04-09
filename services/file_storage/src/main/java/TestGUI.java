import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.print.attribute.standard.Media;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import java.io.File;


public class TestGUI extends JFrame {
    private JPanel mainPanel;

    public TestGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }


    public static void main(String[] args) {
        JFrame frame = new TestGUI("Test Gui");

        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
        b.addActionListener(actionEvent -> {
            System.out.println(1);
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {
                // user selects a file
                File selectedFile = fileChooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            }
        });

        frame.add(b);//adding button in JFrame

        frame.setSize(400,500);//400 width and 500 height
        frame.setLayout(null);

        frame.setVisible(true);

    }
}
