public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.accoda("a");
        lista.accoda("b");
        lista.accoda("d");

        System.out.println("Lista iniziale: " + lista);

        lista.inserisci("c", 2);
        lista.elimina(1);

        System.out.println("Lista modificata: " + lista);

        for(int i=0; i < lista.getSize(); i++) {
            System.out.println("Elemento in posizione " + i + ": " + lista.leggi(i));
        }

        lista.setCursor(lista.getHead());
        System.out.println("Visite con il cursore:");
        System.out.println(lista.visita());
        System.out.println(lista.visita());
        System.out.println(lista.visita());
        System.out.println(lista.visita());

    }
}