package Objetos.Components;

import Objetos.Joy.ColorRenderer;
import Objetos.Joy.CustomFont;
import Objetos.Joy.JoyComponents;
import Objetos.Joy.VehiculoTableModel;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Table extends JTable implements JoyComponents
{
    private VehiculoTableModel model;
    private JScrollPane scroll;
    private final CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
    
    public Table(int x, int y, int width, int height, String [] columns, Class[] columnsClass)
    {
        this.model = new VehiculoTableModel(columns, columnsClass);
        this.setModel(model);
        this.setFocusable(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setDefaultRenderer(Color.class, new ColorRenderer());
        this.getTableHeader().setReorderingAllowed(false);
        this.getTableHeader().setFont(fontSans.myFont(2, 15f));
        var cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        this.setDefaultRenderer(String.class, cellRender);
        this.scroll = new JScrollPane(this);
        this.scroll.setBounds(x, y, width, height);
    }
    
    @Override
    public VehiculoTableModel getModel()
    {
        return this.model;
    }
    @Override
    public JComponent get() {
        return this.scroll;
    }
}
