package Objetos.Keys;

import java.awt.Color;
import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Car 
{
    private final String brand, model, licensePlate;
    private People own;
    private final LocalDate yearCar;
    private final Color color;
    private int item, dayAl;
    private double precioTotal, descuento=0.0, IVA, precioCar, precioDay;
    private URL imagCar;
    private String estado;
    
    public Car(String brand, String model, String licensePlate, LocalDate yearCar, Color colorCar,String estado)
    {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.color = colorCar;
        this.yearCar = yearCar;
        this.estado = estado;
        CalPrecio();
        this.precioTotal = this.precioCar  + this.IVA;
    }
    public Car(String brand, String model, String licensePlate, LocalDate yearCar, Color colorCar, URL icon,String estado, int day, double precioDay)
    {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.color = colorCar;
        this.yearCar = yearCar;
        this.imagCar = icon;
        this.estado = estado;
        CalPrecio();
        this.dayAl = day;
        this.precioDay = precioDay;
        this.precioTotal = day * precioDay;
    }
    
    public Car(String brand, String model, String licensePlate, LocalDate yearCar, Color colorCar, URL icon,String estado)
    {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.color = colorCar;
        this.yearCar = yearCar;
        this.imagCar = icon;
        this.estado = estado;
        CalPrecio();
        this.precioTotal = this.precioCar  + this.IVA;
    }
    
    private void CalDiscount()
    {
        var difDate = ChronoUnit.YEARS.between(yearCar, LocalDate.now());
        this.descuento = 
                (difDate <= 10)?  0.10 :
                (difDate > 10 && difDate <= 30)? 0.40 : 0.60;
    }
    
    private void CalPrecio()
    {
        CalDiscount();
        Random rand = new Random();
        double realist = rand.nextDouble(100.00, 999.00);
        var precio = 
                ("Ford".equals(brand))? 1500 + realist :
                ("BMW".equals(brand))? 2000 + realist : 
                ("Mitsubishi".equals(brand))? 1000 + realist: 
                ("Toyota".equals(brand))? 1200 + realist: 
                ("Mazda".equals(brand)) ? 1300 + realist: 0.0;
        this.precioCar = this.descuento * precio;
        this.IVA = precioCar / 1.21;
    }
    
    public void asignOwn(People Own)
    {
        this.own = Own;
    }
    public int getId()
    {
        return this.item;
    }
    public void setId(int id)
    {
        this.item = id;
    }
    public People getOwn()
    {
        return this.own;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public String getModel()
    {
        return this.model;
    }
    public String getLicensePlate()
    {
        return this.licensePlate;
    }
    public Color getColorCar()
    {
        return this.color;
    }
    public LocalDate getYearCar()
    {
        return this.yearCar;
    }
    public double getPrecio()
    {
        return this.precioCar;
    }
    public double getPrecioDay()
    {
        return this.precioDay;
    }
    public int getDayAl()
    {
        return this.dayAl;
    }
    public double getPrecioTotal()
    {
        return this.precioTotal;
    }
    public void setPrecioTotal(double precio)
    {
        this.precioTotal = precio;
    }
    public String getEstado()
    {
        return this.estado;
    }
    public URL getIconImage()
    {
        return this.imagCar;
    }

}
