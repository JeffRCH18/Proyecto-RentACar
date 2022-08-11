package objetos;
public class Nodo_Cliente {
    Cliente dato;
    public Nodo_Cliente atras;

    public Nodo_Cliente(Cliente dato) {
        this.dato = dato;
    }

    public Nodo_Cliente() {
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }
    

    public Nodo_Cliente getAtras() {
        return atras;
    }

    public void setAtras(Nodo_Cliente atras) {
        this.atras = atras;
    }
    @Override
    public String toString(){
        return "Nodo{"+"dato="+this.dato+"}";
    }

}
