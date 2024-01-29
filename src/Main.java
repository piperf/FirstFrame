import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //step 1, create a frame
        JFrame frame= new JFrame("My first frame!");
        frame.setSize(400,400);


        //step 2, create a panel
        JPanel panel= new JPanel();
        panel.setBackground(new Color(255, 151, 185));
        panel.setLayout(new GridBagLayout());

        //step 3, create components
        JLabel label= new JLabel("Helllloooo");
//        ImageIcon buttonicon= new ImageIcon("Images/MyCards/button.png");
        JButton button = new JButton("button moment");
        JTextField textField = new JTextField(5);
        JScrollBar scrolly = new JScrollBar();
        ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
        icon.setImage(icon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);
        GridBagConstraints gc= new GridBagConstraints();

        //step 4, add components to panel
        gc.gridx=1;
        gc.gridy=1;
        panel.add(label,gc);
        gc.gridx=2;
        gc.gridy=3;
        panel.add(button,gc);
        gc.gridx=2;
        gc.gridy=4;
        panel.add(textField,gc);
        gc.gridx=5;
        gc.gridy=7;
        panel.add(scrolly,gc);
        gc.gridx=1;
        gc.gridy=7;
        panel.add(picLabel,gc);
        //step 5, add panel to frame
        frame.add(panel);
        frame.setBackground(Color.magenta);
        //step 6, set frame visible
        frame.setVisible(true);

    }
}

