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

    public void visita() {
        cursor=head;
        while (cursor!=null) {
            System.out.println(cursor.getValue());
            cursor=cursor.getNext();
        }
    }

    public void inserisci(String value) {
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

    public void elimina(String value){
        if (head==null) {
            return;
        }

        if (head.getValue().equals(value)) {
            head=head.getNext();
            size--;
            return;
        }

        cursor=head;
        while (cursor.getNext()!=null && !cursor.getNext().getValue().equals(value)) {
            cursor = cursor.getNext();
        }

        if (cursor.getNext()!=null) {
            cursor.setNext(cursor.getNext().getNext());
            size--;
        }
    }

    public String toString() {
       String risultato = "";
         cursor = head;
            while (cursor != null) {
                risultato = risultato + cursor.getValue() + " ";
                cursor = cursor.getNext();
            }
        return risultato;
    }
}
