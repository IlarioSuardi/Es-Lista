public class Lista {
    private int size;
    private Nodo head;
    private Nodo cursor;

    public Lista() {
        this.size=0;
        this.head=null;
        this.cursor=null;
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

    public void setSize(int size) {
        this.size=size;
    }

    public void setHead(Nodo head) {
        this.head=head;
    }

    public void setCursor(Nodo cursor) {
        this.cursor=cursor;
    }

    public void accoda(String value) {
        Nodo nuovoNodo=new Nodo(value);
        if (head==null) {
            head=nuovoNodo;
        } else {
            cursor=head;
            while (cursor.getNext()!=null) {
                cursor=cursor.getNext();
            }
            cursor.setNext(nuovoNodo);
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
            return null;
        }

        Nodo x = head;
        int i = 0;

        while (i < indice) {
            x = x.getNext();
            i++;
        }
        return x.getValue();
    }

    public String toString() {
        Nodo x = head;
        String risultato = "";

        while (x != null) {
            risultato = risultato + x.getValue() + " ";
            x = x.getNext();
        }
        return risultato;
    }
}
