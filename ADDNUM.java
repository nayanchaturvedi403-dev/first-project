import javax.swing.JOptionPane;

public class ADDNUM {
    public static int Nayan(int a, int b, int c) {
        return a+b+c;
    }
public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "ENTER YOUR NUMBER");
    int a = Integer.parseInt(JOptionPane.showInputDialog ( "first number"));
    int b = Integer.parseInt(JOptionPane.showInputDialog ( "Second number"));
    int c = Integer.parseInt(JOptionPane.showInputDialog ( "Third number"));
    int result = Nayan(a,b,c);
    JOptionPane.showMessageDialog(null, "RESULT Is: " + result);

}   
    

}