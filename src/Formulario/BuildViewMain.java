package Formulario;
import Objetos.Components.Button;
import Objetos.Components.Label;
import Objetos.Components.Table;
import Objetos.Keys.Car;
import Objetos.Keys.People;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import javax.swing.JFrame;

public class BuildViewMain extends JFrame
{
    private Container c;
    private final Label title; 
    private final Button btnAgregar;
    private final Table table;
    public BuildViewMain()
    {
       super("Lista de Vehiculos");
       this.setSize(800, 500);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c = this.getContentPane();
       
       c.setLayout(null);
      
       title = new Label("Lista de Vehiculos", 15, 5, 250, 50, 1, 25f);
       c.add(title.get());
       
       String [] columns = new String [] {"Dueño", "Modelo", "Marca", "Placa", "Color", "Estado", "Precio Total"};
       Class [] columnsClass = new Class [] {String.class, String.class, String.class, String.class, Color.class, Label.class, String.class};
       table = new Table(25, 60, 735, 350, columns, columnsClass);
       c.add(table.get());
       
       LocalDate fecha = LocalDate.of(2004, 4, 4);
       People persona = new People("Luis", "Amias", "30.292.216", "0412-8968401", "Aragua");
       Car car = new Car("Toyota", "Supra", "123SAD", fecha, Color.GRAY, "En Venta");
       car.asignOwn(persona);
       table.getModel().Add(car);
       
       fecha = LocalDate.of(2005, 2, 4);
       People persona1 = new People("Luis", "Amias", "30.292.216", "0412-8968401", "Aragua");
       Car car1 = new Car("Toyota", "Supra", "123SAD", fecha, Color.BLUE, "En Venta");
       car1.asignOwn(persona1);
       table.getModel().Add(car1);
       
       People persona2 = new People("Luis", "Amias", "30.292.216", "0412-8968401", "Aragua");
       Car car2 = new Car( "Ford", "Ranger Raptor", "123SAD", fecha, Color.RED, "En Alquier", 30, 250.0);
       car2.asignOwn(persona2);
       table.getModel().Add(car2);
       
       btnAgregar = new Button("Agregar Registro", 25, 420, 170,30);
       btnAgregar.get().addActionListener((ActionEvent e) -> {
           BuildFormulario form = new BuildFormulario();
           form.addItemsDefault(this.table);
           form.setVisible(true);
       });
       c.add(btnAgregar);

    }
}
