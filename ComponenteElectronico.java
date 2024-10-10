public class ComponenteElectronico extends DispositivoElectronico{

    protected DispositivoElectronico esParteDe; //mutable

    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo){
        super(fabricante, numeroSerie, marca, nombre, costo);
    }

    public DispositivoElectronico getEsParteDe(){
        return esParteDe;
    }

    public void setEsParteDe(DispositivoElectronico esParteDe){
        this.esParteDe = esParteDe;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico [esParteDe=" + 
               (esParteDe != null ? esParteDe.getNombre() : "null") + "]";
    }
}