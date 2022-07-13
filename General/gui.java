import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args){
String a=JOptionPane.showInputDialog("What is your name");
JOptionPane.showMessageDialog(null, "To kaise hain aap "+a);

int b=Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
JOptionPane.showMessageDialog(null, "Aap ki age hai "+b);
    }
    
}
