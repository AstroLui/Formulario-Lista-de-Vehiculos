package Objetos.Keys;
public class People 
{
    private final String name, lastName, dni, tlf, address;
    public People(String name, String lastName, String dni, String tlf, String address)
    {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.tlf = tlf;
        this.address = address;
    }
    
    public String getName()
    {
        return this.name;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getDni()
    {
        return this.dni;
    }
    public String getTlf()
    {
        return this.tlf;
    }
    public String getAddress()
    {
        return this.address;
    }
}
