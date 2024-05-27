package Formulario;

import Objetos.Components.Button;
import Objetos.Components.Label;
import Objetos.Keys.Car;
import java.awt.Container;
import javax.swing.JFrame;

public class BuildShowRegister extends JFrame{
    private Container c;
    private final Label lblTitle;
    private final Label name, lastName, dni, tlf, address, brand, model, licensPlate, yearCar, colorCar;
    private final Label relname, rellastName, reldni, reltlf, reladdress, relbrand, relmodel, rellicensPlate, relyearCar, relcolorCar;
    private final Button btnEliminar, btnEditar;
    public BuildShowRegister(Car car, int Click)
    {
        super("Mostrando Registro");
        this.setSize(400, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        c = this.getContentPane();
        
        this.setVisible(true);
        c.setLayout(null);
        
        lblTitle = new Label("Mostrando Registro", 15, 5, 300, 50, 1, 25f);
        c.add(lblTitle);
        
        name = new Label("Nombres", 20, 85, 120, 20, 2, 18f);
        c.add(name);
        relname = new Label(car.getOwn().getName(), 25, 105, 120, 20, 0, 16f, "Thin");
        c.add(relname);
        
        lastName = new Label("Apellidos", 150, 85, 120, 20, 2, 18f);
        c.add(lastName);
        rellastName = new Label(car.getOwn().getLastName(), 155, 105, 120, 20, 0, 16f, "Thin");
        c.add(rellastName);
        
        dni = new Label("Cedula", 20, 145, 120, 20, 2, 18f);
        c.add(dni);
        reldni = new Label(car.getOwn().getDni(), 25, 165, 120, 20, 0, 16f, "Thin");
        c.add(reldni);
        
        tlf = new Label("Telefono", 150, 145, 120, 20, 2, 18f);
        c.add(tlf);
        reltlf = new Label(car.getOwn().getTlf(), 155, 165, 120, 20, 0, 16f, "Thin");
        c.add(reltlf);
        
        address = new Label("Direccion", 20, 205, 120, 20, 2, 18f);
        c.add(address);
        reladdress = new Label(car.getOwn().getAddress(), 25, 225, 120, 20, 0, 16f, "Thin");
        c.add(reladdress);
        
        brand = new Label("Marca", 150, 205, 120, 20, 2, 18f);
        c.add(brand);
        relbrand = new Label(car.getBrand(), 155, 225, 120, 20, 0, 16f, "Thin");
        c.add(relbrand);
        
        model = new Label("Modelo", 240, 205, 120, 20, 2, 18f);
        c.add(model);
        relmodel = new Label(car.getModel(), 245, 225, 120, 20, 0, 16f, "Thin");
        c.add(relmodel);
        
        licensPlate = new Label("Matricula", 20, 265, 120, 20, 2, 18f);
        c.add(licensPlate);
        rellicensPlate = new Label(car.getLicensePlate(), 25, 285, 120, 20, 0, 16f, "Thin");
        c.add(rellicensPlate);
        
        yearCar = new Label("Año del Vehiculo", 150, 265, 180, 20, 2, 18f);
        c.add(yearCar);
        relyearCar = new Label(car.getYearCar()+ "", 155, 285, 180, 20, 0, 16f);
        c.add(relyearCar);
        
        colorCar = new Label("Color del Vehiculo", 20, 325, 180, 20, 2, 18f);
        c.add(colorCar);
        relcolorCar = new Label(null, 30, 350, 120, 20);
        relcolorCar.get().setOpaque(true);
        relcolorCar.get().setBackground(car.getColorCar());
        c.add(relcolorCar);
        
        btnEditar = new Button("Editar", 75, 400, 100, 30);
        c.add(btnEditar);
        
        btnEliminar = new Button("Eliminar", 195, 400, 110, 30);
        c.add(btnEliminar);
    }
}
