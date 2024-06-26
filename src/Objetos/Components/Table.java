package Objetos.Components;

import Formulario.BuildShowRegister;
import Objetos.Joy.ColorRenderer;
import Objetos.Joy.JoyComponents;
import Objetos.Joy.LabelRenderer;
import Objetos.Joy.VehiculoTableModel;
import Objetos.Keys.Car;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Table extends JTable implements JoyComponents, MouseListener
{
    private final VehiculoTableModel model;
    private final JScrollPane scroll;
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
        this.getTableHeader().setResizingAllowed(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        var cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        this.setDefaultRenderer(String.class, cellRender);
        this.setDefaultRenderer(Label.class, new LabelRenderer());
        this.addMouseListener(this);
        this.scroll = new JScrollPane(this);
        this.scroll.setBounds(x, y, width, height);
    }
    public void setClick(int click)
    {
        this.clicks = click;
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
        try {
            var action = (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1 && this.clicks <= 2)? new BuildShowRegister(car, this) : null;
        } catch (IOException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        }
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
