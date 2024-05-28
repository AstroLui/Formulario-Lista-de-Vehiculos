package Objetos.Components;

import Objetos.Joy.JoyComponents;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JComponent;

public class Combo extends JComboBox implements JoyComponents
{
    public Combo(String comboName, List <String> options)
    {
       this.setOpaque(true);
       this.setFont(fontSansThin.myFont(1, 12f));
       this.setBackground(bgColor);
       this.addItem(comboName);
       options.forEach((item) ->
       {
           this.addItem(item);
       });
    }
    public Combo(String comboName, List <String> options, int x, int y, int width, int height)
    {
       this.setFont(fontSansThin.myFont(1, 12f));
       this.setBackground(bgColor);
       this.setBounds(x, y, width, height);
       this.addItem(comboName);
       for (String option: options)
       {
           this.addItem(option);
       }
    }
    @Override
    public JComponent get() {
        return this;
    }
}
