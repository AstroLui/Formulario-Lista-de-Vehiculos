package Objetos.Components;

import Objetos.Joy.CustomFont;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class Button extends JButton{
    
    private final CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
    private final Color btnColor = new Color(224,224,224);
    public Button(String btnName, int x, int y, int width, int height)
    {
        this.setText(btnName);
        this.setBackground(btnColor);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setFocusable(false);
        this.setFont(fontSans.myFont(1, 12f));
        this.setBounds(x, y, width, height);
    }
    
    public JButton getBtn()
    {
        return this;
    }
    
}
