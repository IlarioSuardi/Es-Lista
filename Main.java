public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.accoda("a");
        lista.accoda("b");
        lista.accoda("c");

        System.out.println("Lista: " + lista);

        System.out.println("Elemento in posizione 1: " + lista.leggi(1));

        lista.setCursor(lista.getHead());
        System.out.println("Visita 3: " + lista.visita());
    }
}