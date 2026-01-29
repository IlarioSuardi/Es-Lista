public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        //accoda
        lista.accoda("a");
        lista.accoda("b");
        lista.accoda("d");

        System.out.println("ACCODA: Lista iniziale: " + lista);

        //inserisci e elimina
        lista.inserisci("c", 2);
        lista.elimina(1);

        System.out.println("INSERISCI/ELIMINA: Lista: " + lista);

        //leggi
        for(int i=0; i < lista.getSize(); i++) {
            System.out.println("LEGGI: Elemento in posizione " + i + ": " + lista.leggi(i));
        }

        //ricerca
        int indice = lista.ricerca("c");
        if (indice != -1) {
            System.out.println("RICERCA: Valore trovato in posizione: " + indice);
        } else {
            System.out.println("RICERCA: Valore non trovato");
        }

        //eliminazione completa
        lista.eliminazioneCompleta("a");
        System.out.println("ELIMINAZIONE COMPLETA: Lista: " + lista);

        //visita con cursore
        lista.setCursor(lista.getHead());
        System.out.println("VISITA CON IL CURSORE: " + lista.visita() + ", " + lista.visita());

        //inserimento ordinato
        lista.inserimentoOrdinato("b");
        lista.inserimentoOrdinato("a");
        lista.inserimentoOrdinato("z");
        lista.setCursor(lista.getHead());
        System.out.println("INSERISCI ORDINATO: Lista: " + lista.visita() + ", " + lista.visita() + ", " + lista.visita() + ", " + lista.visita() + ", " + lista.visita());
    }
}