package Formulario;
import Objetos.Components.Table;
import Objetos.Joy.CustomFont;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BuildTable extends JFrame
{
    private Container c;
    private final JLabel title; 
    private JButton btnAgregar;
    public BuildTable()
    {
       super("Lista de Vehiculos");
       this.setSize(720, 500);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c = this.getContentPane();
       
       c.setLayout(null);
       CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
       
       title = new JLabel("Lista de Vehiculos");
       title.setFont(fontSans.myFont(1, 25f));
       title.setBounds(15, 5, 250, 50);
       c.add(title);
       
       String [] columns = new String [] {"Dueño", "Modelo", "Marca", "Placa", "Color"};
       Class [] columnsClass = new Class [] {String.class, String.class, String.class, String.class, Color.class};
       Table table = new Table(25, 60, 655, 350, columns, columnsClass);
       c.add(table.getTable());
       
       btnAgregar = new JButton("Agregar Registro");
       btnAgregar.setFont(fontSans.myFont(0, 15f));
       btnAgregar.setBounds(25, 420, 180, 25);
       btnAgregar.addActionListener((ActionEvent e) -> {
           BuildFormulario Form = new BuildFormulario();
           Form.setVisible(true);
       });
       c.add(btnAgregar);
    }
}
