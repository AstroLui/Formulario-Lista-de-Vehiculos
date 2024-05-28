package Objetos.Components;
import Objetos.Joy.JoyComponents;
import Objetos.Joy.TextPrompt;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
public class Inputs extends JTextField implements JoyComponents {
    
    private TextPrompt placeHolder;
    private JSeparator separador = new JSeparator();
    private Color bg = new Color(238, 238,238);
    private Label txtError; 
    public Inputs(String placeholder, int x, int y, int width, int height)
    {
        placeHolder = new TextPrompt(placeholder, this);
        placeHolder.setFont(fontSansThin.myFont(3, 14f));
        placeHolder.setForeground(Color.gray);
        this.setFont(fontSans.myFont(1, 14f));
        this.setBackground(bg);
        this.setBorder(null);
        this.setBounds(x, y, width, height);
        this.separador.setBounds(x-5, y+20, width+5, 2);
        this.separador.setForeground(Color.gray);
        this.txtError = new Label("Text", x-5, y+20, width, height);
        this.txtError.get().setFont(fontSansThin.myFont(1, 10f));
        this.txtError.setForeground(Color.RED);
    }
    
    @Override
    public JComponent get(){
        return this;
    }
    
    public JSeparator getS()
    {
        return this.separador;
    }
    
    public JLabel getTxtError()
    {
        return (JLabel) this.txtError.get();
    }   
}
