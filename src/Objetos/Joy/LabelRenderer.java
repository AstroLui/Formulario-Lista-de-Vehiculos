package Objetos.Joy;

import Objetos.Components.Label;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class LabelRenderer extends Label implements TableCellRenderer
{
    public LabelRenderer()
    {
        super();
        this.setOpaque(true);
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        String txt = (String) value;
        this.setText("       "+txt);
        this.setForeground(("En Venta".equals(txt))? new Color(190, 46,214): new Color(255,152,0));
        return this.get();
    }
    
}
