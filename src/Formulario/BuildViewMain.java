package Formulario;
import Objetos.Components.Button;
import Objetos.Components.Label;
import Objetos.Components.Table;
import Objetos.Joy.CustomFont;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class BuildViewMain extends JFrame
{
    private Container c;
    private final Label title; 
    private Button btnAgregar;
    public BuildViewMain()
    {
       super("Lista de Vehiculos");
       this.setSize(720, 500);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c = this.getContentPane();
       
       c.setLayout(null);
       CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
       
       title = new Label("Lista de Vehiculos", 15, 5, 250, 50);
       title.getLabel().setFont(fontSans.myFont(1, 25f));
       c.add(title.getLabel());
       
       String [] columns = new String [] {"Dueño", "Modelo", "Marca", "Placa", "Color"};
       Class [] columnsClass = new Class [] {String.class, String.class, String.class, String.class, Color.class};
       Table table = new Table(25, 60, 655, 350, columns, columnsClass);
       c.add(table.getTable());
       
       btnAgregar = new Button("Agregar Registror", 25, 420, 170,30);
       btnAgregar.getBtn().addActionListener((ActionEvent e) -> {
           BuildFormulario Form = new BuildFormulario();
           Form.setVisible(true);
       });
       c.add(btnAgregar.getBtn());
    }
}
