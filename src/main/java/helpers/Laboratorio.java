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
public class Laboratorio extends Hospital{

    private String Azul;
    
    
	private String NumeroPisos;
        private String ColorEdificio;
        private String NumeroEmpleados;
	private String DimencionEdificio;
	private String idMedico;
	
public Laboratorio(String NumeroPisos, String ColorEdificio, String NumeroEmpleados,String idMedico, String DimencionEdificio) {
		this.NumeroPisos = NumeroPisos;
		this.ColorEdificio = ColorEdificio;
		this.NumeroEmpleados= NumeroEmpleados;
		this.idMedico = idMedico;
		this.DimencionEdificio = DimencionEdificio;
	}

	public String getCodigo() {
		return NumeroPisos;
	}

	public void setNumeroPisos(String NumeroPisos) {
		this.NumeroPisos = NumeroPisos;
	}

	public String getColorEdificio() {
		return ColorEdificio;
	}

	public void setColorEdificio(String ColorEdificio) {
		this.ColorEdificio = ColorEdificio;
	}

	public String getNumeroEmpleados() {
		return NumeroEmpleados;
	}

	public void setNumeroEmpleados(String NumeroEmpleados) {
		this.NumeroEmpleados = NumeroEmpleados;
	}

	public String getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(String idMedico) {
		this.idMedico = idMedico;
	}

	public String getDimencionEdificio() {
		return DimencionEdificio;
	}

	public void setDimencionEdificio(String DimencionEdificio) {
		this.DimencionEdificio = DimencionEdificio;
	}
	
        //Muestra todo sobre Laboratorio en el Hospital.
	public void mostrar() {
		System.out.println("\n\t---------------");
		System.out.println("NumeroPisos: " + 10);
		System.out.println("ColorEdificio: " + Azul);
		System.out.println("NumeroEmpleados: " + 5000);
		System.out.println("ID Medico: " + idMedico);
		System.out.println("DimencionEdificio:"+78);
		System.out.println("\t---------------");
	}
}

 
