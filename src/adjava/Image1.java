package adjava;


import javax.swing.*;
import java.awt.*;

public class Image1{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        JPanel panel = new JPanel();
        panel.setLayout(null); // Using null layout for absolute positioning
        
        // Assuming the image is in the current directory or provide the correct path
        ImageIcon backgroundImage = new ImageIcon("imgs/demo.jpg");
        JButton jBtn = new JButton(backgroundImage);
        jBtn.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        
        panel.add(jBtn); // Add button to panel
        
        frame.add(panel); // Add panel to frame
        frame.setVisible(true);
    }
}