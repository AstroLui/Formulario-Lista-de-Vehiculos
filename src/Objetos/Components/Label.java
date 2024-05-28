package Objetos.Components;

import Objetos.Joy.JoyComponents;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Label extends JLabel implements JoyComponents{
    public Label(){}
    
    public Label(String lblName, int x, int y, int width, int height)
    {
        this.setText(lblName);
        this.setFont(fontSans.myFont(0, 14f));
        this.setBounds(x, y, width, height);
    }
    
    public Label(String lblName, int x, int y, int width, int height, String font)
    {
        this.setText(lblName);
        this.setFont(fontSansThin.myFont(0, 14f));
        this.setBounds(x, y, width, height);
    }
    
    public Label(String lblName, int x, int y, int width, int height, int style, float size)
    {
        this.setText(lblName);
        this.setFont(fontSans.myFont(style, size));
        this.setBounds(x, y, width, height);
    }
    
    public Label(String lblName, int x, int y, int width, int height, int style, float size, String font)
    {
        this.setText(lblName);
        this.setFont(fontSansThin.myFont(style, size));
        this.setBounds(x, y, width, height);
    }
    @Override
    public JComponent get() 
    {
        return this;
    }
}
