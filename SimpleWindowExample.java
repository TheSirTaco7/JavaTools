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
                drawCircle(g);
                this.setBackground(new Color(75, 145, 13));
            }

            private void drawRectangle(Graphics g) {
                int windowWidth = getWidth();
                int windowHeight = getHeight();

                // Calculate the size of the rectangle based on percentages (96% of width, 96% of height)
                int rectangleWidth = (int) (windowWidth * 0.96);
                int rectangleHeight = (int) (windowHeight * 0.96);

                int x = (windowWidth - rectangleWidth) / 2;
                int y = (windowHeight - rectangleHeight) / 2;

                // Set the color of the rectangle
                g.setColor(new Color(111, 94, 255));

                // Draw the rectangle at the calculated coordinates
                g.fillRect(x, y, rectangleWidth, rectangleHeight);
            }

            
            private void drawCircle(Graphics g) {
                int windowWidth = getWidth();
                int windowHeight = getHeight();

                int circleDiameter = (int) (windowHeight * 0.1);

                int x = (windowWidth - circleDiameter) / 2;
                int y = (windowHeight - circleDiameter) / 2;

                // Set the color of the circle
                g.setColor(new Color(227, 76, 16));

                // Draw a circle at the calculated coordinates
                g.fillOval(x, y, circleDiameter, circleDiameter);
            }
        };

        // Add the custom JPanel to the JFrame
        frame.add(panel);

        frame.setVisible(true);
    }
}
