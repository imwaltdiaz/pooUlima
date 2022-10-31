package paquete.clases;

/**
 *
 * @author user
 */
public class Gerente extends Empleado
{
    private int valesConsumo;

    public Gerente(int valesConsumo, String nombre, String genero, String cargo, int numGrados, int añosServ, float sueldoBasico) {
        super(nombre, genero, cargo, numGrados, añosServ, sueldoBasico);
        this.valesConsumo = valesConsumo;
    }

    public int getValesConsumo() {
        return valesConsumo;
    }

    public void setValesConsumo(int valesConsumo) {
        this.valesConsumo = valesConsumo;
    }

    @Override
    public void CalcularBonificacion() 
    {
        if (this.numGrados<=5)
        {
            this.bonificacion = this.sueldoBasico * 0.045f * this.numGrados;
        }
        else
        {
            this.bonificacion = this.sueldoBasico * 0.045f * 5;
        }
    }

    @Override
    public String VerInfo() {
        return super.VerInfo() +
                "\nVales Consumo: " + this.valesConsumo; 
    }
    
    
    
    
    
}
