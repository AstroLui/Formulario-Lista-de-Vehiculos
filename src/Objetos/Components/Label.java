package Objetos.Components;

import Objetos.Joy.CustomFont;
import Objetos.Joy.JoyComponents;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Label extends JLabel implements JoyComponents{
    private final CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
    public Label(String lblName, int x, int y, int width, int height)
    {
        this.setText(lblName);
        this.setFont(fontSans.myFont(0, 14f));
        this.setBounds(x, y, width, height);
    }

    @Override
    public JComponent get() 
    {
        return this;
    }
}
