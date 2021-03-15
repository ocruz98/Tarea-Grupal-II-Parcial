package tareagrupal;
import helpers.Farmacia;
import helpers.Laboratorio;
public class TareaGrupal 
{
    public static void main(String[] args) 
    {
        Laboratorio lab=new Laboratorio();
        Farmacia farmacia=new Farmacia();
        
        
        lab.info("Laboratorio");
        farmacia.info("Farmacia");
    }
}
