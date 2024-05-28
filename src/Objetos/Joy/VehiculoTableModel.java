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
    private int forReasigned = 1;
    
    public VehiculoTableModel(String [] columnNames, Class[] columnClass)
    {
        this.columnNames = columnNames;
        this.columnClass = columnClass;
    }
    public VehiculoTableModel(List <Car> carList)
    {
        this.carList = carList;
        Reasing();
    }
    public VehiculoTableModel(String [] columnNames, Class[] columnClass, List <Car> carList)
    {
        this.carList = carList;
        this.columnNames = columnNames;
        this.columnClass = columnClass;
        Reasing();
    }
    
    public void Reasing()
    {
        carList.forEach((item) ->
        {
            item.setId(forReasigned);
            forReasigned++;
        });
        forReasigned = 1; 
    }
    
    public void Add(Car item)
    {
        this.fireTableRowsInserted(0, 0);
        carList.add(item);
        Reasing();
    }
    
    public void Delete(int index)
    {
        this.fireTableRowsDeleted(0, 0);
        carList.remove(index);
        Reasing();
    }
    public List getList()
    {
        return this.carList;
    }

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
        Car row = carList.get(rowIndex);
        return ((
           0 == columnIndex ? row.getOwn().getName() + " " + row.getOwn().getLastName() :
           1 == columnIndex ? row.getModel() :
           2 == columnIndex ? row.getBrand() :
           3 == columnIndex ? row.getLicensePlate() : 
           4 == columnIndex ? row.getColorCar() :  null
        ));
    }
    
}
