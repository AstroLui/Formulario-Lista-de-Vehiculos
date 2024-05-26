package Objetos.Joy;

import java.awt.Color;
import javax.swing.JComponent;

public interface JoyComponents {
    final CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
    final Color bgColor = new Color(224,224,224);
    public abstract JComponent get();
}
