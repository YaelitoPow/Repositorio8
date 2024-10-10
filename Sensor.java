public class Sensor extends ComponenteElectronico {
    
    protected String tipo; //inmutable
    protected String unidadDeMedida; //inmutable
    protected int valor; //inmutable

    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, float costo, String tipo, String unidadDeMedida, int valor){
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    //Getters

    public String getTipo(){ 
        return tipo; 

    }
    public String getUnidadDeMedida(){ 
        return unidadDeMedida; 
    
    }
    public int getValor(){ 
        return valor; 
    
    }

    @Override
    public String toString(){
        return super.toString() + ", tipo=" + tipo + ", unidadDeMedida=" + unidadDeMedida + ", valor=" + valor;
    }
}

