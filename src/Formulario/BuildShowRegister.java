package Formulario;

import Objetos.Components.Button;
import Objetos.Components.Label;
import Objetos.Components.Table;
import Objetos.Keys.Car;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;

public class BuildShowRegister extends JFrame{
    private Container c;
    private final Label lblTitle;
    private final Label name, lastName, dni, tlf, address, brand, model, licensPlate, yearCar, colorCar, precio, estado, precioAl, dayAl, imagen;
    private final Label relname, rellastName, reldni, reltlf, reladdress, relbrand, relmodel, rellicensPlate, relyearCar, relcolorCar, relPrecio, relEstado, relPrecioAl, relDayAl, relImagen;
    private final Button btnEliminar, btnEditar;
    private Table parentTable;
    private DecimalFormat df = new DecimalFormat("#.## $");
    private DecimalFormat df1 = new DecimalFormat("#.##");
    public BuildShowRegister(Car car, Table table) throws IOException
    {
        super("Mostrando Registro");
        this.setSize(400, 825);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c = this.getContentPane();
        
        this.setVisible(true);
        this.parentTable = table;

        c.setLayout(null);
        
        lblTitle = new Label("Mostrando Registro", 15, 5, 300, 50, 1, 25f);
        c.add(lblTitle);
        
        imagen = new Label("Imagen", 20, 50, 120, 20, 2, 18f);
        c.add(imagen);
        
        relImagen = new Label(20, 75, 345, 175, car.getIconImage());
        c.add(relImagen);
        
        name = new Label("Nombres", 20, 265, 120, 20, 2, 18f);
        c.add(name);
        relname = new Label(car.getOwn().getName(), 25, 290, 120, 20, 0, 16f, "Thin");
        c.add(relname);
        
        lastName = new Label("Apellidos", 150, 265, 120, 20, 2, 18f);
        c.add(lastName);
        rellastName = new Label(car.getOwn().getLastName(), 155, 290, 120, 20, 0, 16f, "Thin");
        c.add(rellastName);
        
        dni = new Label("Cedula", 20, 325, 120, 20, 2, 18f);
        c.add(dni);
        reldni = new Label(car.getOwn().getDni(), 25, 350, 120, 20, 0, 16f, "Thin");
        c.add(reldni);
        
        tlf = new Label("Telefono", 150, 325, 120, 20, 2, 18f);
        c.add(tlf);
        reltlf = new Label(car.getOwn().getTlf(), 155, 350, 120, 20, 0, 16f, "Thin");
        c.add(reltlf);
        
        address = new Label("Direccion", 20, 385, 120, 20, 2, 18f);
        c.add(address);
        reladdress = new Label(car.getOwn().getAddress(), 25, 410, 150, 20, 0, 16f, "Thin");
        c.add(reladdress);
        
        brand = new Label("Marca", 150, 385, 120, 20, 2, 18f);
        c.add(brand);
        relbrand = new Label(car.getBrand(), 155, 410, 120, 20, 0, 16f, "Thin");
        c.add(relbrand);
        
        model = new Label("Modelo", 240, 385, 120, 20, 2, 18f);
        c.add(model);
        relmodel = new Label(car.getModel(), 245, 410, 120, 20, 0, 16f, "Thin");
        c.add(relmodel); 
        
        licensPlate = new Label("Matricula", 20, 445, 120, 20, 2, 18f);
        c.add(licensPlate);
        rellicensPlate = new Label(car.getLicensePlate(), 25, 470, 120, 20, 0, 16f, "Thin");
        c.add(rellicensPlate);
        
        yearCar = new Label("Año del Vehiculo", 150, 445, 180, 20, 2, 18f);
        c.add(yearCar);
        relyearCar = new Label(car.getYearCar().format(DateTimeFormatter.ofPattern("yyyy")), 155, 470, 180, 20, 0, 16f, "Thin");
        c.add(relyearCar);
        
        colorCar = new Label("Color del Vehiculo", 20, 505, 180, 20, 2, 18f);
        c.add(colorCar);
        relcolorCar = new Label(null, 30, 530, 120, 15);
        relcolorCar.get().setOpaque(true);
        relcolorCar.get().setBackground(car.getColorCar());
        c.add(relcolorCar);
        
        precio = new Label("Precio del Vehiculo", 20, 565, 200, 20, 2, 16.5f);
        c.add(precio);
        relPrecio = new Label(df.format(car.getPrecio()), 25, 590, 120, 20, 0, 16f, "Thin");
        c.add(relPrecio);
        
        estado = new Label("Estado", 200, 505, 120, 20,2, 18f);
        c.add(estado);
        relEstado = new Label(car.getEstado(), 195, 530, 120, 20, 0, 16f, "Thin");
        c.add(relEstado);
        
        precioAl = new Label("Precio del Alquiler", 20, 620, 180, 20, 2, 16.5f);
        precioAl.setVisible(false);c.add(precioAl); 
        relPrecioAl = new Label(df.format((long) car.getPrecioDay()), 25, 645, 120, 20, 0, 16f, "Thin");
        relPrecioAl.setVisible(false);c.add(relPrecioAl);
        
        dayAl = new Label("Dias de alquiler", 190, 620, 180, 20, 2, 16.5f);
        dayAl.setVisible(false);c.add(dayAl);
        relDayAl =new Label(car.getDayAl() + "", 195, 645, 180, 20, 0, 16f, "Thin");
        relDayAl.setVisible(false);c.add(relDayAl);
        
        btnEditar = new Button("Editar", 75, 705, 100, 30);
        btnEditar.addActionListener((ActionEvent e) ->{
            BuildFormulario form = new BuildFormulario();
            form.addItem(car, parentTable);
            form.setVisible(true);
            
            this.dispose();
        });
        c.add(btnEditar);
        
        btnEliminar = new Button("Eliminar", 195, 705, 110, 30);
        btnEliminar.addActionListener((ActionEvent e) ->{
            this.parentTable.getModel().Delete(car.getId()-1);
            this.parentTable.setClick(0);
            this.parentTable.repaint();
            this.parentTable.get().repaint();
            this.dispose();
        });
        c.add(btnEliminar);
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                parentTable.setClick(0);
            }
            
            public void windowOpened(WindowEvent e)
            {
                var bool = ("En Alquiler".equals(car.getEstado())?true:false);
                precioAl.setVisible(bool);
                relPrecioAl.setVisible(bool);
                dayAl.setVisible(bool);
                relDayAl.setVisible(bool);
            }
        });
    }
}
