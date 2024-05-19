package Objetos.Components;

import Objetos.Joy.VehiculoTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table
{
    private JTable table;
    private VehiculoTableModel model;
    private JScrollPane scroll;
    
    public Table(int x, int y, int width, int height, String [] columns, Class[] columnsClass)
    {

        this.model = new VehiculoTableModel(columns, columnsClass);
        this.table = new JTable(model);
        this.table.getTableHeader().setReorderingAllowed(false);
        this.scroll = new JScrollPane(this.table);
        this.scroll.setBounds(x, y, width, height);
    }
    
    public JScrollPane getTable()
    {
        return this.scroll;
    }
}
