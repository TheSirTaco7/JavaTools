import javax.swing.*;
import java.awt.*;

public class SimpleWindowExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowWindow());
    }

    private static void createAndShowWindow() {
        JFrame frame = new JFrame("Rectangle Window Example");
        frame.setSize(1200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Create a custom JPanel where we will draw the rectangle
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawRectangle(g);
            }

            private void drawRectangle(Graphics g) {
                // Set the color of the rectangle
                g.setColor(Color.BLUE);

                // Draw a rectangle at coordinates (50, 50) with width 100 and height 80
                g.fillRect(50, 50, 100, 80);
            }
        };

        // Add the custom JPanel to the JFrame
        frame.add(panel);

        frame.setVisible(true);
    }
}
