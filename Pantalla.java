public class Pantalla extends ComponenteElectronico {
    
    protected int resolucionX; //inmutable
    protected int resolucionY; //inmutable

    public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, float costo, int resolucionX, int resolucionY){
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    //Getters

    public int getResolucionX(){ 
        return resolucionX; 
    
    }
    public int getResolucionY(){ 
        return resolucionY; 
    
    }

    @Override
    public String toString(){
        return super.toString() + ", resolucionX=" + resolucionX + ", resolucionY=" + resolucionY;
    }
}

