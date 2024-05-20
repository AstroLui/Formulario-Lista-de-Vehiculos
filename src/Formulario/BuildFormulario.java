package Formulario;

import java.awt.Container;
import javax.swing.JFrame;

public class BuildFormulario extends JFrame
{
    Container c;
    public BuildFormulario()
    {
        super("Formulario");
        this.setSize(400, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        c = this.getContentPane();
    }
}
