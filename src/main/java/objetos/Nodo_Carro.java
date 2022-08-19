package objetos;

public class Nodo_Carro {
    Carro dato;
    private Nodo_Carro next;

    public Nodo_Carro(Carro dato) {
        this.dato = dato;
    }

    public Nodo_Carro() {
    }

    public Carro getDato() {
        return dato;
    }

    public void setDato(Carro dato) {
        this.dato = dato;
    }

    public Nodo_Carro getNext() {
        return next;
    }

    public void setNext(Nodo_Carro next) {
        this.next = next;
    }
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+this.dato+"}";
    }
}
