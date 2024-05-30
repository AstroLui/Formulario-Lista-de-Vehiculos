package Objetos.Components;
import Objetos.Joy.FunctionInterface;
import Objetos.Joy.JoyComponents;
import Objetos.Joy.TextPrompt;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        boolean isAlfa = (options.equals("Alfa"));
        boolean isTlf =  (options.equals("Tlf"));
        boolean isDni = (options.equals("Dni"));
        boolean isYear = (options.equals("Year"));
        boolean isMat = (options.equals("Mat"));
        boolean isPrecio = (options.equals("Pre"));
        boolean isDay = (options.equals("Day"));
        FunctionInterface tf = (isAlfa)?()->{ addFocusAlf(); }:(isTlf)? ()->{addFocusTlf(12);}:(isDni)?()->{addFocusNumLimit(8);}:(isYear)? ()->{addFocusNumLimit(4);}
                :(isMat)?()->{addFocusAlfNumLimit(7);}:(isPrecio)?()->{addFocusPre(7);}:(isDay)?()->{addFocusNumLimit(2);}:()->{addFocusNum();};
        tf.get();
        addError(options);
    }
    public Inputs(int x, int y, int width, int height, String options)
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
        boolean isAlfa = (options.equals("Alfa"));
        boolean isTlf =  (options.equals("Tlf"));
        boolean isDni = (options.equals("Dni"));
        boolean isYear = (options.equals("Year"));
        boolean isMat = (options.equals("Mat"));
        boolean isPrecio = (options.equals("Pre"));
        boolean isDay = (options.equals("Day"));
        FunctionInterface tf = (isAlfa)?()->{ addFocusAlf(); }:(isTlf)? ()->{addFocusTlf(12);}:(isDni)?()->{addFocusNumLimit(8);}:(isYear)? ()->{addFocusNumLimit(4);}
                :(isMat)?()->{addFocusAlfNumLimit(7);}:(isPrecio)?()->{addFocusPre(7);}:(isDay)?()->{addFocusNumLimit(2);}:()->{addFocusNum();};
        tf.get();
        addError(options);
    }
        
    public void addPlaceHolder(String Txt)
    {
       placeHolder = new TextPrompt(Txt, this);
       placeHolder.setFont(fontSansThin.myFont(3, 14f));
       placeHolder.setForeground(Color.gray);      
    }
    
    private void addError(String options)
    {
        var input = (JTextField) this;
        var sep = (JSeparator) this.separador;
        this.addFocusListener(new FocusAdapter()
        {
            public void focusGained(FocusEvent e)
            {
                sep.setForeground(Color.gray);
            }
            public void focusLost(FocusEvent e)
            {
                boolean isTlf =  (options.equals("Tlf"));
                boolean isPrecio = (options.equals("Pre"));
                boolean isEmpty = (input.getText().isEmpty());
                FunctionInterface tf = (isEmpty)?()->{ sep.setForeground(Color.RED);}:(isTlf)? ()->{isValidation(Inputs.REGEX_TLF); } : (isPrecio)? ()->{isValidation(Inputs.REGEX_PRE);}:()->{};
                tf.get();
            }
        });
    }
    private void isValidation(Pattern pattern)
    {
        Matcher matcher = pattern.matcher(this.getText());
        FunctionInterface tf = (!matcher.matches())? ()->{ this.separador.setForeground(Color.RED); } :()->{};
        tf.get();
    }
    
    private void addFocusAlf()
    {
        this.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char character = (char) e.getKeyChar();
                boolean auxCharacter = ((character < 'a' || character > 'z') && (character < 'A' || character>'Z'))? true: false;
                FunctionInterface tf =
                        (auxCharacter)?()-> { e.consume(); }:()->{};
                tf.get();
            }
        });
    }
    private void addFocusNum()
    {
        this.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char character = (char) e.getKeyChar();
                boolean auxCharacter = ((character < '0' || character > '9') )? true: false;
                FunctionInterface tf =(auxCharacter)?()->{ e.consume(); }:()->{};
                tf.get();
            }
            
        });
    }
    private void addFocusNumLimit(int n)
    {
        var input = (JTextField) this;
        this.addKeyListener(new KeyAdapter()
        {
            int maxLength = n;
            public void keyTyped(KeyEvent e)
            {
                char character = (char) e.getKeyChar();
                boolean lengthCharacter = ( input.getText().length() >= maxLength) ? true:false;
                boolean auxCharacter = ((character < '0' || character > '9') )? true: false;
                FunctionInterface tf = (auxCharacter || lengthCharacter) ?()->{ e.consume(); }:()->{};
                tf.get();
            }
        });
    }
    private void addFocusTlf(int n)
    {
        var label = (JTextField) this;
        this.addKeyListener(new KeyAdapter()
        {
            int maxLength = n;
            public void keyTyped(KeyEvent e)
            {
                char character = (char) e.getKeyChar();
                boolean lengthCharacter = ( label.getText().length() >= maxLength) ? true:false;
                boolean auxCharacter = ((character < '0' || character > '9') && (character !='-'))? true: false;
                FunctionInterface tf = (auxCharacter || lengthCharacter) ?()->{ e.consume(); }:()->{};
                tf.get();
            }
        });
    }
    private void addFocusPre(int n)
    {
        var label = (JTextField) this;
        this.addKeyListener(new KeyAdapter()
        {
            int maxLength = n;
            public void keyTyped(KeyEvent e)
            {
                char character = (char) e.getKeyChar();
                boolean lengthCharacter = ( label.getText().length() >= maxLength) ? true:false;
                boolean auxCharacter = ((character < '0' || character > '9') && (character!='.'))? true: false;
                FunctionInterface tf = (auxCharacter || lengthCharacter) ?()->{ e.consume(); }:()->{};
                tf.get();
            }
        });
    }
    private void addFocusAlfNumLimit(int n)
    {
        var label = (JTextField) this;
        this.addKeyListener(new KeyAdapter()
        {
            int maxLength = n;
            public void keyTyped(KeyEvent e)
            {
                char character = (char) e.getKeyChar();
                boolean lengthCharacter = ( label.getText().length() >= maxLength) ? true:false;
                FunctionInterface tf = (lengthCharacter) ?()->{ e.consume(); }:()->{};
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
