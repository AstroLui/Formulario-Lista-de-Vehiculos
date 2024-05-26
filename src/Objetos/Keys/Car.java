package Objetos.Keys;

import java.awt.Color;
import java.util.Date;

public class Car 
{
    private final String brand, model, licensePlate;
    private People own;
    private final Date yearCar;
    private final Color color;
    private final int item;
    
    public Car(int id, String brand, String model, String licensePlate, Date yearCar, Color colorCar)
    {
        this.item = id;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.color = colorCar;
        this.yearCar = yearCar;
    }


    
    public void asignOwn(People Own)
    {
        this.own = Own;
    }

    public int getId()
    {
        return this.item;
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
    public Date getYearCar()
    {
        return this.yearCar;
    }
}
