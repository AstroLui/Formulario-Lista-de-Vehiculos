package Objetos.Components;
import Objetos.Joy.JoyComponents;
import javax.swing.JComponent;
import javax.swing.JTextField;
public class Inputs extends JTextField implements JoyComponents {
    
    public Inputs(String placeholder, int x, int y, int width, int height){
        
        this.setText(placeholder);
        this.setFont(fontSans.myFont(1, 13f));
        this.setBounds(x, y, width, height);
        
    }
    
    @Override
    public JComponent get(){
        return this;
    }
    
}
