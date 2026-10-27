import java.util.ArrayList;
public class ListaReproduccion {
    private String nombre;
    private ArrayList<String> canciones;
    private int indiceActual;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        canciones = new ArrayList<String>();
        indiceActual = 0;
    }

    public void agregarCancion(String cancion) {
        canciones.add(cancion);
    }

    public void siguiente() {
        if (indiceActual < canciones.size() - 1) {
            indiceActual++;
        } else {
            System.out.println("No hay más canciones.");
        }
    }

    public void anterior() {
        if (indiceActual > 0) {
            indiceActual--;
        } else {
            System.out.println("Ya estás en la primera canción.");
        }
    }

    public String obtenerPistaActual() {
        if (canciones.isEmpty()) {
            return "No hay canciones.";
        }

        return canciones.get(indiceActual);
    }

}
