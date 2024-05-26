package Formulario;

import java.awt.Container;
import javax.swing.JFrame;

public class BuildShowRegister extends JFrame{
    private Container c;
    public BuildShowRegister()
    {
        super("Mostrando Registro");
        this.setSize(400, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        c = this.getContentPane();
        
        this.setVisible(true);
    }
}
