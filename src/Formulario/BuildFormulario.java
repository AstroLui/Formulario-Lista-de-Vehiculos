package Formulario;

import Objetos.Components.Button;
import Objetos.Components.Combo;
import Objetos.Components.Inputs;
import Objetos.Components.Label;
import Objetos.Components.Table;
import Objetos.Keys.Car;
import Objetos.Keys.People;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class BuildFormulario extends JFrame
{
    Container c;
    private Button btnGuardar, btnEditar, color;
    private Label title, labelName, labelLastName, labelTlf, labelAddress, labelDni, labelIdCar, labelYear, labelColor, labelBrand, labelModel, labelImage, colorLabel;
    private Inputs name,lastName,tlf,address,dni,idCar, year;
    private Combo brand;
    private Combo model;
    List<String> options = new ArrayList<>();
    
    private Table parentTable;
    public BuildFormulario()
    {
        super("Formulario");
        this.setSize(400, 680);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c = this.getContentPane();
        
        c.setLayout(null);
        this.options.add("Toyota");
        this.options.add("Ford");
        this.options.add("Mitsubishi");
        this.options.add("Honda");
        this.options.add("BMW");
    }
    
    public void addItemsDefault(Table table)
    {
        this.parentTable = table;
        title = new Label("Registro de Vehículos", 15, 5, 300, 50, 1, 25f);
        c.add(title.get());
        
        labelName = new Label("Nombre", 20, 85, 120, 20, 2, 18f);
        c.add(labelName.get());
        
<<<<<<< Updated upstream
        name = new Inputs("Alfonso", 125, 65, 150, 20);
        c.add(name); c.add(name.getS());
=======
        name = new Inputs("Alfonso", 20, 110, 130, 20);
        c.add(name);
>>>>>>> Stashed changes
        
        labelLastName = new Label("Apellido",180, 85, 120, 20, 2, 18f);
        c.add(labelLastName.get());
        
        lastName = new Inputs("Henrique", 180, 110, 130, 20);
        c.add(lastName);
        
        labelDni = new Label("Cédula", 20, 145, 120, 20, 2, 18f);
        c.add(labelDni.get());
        
        dni = new Inputs("29750712", 20, 165, 130, 20);
        c.add(dni);
        
        labelTlf = new Label("Teléfono", 180, 145, 125, 20, 2, 18f);
        c.add(labelTlf.get());
        
        tlf = new Inputs("0424-4632499", 180, 165, 130, 20);
        c.add(tlf);
        
        labelAddress = new Label("Dirección", 20, 205, 125, 20, 2, 18f);
        c.add(labelAddress.get());
        
        address = new Inputs("Valencia, Prebo", 20, 225, 130, 20);
        c.add(address);
        
        labelIdCar = new Label("Matricula", 180, 265, 125, 20, 2, 18f);
        c.add(labelIdCar.get());
        
        idCar = new Inputs("AB123CD", 180, 285, 130, 20);
        c.add(idCar);
        
        labelYear = new Label("Año", 20, 325, 125, 20, 2, 18f);
        c.add(labelYear.get());
        
        year = new Inputs("2024", 20, 345, 130, 20);
        c.add(year);
        
        labelBrand = new Label("Marca", 180, 205, 125, 20, 2, 18f);
        c.add(labelBrand.get());
        
        brand = new Combo("Seleccionar Marca",this.options, 180, 225, 130, 20);
        c.add(brand);
        
        labelModel = new Label("Modelo", 20, 265, 125, 20, 2, 18f);
        c.add(labelModel.get());
        
        model = new Combo("Seleccionar Modelo",this.options, 20, 285, 130, 20);
        c.add(model);
        
        labelColor = new Label("Color", 180, 325, 125, 20, 2, 18f);
        c.add(labelColor.get());
        
        color = new Button("Escoge un color", 180, 345, 130, 20);
        c.add(color);
        
        color.addActionListener((ActionEvent e) -> {
            Color colorSeleccionado = JColorChooser.showDialog(this, "Escoge un color", Color.yellow);
            colorLabel = new Label(null, 180, 365, 130, 20);
            colorLabel.get().setOpaque(true);
            colorLabel.get().setBackground(colorSeleccionado);
            colorLabel.repaint();
            c.add(colorLabel);
            c.repaint();
        });
        
        labelImage = new Label("Imagen", 135, 405, 125, 20, 2, 18f);
        c.add(labelImage.get());
        
        btnGuardar = new Button("Guardar",100,580,180,30);
        btnGuardar.addActionListener((ActionEvent e) ->
        {
            /* para Testear, aunque asi sera como se crearan los betas con el formulario */
            People p = new People("Luis", "Amias", "30.292.216", "0412-8968401", "Aragua - La Victoria");
            Car c = new Car(4, "Nissan", "370z", "123SAD", LocalDate.of(2020, 05, 12), Color.YELLOW);
            c.asignOwn(p);
            parentTable.getModel().Add(c);
            this.dispose();
        });
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
