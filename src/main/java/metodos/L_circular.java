package metodos;

import objetos.Carro;
import objetos.Nodo_Carro;

public class L_circular {
    private Nodo_Carro cabeza;
    private Nodo_Carro ultimo;
    
    public void insertar(Carro c){
        if (cabeza==null){
            cabeza=new Nodo_Carro(c);
            ultimo=cabeza;
            ultimo.setNext(cabeza);
        }else if(c.getPlaca() < cabeza.getDato().getPlaca()){
             Nodo_Carro aux = new Nodo_Carro(c);
             aux.setNext(cabeza);
             cabeza=aux;
             ultimo.setNext(cabeza);
        } else if (ultimo.getDato().getPlaca()<=c.getPlaca()){
            ultimo.setNext(new Nodo_Carro(c));
            ultimo=ultimo.getNext();
            ultimo.setNext(cabeza);
        }else{
            Nodo_Carro aux = cabeza;
            while (aux.getNext().getDato().getPlaca()<c.getPlaca()) {
                aux=aux.getNext();
            }
            Nodo_Carro temp = new Nodo_Carro(c);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
        ultimo.setNext(cabeza);
    }
}
