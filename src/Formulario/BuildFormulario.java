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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Arrays;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class BuildFormulario extends JFrame
{
    Container c;
    private Button btnGuardar, btnEditar, color;
    private Label title, labelName, labelLastName, labelTlf, labelAddress, labelDni, labelIdCar, labelYear, labelColor, labelBrand, labelModel, labelImage, colorLabel, labelPrecioAl, labelDayAl, labelEstado;
    private Inputs name,lastName,tlf,address,dni,idCar, year, precioAl, dayAl;
    private Combo brand, estado;
    private Combo model;
    private Color colorSeleccionado;
    
    private Table parentTable;
    private DecimalFormat df1 = new DecimalFormat("#.##");
    public BuildFormulario()
    {
        super("Formulario");
        this.setSize(370, 680);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c = this.getContentPane();
        
        c.setLayout(null);
    }
    
    public void addItemsDefault(Table table)
    {
        this.parentTable = table;
        title = new Label("Registro de Vehículos", 15, 5, 300, 50, 1, 25f);
        c.add(title.get());
        
        labelName = new Label("Nombre", 20, 85, 120, 20, 2, 18f);
        c.add(labelName.get());

        name = new Inputs("Alfonso", 20, 110, 130, 20);
        c.add(name); c.add(name.getS());
        
        labelLastName = new Label("Apellido",190, 85, 120, 20, 2, 18f);
        c.add(labelLastName.get());
        
        lastName = new Inputs("Henrique", 190, 110, 130, 20);
        c.add(lastName); c.add(lastName.getS());
        
        labelDni = new Label("Cédula", 20, 145, 120, 20, 2, 18f);
        c.add(labelDni.get());
        
        dni = new Inputs("29750712", 20, 170, 130, 20);
        c.add(dni); c.add(dni.getS());
        
        labelTlf = new Label("Teléfono", 190, 145, 125, 20, 2, 18f);
        c.add(labelTlf.get());
        
        tlf = new Inputs("0424-4632499", 190, 170, 130, 20);
        c.add(tlf); c.add(tlf.getS());
        
        labelAddress = new Label("Dirección", 20, 205, 125, 20, 2, 18f);
        c.add(labelAddress.get());
        
        address = new Inputs("Valencia, Prebo", 20, 230, 130, 20);
        c.add(address); c.add(address.getS());
        
        labelIdCar = new Label("Matricula", 190, 265, 125, 20, 2, 18f);
        c.add(labelIdCar.get());
        
        idCar = new Inputs("AB123CD", 190, 290, 130, 20);
        c.add(idCar); c.add(idCar.getS());
        
        labelYear = new Label("Año", 20, 325, 125, 20, 2, 18f);
        c.add(labelYear.get());
        
        year = new Inputs("2024", 20, 350, 130, 20);
        c.add(year); c.add(year.getS());
        
        labelBrand = new Label("Marca", 190, 205, 125, 20, 2, 18f);
        c.add(labelBrand.get());
        
        brand = new Combo(190, 230, 130, 20);
        brand.addOptions(Arrays.asList("Seleccionar Marca" ,"Toyota", "Ford", "BMW", "Mitsubishi", "Mazda"));
        c.add(brand);
        
        labelModel = new Label("Modelo", 20, 265, 125, 20, 2, 18f);
        c.add(labelModel.get());
        
        model = new Combo(20, 290, 145, 20);
        model.addOptions(Arrays.asList("Selecciona el modelo"));
        c.add(model);
        
        brand.addActionListener((ActionEvent e) -> {
            model.removeAllItems();
            var marca = (String)brand.getSelectedItem();
            var options = 
                    ("Toyota".equals(marca)) ? Arrays.asList("Selecciona el modelo","Yaris", "Corolla", "Supra"): 
                    ("Ford".equals(marca)) ? Arrays.asList("Selecciona el modelo","Explorer", "Bronco", "Ranger Raptor") : 
                    ("BMW".equals(marca)) ? Arrays.asList("Selecciona el modelo","M3", "X2", "M5") :
                    ("Mitsubishi".equals(marca)) ? Arrays.asList("Selecciona el modelo","Eclipse", "EVO Lancer", "Lancer") :
                    ("Mazda".equals(marca)) ? Arrays.asList("Selecciona el modelo","RX8", "MX5", "RX Vision GT3") :Arrays.asList("Selecciona el modelo");
            
            model.addOptions(options);
        });
        
        labelColor = new Label("Color", 190, 325, 125, 20, 2, 18f);
        c.add(labelColor.get());
        
        color = new Button("Escoge un color", 190, 350, 130, 20);
        c.add(color);
        
        color.addActionListener((ActionEvent e) -> {
            colorSeleccionado = JColorChooser.showDialog(this, "Escoge un color", Color.yellow);
            colorLabel = new Label(null, 250, 327, 15, 15);
            colorLabel.get().setOpaque(true);
            colorLabel.get().setBackground(colorSeleccionado);
            colorLabel.repaint();
            c.add(colorLabel);
            c.repaint();
        });
        
        labelEstado = new Label("Estado", 20, 385, 120, 20, 2, 18f);
        c.add(labelEstado);
        
        estado = new Combo(20, 410, 140, 20);
        estado.addOptions(Arrays.asList("Seleccione un Estado", "En Alquiler", "En Venta"));
        c.add(estado);
        
        labelPrecioAl = new Label("Precio del Alquiler", 20, 445, 180, 20, 2, 15f);
        labelPrecioAl.setVisible(false);
        c.add(labelPrecioAl);
        precioAl = new Inputs( 20, 465, 120, 20);
        precioAl.setVisible(false);
        precioAl.getS().setVisible(false);
        c.add(precioAl); c.add(precioAl.getS());
            
        labelDayAl = new Label("Dias del Alquiler", 20, 495, 180, 20, 2, 15f);
        labelDayAl.setVisible(false);
        c.add(labelDayAl);
        dayAl = new Inputs( 20, 515, 120, 20);
        dayAl.setVisible(false);
        dayAl.getS().setVisible(false);
        c.add(dayAl); c.add(dayAl.getS());
        
        estado.addActionListener((ActionEvent e) ->
        {
            var bool = ("En Alquiler".equals(estado.getSelectedItem()))? true: false;
            labelPrecioAl.setVisible(bool);
            precioAl.setVisible(bool);
            precioAl.getS().setVisible(bool);
            labelDayAl.setVisible(bool);
            dayAl.setVisible(bool);
            dayAl.getS().setVisible(bool);
            c.repaint();
            
            precioAl.addPlaceHolder("1992.29 ($)");
            dayAl.addPlaceHolder("Numero de Dias"); 
        });

        labelImage = new Label("Imagen", 190, 385, 120, 20, 2, 18f);
        c.add(labelImage);
        
        btnGuardar = new Button("Guardar",80,580,180,30);
        btnGuardar.addActionListener((ActionEvent e) ->
        {
            /* para Testear, aunque asi sera como se crearan los betas con el formulario */
            People p = new People(name.getText(), lastName.getText(),dni.getText(), tlf.getText(), address.getText());
            Car c = ("En Alquiler".equals(estado.getSelectedItem()))
                    ? new Car((String)brand.getSelectedItem(), (String)model.getSelectedItem(), idCar.getText(), LocalDate.of(parseInt(year.getText()), 01, 01),colorSeleccionado, (String)estado.getSelectedItem(), parseInt(dayAl.getText()), parseDouble(precioAl.getText()))
                    : new Car((String)brand.getSelectedItem(), (String)model.getSelectedItem(), idCar.getText(), LocalDate.of(parseInt(year.getText()), 01, 01),colorSeleccionado, (String)estado.getSelectedItem());
            c.asignOwn(p);
            parentTable.getModel().Add(c);
            this.parentTable.setClick(0);
            this.dispose();
        });
        c.add(btnGuardar);  
    }
    
    public void addItem(Car Coche, Table table)
    {
        this.parentTable = table;
        title = new Label("Registro de Vehículos", 15, 5, 300, 50, 1, 25f);
        c.add(title.get());
        
        labelName = new Label("Nombre", 20, 85, 120, 20, 2, 18f);
        c.add(labelName.get());

        name = new Inputs("Alfonso", 20, 110, 130, 20);
        c.add(name); c.add(name.getS()); name.setText(Coche.getOwn().getName());
        
        labelLastName = new Label("Apellido",190, 85, 120, 20, 2, 18f);
        c.add(labelLastName.get());
        
        lastName = new Inputs("Henrique", 190, 110, 130, 20);
        c.add(lastName); c.add(lastName.getS()); lastName.setText(Coche.getOwn().getLastName());
        
        labelDni = new Label("Cédula", 20, 145, 120, 20, 2, 18f);
        c.add(labelDni.get());
        
        dni = new Inputs("29750712", 20, 170, 130, 20);
        c.add(dni); c.add(dni.getS()); dni.setText(Coche.getOwn().getDni());
        
        labelTlf = new Label("Teléfono", 190, 145, 125, 20, 2, 18f);
        c.add(labelTlf.get());
        
        tlf = new Inputs("0424-4632499", 190, 170, 130, 20);
        c.add(tlf); c.add(tlf.getS()); tlf.setText(Coche.getOwn().getTlf());
        
        labelAddress = new Label("Dirección", 20, 205, 125, 20, 2, 18f);
        c.add(labelAddress.get());
        
        address = new Inputs("Valencia, Prebo", 20, 230, 130, 20);
        c.add(address); c.add(address.getS()); address.setText(Coche.getOwn().getAddress());
        
        labelIdCar = new Label("Matricula", 190, 265, 125, 20, 2, 18f);
        c.add(labelIdCar.get());
        
        idCar = new Inputs("AB123CD", 190, 290, 130, 20);
        c.add(idCar); c.add(idCar.getS()); idCar.setText(Coche.getLicensePlate());
        
        labelYear = new Label("Año", 20, 325, 125, 20, 2, 18f);
        c.add(labelYear.get());
        
        year = new Inputs("2024", 20, 350, 130, 20);
        c.add(year); c.add(year.getS()); year.setText(Coche.getYearCar().getYear()+"");
        
        labelBrand = new Label("Marca", 190, 205, 125, 20, 2, 18f);
        c.add(labelBrand.get());
        
        brand = new Combo(190, 230, 130, 20);
        brand.addOptions(Arrays.asList("Seleccionar Marca" ,"Toyota", "Ford", "BMW", "Mitsubishi", "Mazda"));
        c.add(brand); brand.setSelectedItem(Coche.getBrand());
        
        labelModel = new Label("Modelo", 20, 265, 125, 20, 2, 18f);
        c.add(labelModel.get());
        
        model = new Combo(20, 290, 145, 20);
        var options = 
                    ("Toyota".equals(brand.getSelectedItem())) ? Arrays.asList("Selecciona el modelo","Yaris", "Corolla", "Supra"): 
                    ("Ford".equals(brand.getSelectedItem())) ? Arrays.asList("Selecciona el modelo","Explorer", "Bronco", "Ranger Raptor") : 
                    ("BMW".equals(brand.getSelectedItem())) ? Arrays.asList("Selecciona el modelo","M3", "X2", "M5") :
                    ("Mitsubishi".equals(brand.getSelectedItem())) ? Arrays.asList("Selecciona el modelo","Eclipse", "EVO Lancer", "Lancer") :
                    ("Mazda".equals(brand.getSelectedItem())) ? Arrays.asList("Selecciona el modelo","RX8", "MX5", "RX Vision GT3") :Arrays.asList("Selecciona el modelo");
        model.addOptions(options);
        model.setSelectedItem(Coche.getModel());
        c.add(model); 

        brand.addActionListener((ActionEvent e) -> {
            model.removeAllItems();
            var marca = (String)brand.getSelectedItem();
            var items = 
                    ("Toyota".equals(marca)) ? Arrays.asList("Selecciona el modelo","Yaris", "Corolla", "Supra"): 
                    ("Ford".equals(marca)) ? Arrays.asList("Selecciona el modelo","Explorer", "Bronco", "Ranger Raptor") : 
                    ("BMW".equals(marca)) ? Arrays.asList("Selecciona el modelo","M3", "X2", "M5") :
                    ("Mitsubishi".equals(marca)) ? Arrays.asList("Selecciona el modelo","Eclipse", "EVO Lancer", "Lancer") :
                    ("Mazda".equals(marca)) ? Arrays.asList("Selecciona el modelo","RX8", "MX5", "RX Vision GT3") :Arrays.asList("Selecciona el modelo");
            
            model.addOptions(items);
        });        
        color = new Button("Escoge un color", 190, 350, 130, 20);
        c.add(color);
        
        labelColor = new Label("Color", 190, 325, 125, 20, 2, 18f);
        c.add(labelColor.get());
        
        colorLabel = new Label(null, 250, 327, 15, 15);
        colorLabel.get().setOpaque(true); colorLabel.get().setBackground(Coche.getColorCar());
        c.add(colorLabel); colorSeleccionado = Coche.getColorCar();
        
        color.addActionListener((ActionEvent e) -> {
            colorSeleccionado = JColorChooser.showDialog(this, "Escoge un color", Color.yellow);
            colorLabel.get().setBackground(colorSeleccionado);
            colorLabel.repaint();
            c.repaint();
        });
        
        labelEstado = new Label("Estado", 20, 385, 120, 20, 2, 18f);
        c.add(labelEstado);
        
        estado = new Combo(20, 410, 140, 20);
        estado.addOptions(Arrays.asList("Seleccione un Estado", "En Alquiler", "En Venta"));
        estado.setSelectedItem(Coche.getEstado());
        c.add(estado);
        
        labelPrecioAl = new Label("Precio del Alquiler", 20, 445, 180, 20, 2, 15f);
        labelPrecioAl.setVisible(false);
        c.add(labelPrecioAl);
        precioAl = new Inputs( 20, 465, 120, 20);
        precioAl.setVisible(false);
        precioAl.getS().setVisible(false);
        c.add(precioAl); c.add(precioAl.getS());
            
        labelDayAl = new Label("Dias del Alquiler", 20, 495, 180, 20, 2, 15f);
        labelDayAl.setVisible(false);
        c.add(labelDayAl);
        dayAl = new Inputs( 20, 515, 120, 20);
        dayAl.setVisible(false);
        dayAl.getS().setVisible(false);
        c.add(dayAl); c.add(dayAl.getS());
        
        estado.addActionListener((ActionEvent e) ->
        {
            var bool = ("En Alquiler".equals(estado.getSelectedItem()))? true: false;
            labelPrecioAl.setVisible(bool);
            precioAl.setVisible(bool);
            precioAl.getS().setVisible(bool);
            labelDayAl.setVisible(bool);
            dayAl.setVisible(bool);
            dayAl.getS().setVisible(bool);
            c.repaint();
            
            precioAl.addPlaceHolder("1992.29 ($)");
            dayAl.addPlaceHolder("Numero de Dias"); 
        });
        
        this.addWindowListener(new WindowAdapter()
        {
           public void windowOpened(WindowEvent e)
           {
            var bool = ("En Alquiler".equals(estado.getSelectedItem()))? true: false;
            labelPrecioAl.setVisible(bool);
            precioAl.setVisible(bool);
            precioAl.getS().setVisible(bool);
            labelDayAl.setVisible(bool);
            dayAl.setVisible(bool);
            dayAl.getS().setVisible(bool);
            c.repaint();
            
            precioAl.addPlaceHolder("1992.29");
            precioAl.setText(df1.format(Coche.getPrecioDay()));
            dayAl.addPlaceHolder("Numero de Dias"); 
            dayAl.setText(Coche.getDayAl() + "");
           } 
        });
        btnEditar = new Button("Editar",80,580,180,30);
        btnEditar.addActionListener((ActionEvent e) ->
        {
            /* para Testear, aunque asi sera como se crearan los betas con el formulario */
            People p = new People(name.getText(), lastName.getText(),dni.getText(), tlf.getText(), address.getText());
            Car c = ("En Alquiler".equals(estado.getSelectedItem()))
                    ? new Car((String)brand.getSelectedItem(), (String)model.getSelectedItem(), idCar.getText(), LocalDate.of(parseInt(year.getText()), 01, 01),colorSeleccionado, (String)estado.getSelectedItem(), parseInt(dayAl.getText()), parseDouble(precioAl.getText()))
                    : new Car((String)brand.getSelectedItem(), (String)model.getSelectedItem(), idCar.getText(), LocalDate.of(parseInt(year.getText()), 01, 01),colorSeleccionado, (String)estado.getSelectedItem());
            c.asignOwn(p);
            parentTable.getModel().Edit(Coche.getId()-1, c);
            parentTable.repaint();
            this.parentTable.setClick(0);
            this.dispose();
        });
        c.add(btnEditar);
    }
}
