package Formulario;
import Objetos.Components.Button;
import Objetos.Components.Label;
import Objetos.Components.Table;
import Objetos.Keys.Car;
import Objetos.Keys.People;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_SELECTION;
import javax.swing.JFrame;

public class BuildViewMain extends JFrame
{
    private Container c;
    private final Label title; 
    private final Button btnAgregar;
    private final Table table;
    public BuildViewMain() throws MalformedURLException
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
       
       var file = new JFileChooser();
       file.showDialog(null, APPROVE_SELECTION);
       var p = new People("Isidoro", "Navarro", "30292216", "0412-8968401", "Los Santos");
       var c = new Car("Toyota", "Supra", "AB345BC", LocalDate.of(2004, 04, 04), Color.RED, file.getSelectedFile().toURL(), "En Venta");
       c.asignOwn(p);
       table.getModel().Add(c);
       
       btnAgregar = new Button("Agregar Registro", 25, 420, 170,30);
       btnAgregar.get().addActionListener((ActionEvent e) -> {
           BuildFormulario form = new BuildFormulario();
           form.addItemsDefault(this.table);
           form.setVisible(true);
       });
       this.c.add(btnAgregar);

    }
}
