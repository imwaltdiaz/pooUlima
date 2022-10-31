package paquete.clases;

import java.util.Random;

/**
 *
 * @author user
 */
public class Director extends Empleado
{
    private int numAcciones;
    private int[] asistencia;

    public Director(int numAcciones, String nombre, String genero, String cargo, int numGrados, int añosServ, float sueldoBasico) {
        super(nombre, genero, cargo, numGrados, añosServ, sueldoBasico);
        this.numAcciones = numAcciones;
        asistencia = new int[5];
    }

    public int getNumAcciones() {
        return numAcciones;
    }

    public void setNumAcciones(int numAcciones) {
        this.numAcciones = numAcciones;
    }

    @Override
    public void CalcularBonificacion() 
    {
        this.bonificacion = 0.035f * this.sueldoBasico * (this.añosServ/5);
    }
    
    public void IngresarAsistencia()
    {
        Random rand = new Random();
        for(int i=0;i<asistencia.length;i++)
        {
            asistencia[i] = rand.nextInt(24-8+1)+8;
        }
    }

    @Override
    public String VerInfo() 
    {
        String cad="";
        cad=cad+super.VerInfo() + "\nNum Acciones: " + this.numAcciones + "\n";
        for(int i=0;i<asistencia.length;i++)
        {
            cad=cad+asistencia[i]+"\n";
        }
        return cad;
    }
    
    
    
    
    
    
    
}