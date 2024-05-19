package Formulario;
import Objetos.Components.Table;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class BuildTable extends JFrame
{
    private Container c;
    public BuildTable()
    {
       super("Lista de Vehiculos");
       this.setSize(720, 500);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c = this.getContentPane();
       
       c.setLayout(null);
       
       String [] columns = new String [] {"Nombre", "Apellido", "Cedula", "Modelo", "Marca", "Placa", "Color"};
       Class [] columnsClass = new Class [] {String.class, String.class, String.class, String.class, String.class, String.class, Color.class};
       Table table = new Table(25, 15, 655, 350, columns, columnsClass);
       c.add(table.getTable());
    }
}
