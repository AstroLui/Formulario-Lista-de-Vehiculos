package Objetos.Components;

import Formulario.BuildShowRegister;
import Objetos.Joy.ColorRenderer;
import Objetos.Joy.JoyComponents;
import Objetos.Joy.VehiculoTableModel;
import Objetos.Keys.Car;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Table extends JTable implements JoyComponents, MouseListener
{
    private VehiculoTableModel model;
    private JScrollPane scroll;
    private int clicks = 0;

    
    public Table(int x, int y, int width, int height, String [] columns, Class[] columnsClass)
    {
        this.model = new VehiculoTableModel(columns, columnsClass);
        this.setModel(model);
        this.setDefaultRenderer(Color.class, new ColorRenderer());
        this.setFocusable(false);
        this.setFont(fontSansThin.myFont(2, 14f));
        this.getTableHeader().setReorderingAllowed(false);
        this.getTableHeader().setFont(fontSans.myFont(2, 15f));
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        var cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        this.setDefaultRenderer(String.class, cellRender);
        this.addMouseListener(this);
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

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        this.clicks++;
        var car = (Car) this.model.getList().get(this.getSelectedRow());
        var action = (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1 && this.clicks <= 2)? new BuildShowRegister(car, this.clicks) : null;
    }   
        
    @Override
    public void mousePressed(MouseEvent e){}

    @Override
    public void mouseReleased(MouseEvent e){}

    @Override
    public void mouseEntered(MouseEvent e){}

    @Override
    public void mouseExited(MouseEvent e){}
}
