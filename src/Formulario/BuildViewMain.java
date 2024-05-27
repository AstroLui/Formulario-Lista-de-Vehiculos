package Formulario;
import Objetos.Components.Button;
import Objetos.Components.Label;
import Objetos.Components.Table;
import Objetos.Keys.Car;
import Objetos.Keys.People;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.JFrame;

public class BuildViewMain extends JFrame
{
    private Container c;
    private final Label title; 
    private final Button btnAgregar, btnSale;
    private final Table table;
    public BuildViewMain()
    {
       super("Lista de Vehiculos");
       this.setSize(720, 500);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c = this.getContentPane();
       
       c.setLayout(null);
      
       title = new Label("Lista de Vehiculos", 15, 5, 250, 50, 1, 25f);
       c.add(title.get());
       
       String [] columns = new String [] {"Dueño", "Modelo", "Marca", "Placa", "Color"};
       Class [] columnsClass = new Class [] {String.class, String.class, String.class, String.class, Color.class};
       table = new Table(25, 60, 655, 350, columns, columnsClass);
       c.add(table.get());
       
       People persona = new People("Luis", "Amias", "30.292.216", "0412-8968401", "Aragua");
       Car car = new Car(1, "Toyota", "Supra", "123SAD", new Date(14, 2, 2004), Color.GRAY);
       car.asignOwn(persona);
       table.getModel().Add(car);
       
       
       btnAgregar = new Button("Agregar Registror", 25, 420, 170,30);
       btnAgregar.get().addActionListener((ActionEvent e) -> {
           BuildFormulario form = new BuildFormulario();
           form.setVisible(true);
       });
       c.add(btnAgregar);
       
       btnSale = new Button("Alquier y Venta", 210, 420, 180, 30);
       btnSale.get().addActionListener((ActionEvent e) -> {
           BuildViewSale viewSale = new BuildViewSale();
           viewSale.setVisible(true);
       });
       c.add(btnSale);
    }
}
