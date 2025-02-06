import javax.swing.;  
import java.awt.;     

public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");  
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);  
        });
    }
}

class NotHelloWorldFrame extends JFrame {
    public NotHelloWorldFrame() {
        add(new NotHelloWorldComponent());
        pack();
    }
}

class NotHelloWorldComponent extends JComponent {
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics 2D) g;
        super.paintComponent(g);  
        Font sansbold14 = new Font ("SansSerif".Font.BOLD,14);
        g2.setFont(sansbold14);
        g.drawString("Not a Hello, wor
        
        ld program", MESSAGE_X, MESSAGE_Y);  
    }

    @Override
    public Dimension getPreferredSize() {  
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);  
    }
}