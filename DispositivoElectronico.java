import java.util.ArrayList;

public class DispositivoElectronico {

    protected String fabricante; //inmutable
    protected String numeroSerie; //inmutable
    protected String marca; //inmutable
    protected String nombre; //inmutable
    protected float costo; //mutable
    ArrayList<ComponenteElectronico> componentes = new ArrayList<>(); //mutable
    
    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo){

        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        
    }

        public void agregarComponente(ComponenteElectronico componente){

            componentes.add(componente);

        }

        public void quitarComponente(ComponenteElectronico componente){

            componentes.remove(componente);

        }

        //Getters

        public String getFabricante(){
            return fabricante;
        }

        public String getNumeroSerie(){
            return numeroSerie;
        }

        public String getMarca(){
            return marca;
        }

        public String getNombre(){
            return nombre;
        }

        public float getCosto(){
            return costo;
        }

        public void setCosto(float costo){
            this.costo = costo;
        }

        @Override
        public String toString(){
        return "DispositivoElectronico [fabricante=" + fabricante + ", numeroSerie=" + numeroSerie + ", marca=" + marca + ", nombre=" + nombre + ", costo=" + costo + "]";
    }
}
