package objetos;
public class Nodo_Solicitud {
    Solicitud dato;
    private Nodo_Solicitud next;

    public Nodo_Solicitud(Solicitud dato) {
        this.dato = dato;
    }

    public Solicitud getDato() {
        return dato;
    }

    public void setDato(Solicitud dato) {
        this.dato = dato;
    }

    public Nodo_Solicitud getNext() {
        return next;
    }

    public void setNext(Nodo_Solicitud next) {
        this.next = next;
    }
    
    
}
