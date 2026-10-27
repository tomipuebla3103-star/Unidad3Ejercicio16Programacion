//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ListaReproduccion lista = new ListaReproduccion("Mis canciones");

    lista.agregarCancion("Canción 1");
    lista.agregarCancion("Canción 2");
    lista.agregarCancion("Canción 3");

    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

    lista.siguiente();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

    lista.siguiente();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

    lista.siguiente();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

    lista.anterior();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

    lista.anterior();
    lista.anterior();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());
}
