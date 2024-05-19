package Objetos;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table
{
    private JTable table;
    private DefaultTableModel model = new DefaultTableModel();
    private JScrollPane scroll;
    
    public Table(int x, int y, int width, int height, String [] columns)
    {
        for( String column : columns)
        {
            this.model.addColumn(column);
        }
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
