public class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
    
    protected boolean encendido; //mutable

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.encendido = false;
    }

    //Getter

    public boolean isEncendido(){ 
        return encendido; 

    }

    //Setter

    public void encender(){ 
        encendido = true; 

    }
    public void apagar(){ 
        encendido = false; 

    }

    @Override
    public String toString() {
        return super.toString() + ", encendido=" + encendido;
    }
}

