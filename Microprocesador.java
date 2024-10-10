public class Microprocesador extends ComponenteElectronico{

    protected int cacheRAM; //inmutable
    protected long velocidadHz; //inmutable

    public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, float costo, int cacheRAM, long velocidadHz){
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    //Getters

    public int getCacheRAM(){
        return cacheRAM; 
    
    }
    public long getVelocidadHz(){ 
        return velocidadHz; 
    
    }

    @Override
    public String toString(){
        return "Microprocesador [cacheRAM=" + cacheRAM + ", velocidadHz=" + velocidadHz + "]";
    }
}



