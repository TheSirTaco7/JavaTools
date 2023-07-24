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
                int windowWidth = getWidth();
                int windowHeight = getHeight();

                int rectangleWidth = 800;
                int rectangleHeight = 300;

                int x = (windowWidth - rectangleWidth) / 2;
                int y = (windowHeight - rectangleHeight) / 2;

                // Set the color of the rectangle
                g.setColor(Color.BLUE);

                // Draw a rectangle at the calculated coordinates
                g.fillRect(x, y, rectangleWidth, rectangleHeight);
            }
        };

        // Add the custom JPanel to the JFrame
        frame.add(panel);

        frame.setVisible(true);
    }
}
