public class Smartphone extends Computadora{
    
    protected Sensor sensorDeHuella; //inmutable
    protected Pantalla pantalla; //inmutable

    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, float costo,
                      Microprocesador cpu, long ramMB, Sensor sensorDeHuella, Pantalla pantalla){
        super(fabricante, numeroSerie, marca, nombre, costo, cpu, ramMB);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
    }

    public Sensor getSensorDeHuella(){ 
        return sensorDeHuella; 
    
    }
    public Pantalla getPantalla(){ 
        return pantalla; 
    
    }

    @Override
    public String toString(){
        return super.toString() + ", sensorDeHuella=" + sensorDeHuella.toString() + ", " + pantalla.toString();
    }
}


