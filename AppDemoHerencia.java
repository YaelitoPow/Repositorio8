import java.util.ArrayList;

public class AppDemoHerencia {

    public static void main(String[] args) {

        //Creación de los componentes para los Smartphones
        Microprocesador cpu1 = new Microprocesador("Qualcomm", "Snapdragon888", "Qualcomm", "Snapdragon", 2000, 8, 2900);
        Microprocesador cpu2 = new Microprocesador("Apple", "A14Bionic", "Apple", "A14 Bionic", 2500, 6, 3100);

        Pantalla pantalla1 = new Pantalla("Samsung", "OLED123", "Samsung", "OLED", 500, 1080, 2400);
        Pantalla pantalla2 = new Pantalla("LG", "IPS789", "LG", "IPS", 400, 1080, 2340);

        Sensor sensor1 = new Sensor("Sony", "S1", "Sony", "Huella Digital", 100, "Biométrico", "mm", 5);
        Sensor sensor2 = new Sensor("Sony", "S2", "Sony", "Huella Digital", 110, "Biométrico", "mm", 6);

        //Creacion de smartphones y asignación de los componentes
        Smartphone smartphone1 = new Smartphone("Apple", "iPhone12", "Apple", "iPhone 12", 999.99f, cpu1, 4096, sensor1, pantalla1);
        Smartphone smartphone2 = new Smartphone("Samsung", "GalaxyS21", "Samsung", "Galaxy S21", 899.99f, cpu2, 8192, sensor2, pantalla2);

        cpu1.setEsParteDe(smartphone1);
        pantalla1.setEsParteDe(smartphone1);
        sensor1.setEsParteDe(smartphone1);

        cpu2.setEsParteDe(smartphone2);
        pantalla2.setEsParteDe(smartphone2);
        sensor2.setEsParteDe(smartphone2);

        //Lista de Smartphones
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);

        //Componentes para televisiones
        Pantalla pantallaTV1 = new Pantalla("Samsung", "LED123", "Samsung", "LED UHD", 3000, 3840, 2160);
        Pantalla pantallaTV2 = new Pantalla("LG", "OLED456", "LG", "OLED 4K", 4000, 3840, 2160);

        //Creacion de las televisiones
        Television television1 = new Television("Samsung", "TV001", "Samsung", "Smart TV 55'", 5000f, pantallaTV1);
        Television television2 = new Television("LG", "TV002", "LG", "Smart TV 65'", 7000f, pantallaTV2);

        pantallaTV1.setEsParteDe(television1);
        pantallaTV2.setEsParteDe(television2);

        //Lista de televisiones
        ArrayList<Television> listaDeTVs = new ArrayList<>();
        listaDeTVs.add(television1);
        listaDeTVs.add(television2);

        System.out.println("Lista de Smartphones:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone.toString());
        }

        System.out.println("\nLista de Televisiones:");
        for (Television television : listaDeTVs) {
            System.out.println(television.toString());
        }
    }
}
