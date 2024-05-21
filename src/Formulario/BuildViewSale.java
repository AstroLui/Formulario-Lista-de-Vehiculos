package Formulario;

import java.awt.Container;
import javax.swing.JFrame;

public class BuildViewSale extends JFrame {
    private Container c;
    
    public BuildViewSale()
    {
        super("Alquier y Venta");
        this.setSize(400, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        c = this.getContentPane();
    }
}
