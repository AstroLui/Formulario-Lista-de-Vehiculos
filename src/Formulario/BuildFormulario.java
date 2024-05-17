package Formulario;
import java.awt.Container;
import javax.swing.JFrame;

public class BuildFormulario extends JFrame
{
    private Container c;
    public BuildFormulario()
    {
       super("Lista de Vehiculos");
       this.setSize(400, 500);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c = this.getContentPane();
    }
}
