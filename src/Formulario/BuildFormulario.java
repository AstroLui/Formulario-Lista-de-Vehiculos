package Formulario;

import Objetos.Components.Button;
import Objetos.Components.Combo;
import Objetos.Components.Inputs;
import Objetos.Components.Label;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class BuildFormulario extends JFrame
{
    Container c;
    private Button btnGuardar, btnEditar;
    private Label title, labelName, labelLastName, labelTlf, labelAddress, labelDni, labelIdCar, labelYear, labelColor, labelBrand, labelModel, labelImage;
    private Inputs name,lastName,tlf,address,dni,idCar, year;
    private Combo brand;
    private Combo model;
    List<String> options = new ArrayList<>();
    public BuildFormulario()
    {
        super("Formulario");
        this.setSize(400, 680);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        c = this.getContentPane();
        
        c.setLayout(null);
        this.options.add("Toyota");
        this.options.add("Ford");
        this.options.add("Mitsubishi");
        this.options.add("Honda");
        this.options.add("BMW");
    }
    
    public void addItemsDefault()
    {
        title = new Label("Registro de Vehículos", 15, 5, 300, 50, 1, 25f);
        c.add(title.get());
        
        labelName = new Label("Nombre", 15, 65, 125, 20, 1, 20f);
        c.add(labelName.get());
        
        name = new Inputs("Alfonso", 125, 65, 150, 20);
        c.add(name);
        
        labelLastName = new Label("Apellido",15,110,125,20, 1, 20f);
        c.add(labelLastName.get());
        
        lastName = new Inputs("Henrique", 125, 110, 150, 20);
        c.add(lastName);
        
        labelDni = new Label("Cédula", 15, 155, 125, 20, 1, 20f);
        c.add(labelDni.get());
        
        dni = new Inputs("29750712", 125, 155, 150, 20);
        c.add(dni);
        
        labelTlf = new Label("Teléfono", 15, 200, 125, 20, 1, 20f);
        c.add(labelTlf.get());
        
        tlf = new Inputs("0424-4632499", 125, 200, 150, 20);
        c.add(tlf);
        
        labelAddress = new Label("Dirección", 15, 245, 125, 20, 1, 20f);
        c.add(labelAddress.get());
        
        address = new Inputs("Valencia, Prebo", 125, 245, 150, 20);
        c.add(address);
        
        labelIdCar = new Label("Placa", 15, 290, 125, 20, 1, 20f);
        c.add(labelIdCar.get());
        
        idCar = new Inputs("AB123CD", 125, 290, 150, 20);
        c.add(idCar);
        
        labelYear = new Label("Año", 15, 335, 125, 20, 1, 20f);
        c.add(labelYear.get());
        
        year = new Inputs("2024", 125, 335, 150, 20);
        c.add(year);
        
        labelBrand = new Label("Marca", 15, 380, 125, 20, 1, 20f);
        c.add(labelBrand.get());
        
        brand = new Combo("Seleccionar Modelo",this.options, 125, 380, 150, 20);
        c.add(brand);
        
        labelModel = new Label("Modelo", 15, 425, 125, 20, 1, 20f);
        c.add(labelModel.get());
        
        labelColor = new Label("Color", 15, 470, 125, 20, 1, 20f);
        c.add(labelColor.get());
        
        labelImage = new Label("Imagen", 15, 515, 125, 20, 1, 20f);
        c.add(labelImage.get());
        
        btnGuardar = new Button("Guardar",100,580,180,30);
        c.add(btnGuardar);  
    }
    
    public void addItem(String Txtname, String TxtlastName, String Txtdni, String Txttlf, String Txtaddress,
            String TxtidCar, String TxtyearCar, String Txtbrand)
    {
        title = new Label("Registro de Vehículos", 15, 5, 300, 50, 1, 25f);
        c.add(title.get());
        
        labelName = new Label("Nombre", 15, 65, 125, 20, 1, 20f);
        c.add(labelName.get());
        
        name = new Inputs("Alfonso", 125, 65, 150, 20);
        name.setText(Txtname);
        c.add(name);
        
        labelLastName = new Label("Apellido",15,110,125,20, 1, 20f);
        c.add(labelLastName.get());
        
        lastName = new Inputs("Henrique", 125, 110, 150, 20);
        lastName.setText(TxtlastName);
        c.add(lastName);
        
        labelDni = new Label("Cédula", 15, 155, 125, 20, 1, 20f);
        c.add(labelDni.get());
        
        dni = new Inputs("29750712", 125, 155, 150, 20);
        dni.setText(Txtdni);
        c.add(dni);
        
        labelTlf = new Label("Teléfono", 15, 200, 125, 20, 1, 20f);
        c.add(labelTlf.get());
        
        tlf = new Inputs("0424-4632499", 125, 200, 150, 20);
        tlf.setText(Txttlf);
        c.add(tlf);
        
        labelAddress = new Label("Dirección", 15, 245, 125, 20, 1, 20f);
        c.add(labelAddress.get());
        
        address = new Inputs("Valencia, Prebo", 125, 245, 150, 20);
        address.setText(Txtaddress);
        c.add(address);
        
        labelIdCar = new Label("Placa", 15, 290, 125, 20, 1, 20f);
        c.add(labelIdCar.get());
        
        idCar = new Inputs("AB123CD", 125, 290, 150, 20);
        idCar.setText(TxtidCar);
        c.add(idCar);
        
        labelYear = new Label("Año", 15, 335, 125, 20, 1, 20f);
        c.add(labelYear.get());
        
        year = new Inputs("2024", 125, 335, 150, 20);
        year.setText(TxtyearCar);
        c.add(year);
        
        labelBrand = new Label("Marca", 15, 380, 125, 20, 1, 20f);
        c.add(labelBrand.get());
        
        brand = new Combo("Seleccionar Modelo",this.options, 125, 380, 150, 20);
        brand.setSelectedItem(Txtbrand);
        c.add(brand);
        
        labelModel = new Label("Modelo", 15, 425, 125, 20, 1, 20f);
        c.add(labelModel.get());
        
        labelColor = new Label("Color", 15, 470, 125, 20, 1, 20f);
        c.add(labelColor.get());
        
        labelImage = new Label("Imagen", 15, 515, 125, 20, 1, 20f);
        c.add(labelImage.get());
        
        btnEditar = new Button("Editar",100,580,180,30);
        c.add(btnEditar);  
    }
}
