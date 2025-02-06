import javax.swing.;
import java.awt.;

public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new SizedFrame();
            frame.setTitle("Sized Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class SizedFrame extends JFrame {
    public SizedFrame() {

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        Image image = new ImageIcon("icon.gif").getImage();
        setIconImage(image);

    }
}