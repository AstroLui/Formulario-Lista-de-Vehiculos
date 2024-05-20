package Objetos.Components;

import Objetos.Joy.CustomFont;
import javax.swing.JLabel;

public class Label extends JLabel{
    private final CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
    public Label(String lblName, int x, int y, int width, int height)
    {
        this.setText(lblName);
        this.setFont(fontSans.myFont(0, 14f));
        this.setBounds(x, y, width, height);
    }
    
    public JLabel getLabel()
    {
        return this;
    }
}
