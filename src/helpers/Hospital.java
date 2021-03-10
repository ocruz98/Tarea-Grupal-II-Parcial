package helpers;
public class Hospital 
{
    private double dimensionEdificio;
    private String numeroPisos;
    private String colorEdificio;
    private int numeroEmpleados;
    
    public Hospital(){}
    public void imprimir(String mensaje)
    {
        System.out.println(mensaje);
    }
    public void dimensionEdificio(String edificio, double x, double y, double z)
    {
        double edi=x*y*z;
        imprimir("Las dimensiones de "+edificio+" son: "+x+", "+y+" y "+z+" metros. Su volumen es de "+edi+" metros cuadrados.");
    }
    public void NumeroPisos(String numeroPisos)
    {
        this.numeroPisos=numeroPisos;
    }
    public String obtenerNumeroPisos()
    {
        return this.numeroPisos;
    }
    public void ColorEdificio(String colorEdificio)
    {
        this.colorEdificio=colorEdificio;
    }
    public String obtenerColorEdificio()
    {
        return this.colorEdificio;
    }
    public void NumeroEmpleados(int x)
    {
        imprimir("La cantidad de empleados es de "+x+" personas");
    }
    public void imprimirInformacion(String edificio)
    {
        imprimir("Cantidad de pisos en "+edificio+" : "+numeroPisos);
    }
    
}
