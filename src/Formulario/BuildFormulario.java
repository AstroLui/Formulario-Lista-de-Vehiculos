package Formulario;

import Objetos.Components.Button;
import Objetos.Components.Inputs;
import Objetos.Components.Label;
import Objetos.Components.Select;
import Objetos.Joy.CustomFont;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class BuildFormulario extends JFrame
{
    Container c;
    private Button btnGuardar;
    private Label title, labelName, labelLastName, labelTlf, labelAddress, labelDni, labelIdCar, labelYear, labelColor, labelBrand, labelModel, labelImage;
    private Inputs name,lastName,tlf,address,dni,idCar, year;
    private Select brand, model;
    ArrayList<String> options = new ArrayList<>();
    public BuildFormulario()
    {
        super("Formulario");
        this.setSize(400, 680);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        c = this.getContentPane();
        
        c.setLayout(null);
        CustomFont fontSans = new CustomFont("Archivo-VariableFont_wdth,wght.ttf");
        options.add("Toyota");
        options.add("Ford");
        options.add("Mitsubishi");
        options.add("Honda");
        options.add("BMW");
        
        title = new Label("Registro de Vehículos", 15, 5, 300, 50);
       title.get().setFont(fontSans.myFont(1, 25f));
       c.add(title.get());
        
        labelName = new Label("Nombre", 15, 65, 125, 20);
        labelName.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelName.get());
        
        name = new Inputs("Alfonso", 125, 65, 150, 20);
        c.add(name);
        
        labelLastName = new Label("Apellido",15,110,125,20);
        labelLastName.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelLastName.get());
        
        lastName = new Inputs("Henrique", 125, 110, 150, 20);
        c.add(lastName);
        
        labelDni = new Label("Cédula", 15, 155, 125, 20);
        labelDni.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelDni.get());
        
        dni = new Inputs("29750712", 125, 155, 150, 20);
        c.add(dni);
        
        labelTlf = new Label("Teléfono", 15, 200, 125, 20);
        labelTlf.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelTlf.get());
        
        tlf = new Inputs("0424-4632499", 125, 200, 150, 20);
        c.add(tlf);
        
        labelAddress = new Label("Dirección", 15, 245, 125, 20);
        labelAddress.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelAddress.get());
        
        address = new Inputs("Valencia, Prebo", 125, 245, 150, 20);
        c.add(address);
        
        labelIdCar = new Label("Placa", 15, 290, 125, 20);
        labelIdCar.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelIdCar.get());
        
        idCar = new Inputs("AB123CD", 125, 290, 150, 20);
        c.add(idCar);
        
        labelYear = new Label("Año", 15, 335, 125, 20);
        labelYear.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelYear.get());
        
        year = new Inputs("2024", 125, 335, 150, 20);
        c.add(year);
        
        labelBrand = new Label("Marca", 15, 380, 125, 20);
        labelBrand.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelBrand.get());
        
        brand = new Select(options, 125, 380, 125, 20);
        c.add(brand);
        
        labelModel = new Label("Modelo", 15, 425, 125, 20);
        labelModel.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelModel.get());
        
        labelColor = new Label("Color", 15, 470, 125, 20);
        labelColor.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelColor.get());
        
        labelImage = new Label("Imagen", 15, 515, 125, 20);
        labelImage.get().setFont(fontSans.myFont(1, 20f));
        c.add(labelImage.get());
        
        
        btnGuardar = new Button("Guardar",100,580,180,30);
        c.add(btnGuardar);
        
        
        
    }
}
