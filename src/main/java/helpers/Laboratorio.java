/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author TERNURA
 */
public class Laboratorio {
    
    private double Encargado;
    private String Ubicacion;
    private String Especialidades;
    private int Empleados;
    
    public void imprimir(String mensaje)
    {
        System.out.println(mensaje);
    }
    public String getEncargado() {
     return "...Encargado: Dr.Juan Orlando Hernandez..." ;
    }
     public void Ubicacion(String numeroPisos)
    {
        this.Ubicacion=Ubicacion;
    }
    public String Ubicacion()
    {
        return this.Ubicacion;
    }
    public void Especialidades(int exp){
      this.Especialidades = Especialidades;

      }
      public String Especialidades(){
       return this.Especialidades;
      }
       public int Empleados(){
      return Empleados;
      }
    
}
 
