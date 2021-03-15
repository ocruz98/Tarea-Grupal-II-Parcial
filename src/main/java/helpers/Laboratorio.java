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
    
       public Laboratorio()
    {
        NumeroPisos("", "3");
        ColorEdificio("", "verde");
        NumeroEmpleados("", 5000);
        DimensionEdificio("",8,78,15,0);
        direccion("","Ave. Junior, Frente al Hospital");
        añoFundacion("", 2000);
    }

    private void NumeroPisos(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ColorEdificio(String string, String azúl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void NumeroEmpleados(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void DimensionEdificio(String string, int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void direccion(String string, String ave_14_de_Julio_esquina_opuesta_Farmacia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void añoFundacion(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 

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
}

 
