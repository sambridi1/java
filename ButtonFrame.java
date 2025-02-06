// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;



// public class ButtonFrame extends JFrame{
//     private JButton button;
//     public static final int DEFAULT_WIDTH =300;
//     public static final int DEFAULT_HEIGHT = 200;

//     public ButtonFrame(){
//         setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

//         JButton yellowButton =new JButton(text:"Yellow");
//         JButton redButton = new JButton(text:"Blue");
//         JButton greenButton = new JButton(text:"Red");

//         buttonPanel = new JPanel();

//         buttonpanel.add(yellowButton);
//         buttonpanel.add(blueButton);
//         buttonpanel.add(redButton);


//         //create action button
//         ColorAction yellowAction =new ColorAction(Color.YELLOW);
//         ColorAction yellowAction =new ColorAction(Color.BLUE);
//         ColorAction yellowAction =new ColorAction(Color.RED);


//         //associate action with buttons
//         yellowButton.addActionListener(yellowAction);
//         blueButton.addActionListener(blueAction);
//         redButton.addActionListener(redAction);
        
//     }
//     private class ColorAction implements ActionListener{
//         private Color backgroundcolor;
//         public ColorAction(Color c){
//             backgroundColor =c;

//     }
//     public void actionPerformed(ActionEvent event){
//         buttonPanel.setBackground(backgroundColor);
//     }
//     }
    
// }
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonFrame extends JFrame {
    private JButton button;
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
    private JPanel buttonPanel;

    public ButtonFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        buttonPanel = new JPanel();

        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);

        // Create action buttons
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        // Associate actions with buttons
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);

        add(buttonPanel);
    }

    private class ColorAction implements ActionListener {
        private Color backgroundColor;

        public ColorAction(Color c) {
            backgroundColor = c;
        }

        public void actionPerformed(ActionEvent event) {
            buttonPanel.setBackground(backgroundColor);
        }
    }

    public static void main(String[] args) {
        ButtonFrame frame = new ButtonFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
