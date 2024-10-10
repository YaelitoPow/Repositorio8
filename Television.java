public class Television extends DispositivoElectronico{
    
    protected Pantalla pantalla; //inmutable

    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, Pantalla pantalla){
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    //Getter

    public Pantalla getPantalla(){ 
        return pantalla; 
    
    }

    @Override
    public String toString(){
        return super.toString() + ", " + pantalla.toString();
    }
}
