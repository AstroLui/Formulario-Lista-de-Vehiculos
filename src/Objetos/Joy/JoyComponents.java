package Objetos.Joy;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JComponent;

public interface JoyComponents {
    final CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
    final CustomFont fontSansThin = new CustomFont("Archivo-Thin.ttf");
    final Color bgColor = new Color(224,224,224);
    
    static Pattern REGEX_TLF = Pattern.compile("^\\d{3,4}-\\d{7}$");
    static Pattern REGEX_PRE = Pattern.compile("^\\d{1,4}[.]\\d{1,2}$");
    public abstract JComponent get();
}
