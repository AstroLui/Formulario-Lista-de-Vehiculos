package Objetos.Joy;

import Objetos.Keys.Car;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VehiculoTableModel extends AbstractTableModel
{
    private List <Car> carList = new ArrayList<>();
    private String[] columnNames;
    private Class[] columnClass;
    public VehiculoTableModel(String [] columnNames, Class[] columnClass)
    {
        this.columnNames = columnNames;
        this.columnClass = columnClass;
    };
    public VehiculoTableModel(List <Car> carList)
    {
        this.carList = carList;
    };
    public VehiculoTableModel(String [] columnNames, Class[] columnClass, List <Car> carList)
    {
        this.carList = carList;
        this.columnNames = columnNames;
        this.columnClass = columnClass;
    };
    
    @Override
    public String getColumnName(int column)
    {
        return this.columnNames [column];
    }
    @Override
    public Class<?> getColumnClass(int column)
    {
        return this.columnClass [column];
    }
    @Override
    public int getRowCount() 
    {
        return this.carList.size();
    }

    @Override
    public int getColumnCount() 
    {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return null;
    }
    
}