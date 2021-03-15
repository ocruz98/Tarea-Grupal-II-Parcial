package helpers;
public class Hospital 
{
    private double dimensionEdificio;
    private double x=0, y=0, z=0;
    private String numeroPisos;
    private String colorEdificio;
    private String direccion;
    private int numeroEmpleados, añoFundacion;
    
    public Hospital(){}
    public void imprimir(String mensaje)
    {
        System.out.println(mensaje);
    }
    public void DimensionEdificio(String edificio, double _x, double _y, double _z, double _dimensionEdificio)
    {
        _dimensionEdificio=_x*_y*_z;
        this.dimensionEdificio=_dimensionEdificio;
        this.x=_x;
        this.y=_y;
        this.z=_z;
    }
    public double obtenerDimensionEdificio()
    {
        return this.dimensionEdificio;
    }
    public void NumeroPisos(String edificio, String numeroPisos)
    {
        this.numeroPisos=numeroPisos;
    }
    public String obtenerNumeroPisos()
    {
        return this.numeroPisos;
    }
    public void ColorEdificio(String edificio, String colorEdificio)
    {
        this.colorEdificio=colorEdificio;
    }
    public String obtenerColorEdificio()
    {
        return this.colorEdificio;
    }
    public void direccion(String edificio, String direccion)
    {
        this.direccion=direccion; 
    }
    public String direccion()
    {
        return this.direccion;
    }
    public void NumeroEmpleados(String edificio, int _numeroEmpleados)
    {
        this.numeroEmpleados=_numeroEmpleados;
    }
    public int obtenerNumeroEmpleados()
    {
        return this.numeroEmpleados;
    }
    public void añoFundacion(String edificio, int _añoFundacion)
    {
        this.añoFundacion = _añoFundacion;
    }
    public int obtenerañoFundacion()
    {
        return this.añoFundacion;
    }
    public void info(String edificio)
    {
        imprimir("Las dimensiones de el/la "+edificio+" son: "+x+", "+y+" y "+z+" metros. Su volumen es de "+dimensionEdificio+" metros cuadrados.");
        imprimir("El color de el/la "+edificio+" es "+colorEdificio);
        imprimir("La cantidad de pisos de el/la "+edificio+" son "+numeroPisos);
        imprimir("La cantidad de empleados que hay en el/la "+edificio+" es de "+numeroEmpleados);
        imprimir("La direccion de "+edificio+" es en: "+direccion);
        imprimir("El año de fundacion de el/la "+edificio+" es: "+añoFundacion);
    }
}
