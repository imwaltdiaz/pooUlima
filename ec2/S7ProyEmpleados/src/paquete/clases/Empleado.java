package paquete.clases;

/**
 *
 * @author user
 */
public abstract class Empleado 
{
    protected String nombre, genero, cargo;
    protected int numGrados, añosServ;
    protected float sueldoBasico, bonificacion, sueldoTotal;

    public Empleado(String nombre, String genero, String cargo, int numGrados, int añosServ, float sueldoBasico) {
        this.nombre = nombre;
        this.genero = genero;
        this.cargo = cargo;
        this.numGrados = numGrados;
        this.añosServ = añosServ;
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumGrados() {
        return numGrados;
    }

    public void setNumGrados(int numGrados) {
        this.numGrados = numGrados;
    }

    public int getAñosServ() {
        return añosServ;
    }

    public void setAñosServ(int añosServ) {
        this.añosServ = añosServ;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }

    public float getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(float sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }
    
    public void CalcularSueldoTotal()
    {
        this.sueldoTotal = this.sueldoBasico + this.bonificacion;
    }
    
    public abstract void CalcularBonificacion();

    
    public String VerInfo() {
        return "Nombre: " + nombre + 
                "\nGenero: " + genero + 
                "\nCargo: " + cargo + 
                "\nNum Grados: " + numGrados + 
                "\nAños Serv: " + añosServ + 
                "\nSueldo Basico: " + sueldoBasico + 
                "\nBonificacion: " + bonificacion + 
                "\nSueldo Total: " + sueldoTotal;
    }
    
    
    
    
    
}
