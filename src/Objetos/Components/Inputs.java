package Objetos.Components;
import Objetos.Joy.FunctionInterface;
import Objetos.Joy.JoyComponents;
import Objetos.Joy.TextPrompt;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
public class Inputs extends JTextField implements JoyComponents {
    
    private TextPrompt placeHolder;
    private JSeparator separador = new JSeparator();
    private Color bg = new Color(238, 238,238);
    private Label txtError; 
    
    public Inputs(){}
    
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
    public Inputs(String placeholder, int x, int y, int width, int height, String options)
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
        boolean option = (options.equals("Alfa"))? true:false;
        boolean option2 = (options.equals("Tlf"))? true:false;
        FunctionInterface tf = (option)?()->{ addFocusAlf(); }:()->{addFocusNum();};
        tf.get();
        FunctionInterface tf2 = (option2)?()->{ addFocusTlf(this.getText()); }:()->{};
        tf2.get();
    }
    public Inputs( int x, int y, int width, int height, String options)
    {
 
        this.setFont(fontSans.myFont(1, 14f));
        this.setBackground(bg);
        this.setBorder(null);
        this.setBounds(x, y, width, height);
        this.separador.setBounds(x-5, y+20, width+5, 2);
        this.separador.setForeground(Color.gray);
        this.txtError = new Label("Text", x-5, y+20, width, height);
        this.txtError.get().setFont(fontSansThin.myFont(1, 10f));
        this.txtError.setForeground(Color.RED);
        boolean option = (options.equals("Alfa"))? true: false;
        FunctionInterface tf = (option)?()->{ addFocusAlf(); }:()->{addFocusNum();};
    }
        
    public void addPlaceHolder(String Txt)
    {
       placeHolder = new TextPrompt(Txt, this);
       placeHolder.setFont(fontSansThin.myFont(3, 14f));
       placeHolder.setForeground(Color.gray);      
    }
    
    public void addFocusAlf()
    {
        this.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char character = (char) e.getKeyChar();
                boolean auxCharacter = ((character < 'a' || character > 'z') && (character < 'A' || character>'Z'))? true: false;
                FunctionInterface tf =
                        (auxCharacter)
                            ?()->
                            {
                               e.consume();
                            }:()->{};
                tf.get();
            }
            
        });
    }
    public void addFocusNum()
    {
        this.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char character = (char) e.getKeyChar();
                boolean auxCharacter = ((character < '0' || character > '9') )? true: false;
                FunctionInterface tf =
                        (auxCharacter)
                            ?()->
                            {
                               e.consume();
                            }:()->{};
                tf.get();
            }
            
        });
    }
    public void addFocusTlf(String texto)
    {
        this.addKeyListener(new KeyAdapter()
        {
            int maxLength = 10;
            public void keyTyped(KeyEvent e)
            {
                char character = (char) e.getKeyChar();
                boolean lengthCharacter = (texto.length() >= maxLength) ? true:false;
                boolean auxCharacter = ((character < '0' || character > '9') )? true: false;
                FunctionInterface tf =
                        (auxCharacter || lengthCharacter)
                            ?()->
                            {
                               e.consume();
                            }:()->{};
                tf.get();
            }
            
        });
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
