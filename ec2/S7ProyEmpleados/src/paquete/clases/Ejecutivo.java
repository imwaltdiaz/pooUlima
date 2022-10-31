package paquete.clases;

/**
 *
 * @author user
 */
public class Ejecutivo extends Empleado
{
    private int entraCinemar;

    public Ejecutivo(int entraCinemar, String nombre, String genero, String cargo, int numGrados, int añosServ, float sueldoBasico) {
        super(nombre, genero, cargo, numGrados, añosServ, sueldoBasico);
        this.entraCinemar = entraCinemar;
    }

    public int getEntraCinemar() {
        return entraCinemar;
    }

    public void setEntraCinemar(int entraCinemar) {
        this.entraCinemar = entraCinemar;
    }

    @Override
    public void CalcularBonificacion() 
    {
        this.bonificacion = 0.02f * this.sueldoBasico;
    }

    @Override
    public String VerInfo() {
        return super.VerInfo() +
                "\nEntradas Cinemar: " + this.entraCinemar;
    }
    
    
    
    
    
}
