public class Computadora extends DispositivoElectronico{

    protected Microprocesador cpu; //inmutable
    protected long ramMB; //inmutable

    public Computadora(String fabricante, String numeroSerie, String marca, String nombre, float costo, Microprocesador cpu, long ramMB){
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    //Getter

    public Microprocesador getCpu(){ 
        return cpu; 
    
    }

    //Setters

    public void setCpu(Microprocesador cpu){ 
        this.cpu = cpu; 
    
    }

    public long getRamMB(){ 
        return ramMB; 
    
    }
    public void setRamMB(long ramMB){ 
        this.ramMB = ramMB; 
    
    }

    @Override
    public String toString() {
        return super.toString() + ", cpu=" + cpu.toString() + ", ramMB=" + ramMB;
    }
}


