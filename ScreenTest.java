import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ScreenTest {
    public static void main(String[] args) {
        // यह लाइन विंडोज़ पर एक नई स्क्रीन/विंडो पॉप-अप करती है
        JFrame window = new JFrame("Meri Game Window");
        window.setSize(600, 400);
        window.getContentPane().setBackground(Color.DARK_GRAY);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        // विंडो के अंदर बड़ा टेक्स्ट
        JLabel text = new JLabel("Bhai, yeh terminal nahi hai! Screen chal gayi.");
        text.setFont(new Font("Arial", Font.BOLD, 18));
        text.setForeground(Color.GREEN);
        text.setHorizontalAlignment(JLabel.CENTER);

        window.add(text);
        window.setVisible(true); // स्क्रीन को आँखों के सामने लाना
    }
}