import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;


public class SimpleWindowExample {

    private static int circleX = 280;
    private static int circleY = 180;
    private static final int circleDiameter = 60;
    private static HashSet<Integer> pressedKeys = new HashSet<>();
    private static JPanel panel;
    private static BufferedImage circleImage;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowWindow());

        int delay = 30; // milliseconds
        ActionListener taskPerformer = e -> moveCircle();
        new Timer(delay, taskPerformer).start();
    }

    private static void createAndShowWindow() {
        JFrame frame = new JFrame("SAMMMMMMMM Slide");
        frame.setSize(1200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        try {
             circleImage = ImageIO.read(new File("SAMMMMMMMMMMMMMMMMMM.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a custom JPanel where we will draw the rectangle
        panel = new JPanel() {
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
                
                int imagecorrection = 2;
                int newWidth = (int) (circleDiameter * imagecorrection * 1.4);
                int newHeight = (int) (circleDiameter * imagecorrection * 1);
            
                // Draw the image at the specified position with the new width and height
                g.drawImage(circleImage, circleX, circleY, newWidth, newHeight, null);
            }
            
        };

        // Add the custom JPanel to the JFrame
        frame.add(panel);

        // Add keyboard event listeners to the JPanel
        panel.setFocusable(true);
        panel.requestFocusInWindow();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Add the pressed key to the set
                pressedKeys.add(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Remove the released key from the set
                pressedKeys.remove(e.getKeyCode());
            }
        });

        frame.setVisible(true);
    }

    private static void moveCircle() {
        int step = 10; // How much the circle moves with each timer tick
    
        if (pressedKeys.contains(KeyEvent.VK_LEFT)) {
            // Check if moving left will keep the circle inside the rectangle
            if (circleX - step >= (panel.getWidth() - panel.getWidth() * 0.96) / 2) {
                circleX -= step;
            }
        }
        if (pressedKeys.contains(KeyEvent.VK_RIGHT)) {
            // Check if moving right will keep the circle inside the rectangle
            if (circleX + step <= (panel.getWidth() + panel.getWidth() * 0.96) / 2 - circleDiameter) {
                circleX += step;
            }
        }
        if (pressedKeys.contains(KeyEvent.VK_UP)) {
            // Check if moving up will keep the circle inside the rectangle
            if (circleY - step >= (panel.getHeight() - panel.getHeight() * 0.96) / 2) {
                circleY -= step;
            }
        }
        if (pressedKeys.contains(KeyEvent.VK_DOWN)) {
            // Check if moving down will keep the circle inside the rectangle
            if (circleY + step <= (panel.getHeight() + panel.getHeight() * 0.96) / 2 - circleDiameter) {
                circleY += step;
            }
        }
    
        // Repaint the panel to update the circle's position
        panel.repaint();
    }
    
}
