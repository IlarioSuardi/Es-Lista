public class Lista {
    private int size;
    private Nodo head;
    private Nodo cursor;

    public Lista() {
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }

    public int getSize() {
        return size;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getCursor() {
        return cursor;
    }

    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }

    public void accoda(String value) {
        Nodo nuovoNodo = new Nodo(value);
        if (head == null) {
            head = nuovoNodo;
        } else {
            Nodo t = head;
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(nuovoNodo);
        }
        size++;
    }

    public String visita() {
        if (cursor == null) {
            return null;
        }
        String valore = cursor.getValue();
        cursor = cursor.getNext();
        return valore;
    }

    public String leggi(int indice) {
        if (indice < 0 || indice >= size) {
            return "inserire un valore valido";
        }
        Nodo t = head;
        for (int i = 0; i < indice; i++) {
            t = t.getNext();
        }
        return t.getValue();
    }

    public void inserisci(String value, int indice) {
        if (indice < 0 || indice > size) {
            return;
        }
        Nodo nuovoNodo = new Nodo(value);
        if (indice == 0) {
            nuovoNodo.setNext(head);
            head = nuovoNodo;
        } else {
            Nodo t = head;
            for (int i = 0; i < indice - 1; i++) {
                t = t.getNext();
            }
            nuovoNodo.setNext(t.getNext());
            t.setNext(nuovoNodo);
        }
        size++;
    }

    public void elimina(int indice) {
        if (indice < 0 || indice >= size) {
            return;
        }
        if (indice == 0) {
            head = head.getNext();
        } else {
            Nodo t = head;
            for (int i = 0; i < indice - 1; i++) {
                t = t.getNext();
            }
            t.setNext(t.getNext().getNext());
        }
        size--;
    }

    public void eliminazioneCompleta(String value) {
        while (head != null && head.getValue().equals(value)) {
            head = head.getNext();
            size--;
        }
        if (head == null) return;
        Nodo t = head;
        while (t.getNext() != null) {
            if (t.getNext().getValue().equals(value)) {
                t.setNext(t.getNext().getNext());
                size--;
            } else {
                t = t.getNext();
            }
        }
    }

    public int ricerca(String valore) {
        Nodo t = head;
        int indice = 0;
        while (t != null) {
            if (t.getValue().equals(valore)) {
                return indice;
            }
            t = t.getNext();
            indice++;
        }
        return -1;
    }

    public void inserimentoOrdinato(String value) {
        Nodo nuovo = new Nodo(value);

        if (head == null || head.getValue().compareTo(value) > 0) {
            nuovo.setNext(head);
            head = nuovo;
            size++;
            return;
        }

        Nodo corrente = head;

        while (corrente.getNext() != null) {
            if (corrente.getNext().getValue().compareTo(value) > 0) {
                break;
            }

            corrente = corrente.getNext();
        }

        nuovo.setNext(corrente.getNext());
        corrente.setNext(nuovo);
        size++;
    }

    public String toString() {
        return "[size = " + size + ", head = " + head + "cursor = " + cursor + "]";
    }
}