import javax.swing.*;
import java.awt.*;

public class ImageTest {
    class ImageComponent extends JComponent {
        public static final int DEFAULT_HEIGHT = 400;
        public static final int DEFAULT_WIDTH = 400;
        private Image image;

        public ImageComponent() {
            image = new ImageIcon("blue-ball.gif").getImage();
        }

        public void paintComponent(Graphics g) {    
            super.paintComponent(g);  // Make sure the base class is also painted.
            if (image == null) return;

            int imageWidth = image.getWidth(this);
            int imageHeight = image.getHeight(this);

            // Tile the image across the component
            for (int i = 0; i * imageWidth <= getWidth(); i++) {
                for (int j = 0; j * imageHeight <= getHeight(); j++) {
                    g.drawImage(image, i * imageWidth, j * imageHeight, this);
                }
            }
        }

        public Dimension getPreferredSize() {
            return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Test");
        ImageComponent component = new ImageTest().new ImageComponent();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(component);
        frame.pack();
        frame.setVisible(true);
    }
}
