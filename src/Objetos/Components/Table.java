package Objetos.Components;

import Objetos.Joy.CustomFont;
import Objetos.Joy.JoyComponents;
import Objetos.Joy.VehiculoTableModel;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table extends JTable implements JoyComponents
{
    private VehiculoTableModel model;
    private JScrollPane scroll;
    private final CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
    
    public Table(int x, int y, int width, int height, String [] columns, Class[] columnsClass)
    {
        this.model = new VehiculoTableModel(columns, columnsClass);
        this.setModel(model);
        this.getTableHeader().setReorderingAllowed(false);
        this.getTableHeader().setFont(fontSans.myFont(2, 15f));
        this.scroll = new JScrollPane(this);
        this.scroll.setBounds(x, y, width, height);
    }
    
    @Override
    public JComponent get() {
        return this.scroll;
    }
}
