import java.awt.*;  
import java.awt.event.*;  
public class mouseclick extends Frame implements MouseListener{  
    Label l;  
    mouseclick(){  
        addMouseListener(this);  
         
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        setBackground(Color.yellow);  
    }  
    public void mouseEntered(MouseEvent e) {  
        setBackground(Color.green);  
    }  
    public void mouseExited(MouseEvent e) {  
        setBackground(Color.pink);  
    }  
    public void mousePressed(MouseEvent e) {  
        setBackground(Color.red);    
    }  
    public void mouseReleased(MouseEvent e) {  
        setBackground(Color.blue);  
    }  
public static void main(String[] args) {  
    new mouseclick();  
}  
}  
