package metodos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import objetos.Carro;
import objetos.Cliente;
import objetos.Nodo_Carro;
import objetos.Nodo_Cliente;

public class L_circular {
    private Nodo_Carro cabeza;
    private Nodo_Carro ultimo;
    
    public L_circular(){
    }
    
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
    
    public List listar_autos(){
        List<Carro> lista = new ArrayList();
        Nodo_Carro aux=cabeza;
        do{  
            Carro carro = new Carro();
            carro.setPlaca(aux.getDato().getPlaca());
            carro.setModelo(aux.getDato().getModelo());
            carro.setMarca(aux.getDato().getMarca());
            carro.setAño(aux.getDato().getAño());
            carro.setColor(aux.getDato().getColor());
            carro.setCilindraje(aux.getDato().getCilindraje());
            carro.setCombustible(aux.getDato().getCombustible());
            carro.setPasajeros(aux.getDato().getPasajeros());
            carro.setLlave(aux.getDato().getLlave());
            carro.setEstado(aux.getDato().getEstado());
            carro.setPrecio(aux.getDato().getPrecio());
            lista.add(carro);
            aux=aux.getNext();
        }while(aux!=cabeza);
        return lista;    
    }
    
    public void modificar(Carro dato,int placa){
        if(cabeza!=null){
            if(placa>=cabeza.getDato().getPlaca()&& 
                    placa <= ultimo.getDato().getPlaca()){
                Nodo_Carro aux = cabeza;
                while(aux!=ultimo && aux.getDato().getPlaca()<placa){
                    aux=aux.getNext();
                }
                if(aux.getDato().getPlaca()==placa) {
                    aux.getDato().setModelo(dato.getModelo());
                    aux.getDato().setMarca(dato.getMarca());                        
                    aux.getDato().setAño(dato.getAño());
                    aux.getDato().setColor(dato.getColor());
                    aux.getDato().setCilindraje(dato.getCilindraje());
                    aux.getDato().setCombustible(dato.getCombustible());
                    aux.getDato().setPasajeros(dato.getPasajeros());
                    aux.getDato().setLlave(dato.getLlave());
                    aux.getDato().setEstado(dato.getEstado());
                    aux.getDato().setPrecio(dato.getPrecio());
                }
                    aux=aux.getNext();
            }
        }
    }
    
    public void eliminar(int id){
        /*if(cabeza!=null){
            if(encuentra(id)){
                if(cabeza.getDato().getPlaca()<=id && id<= ultimo.getDato().getPlaca()){
                    if(cabeza.getDato().getPlaca()==id){
                        cabeza = cabeza.getNext();
                        ultimo.setNext(cabeza);
                    }else{
                        Nodo_Carro aux = cabeza;
                        while(aux.getNext()!=cabeza && 
                             aux.getNext().getDato().getPlaca()<id){
                            aux = aux.getNext();
                        }
                        if(aux.getNext().getDato().getPlaca()==id){
                            if(aux.getNext()==ultimo){
                                ultimo=aux;
                            }
                            aux.setNext(aux.getNext().getNext());
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null,"NO se encontro");
            }
        }*/
        if(cabeza!=null){
            if (encuentra(id)) {
                // Consulta si el nodo a eliminar es el pirmero
                if (cabeza.getDato().getPlaca() == id) {
                    // El primer nodo apunta al siguiente.
                    cabeza = cabeza.getNext();
                    // Apuntamos con el ultimo nodo de la lista al inicio.
                    ultimo.setNext(cabeza); 
                } else{
                    // Crea ua copia de la lista.
                    Nodo_Carro aux = cabeza;
                    // Recorre la lista hasta llegar al nodo anterior 
                    // al de referencia.
                    while(aux.getNext().getDato().getPlaca() != id){
                        aux = aux.getNext();
                    }
                    if (aux.getNext() == ultimo) {
                        aux.setNext(cabeza);
                        ultimo = aux;
                    } else {
                        // Guarda el nodo siguiente del nodo a eliminar.
                        Nodo_Carro siguiente = aux.getNext();
                        // Enlaza el nodo anterior al de eliminar con el 
                        // sguiente despues de el.
                        aux.setNext(siguiente.getNext());  
                        // Actualizamos el puntero del ultimo nodo
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "no se encontro");
            }
        }
    }
    
    public boolean encuentra(int placa){
        boolean ex =false;
        if(cabeza!=null){
           if(placa >= cabeza.getDato().getPlaca() && placa <= ultimo.getDato().getPlaca()){
               Nodo_Carro aux=cabeza;
               while (aux!= ultimo && aux.getDato().getPlaca()<placa){
                   aux=aux.getNext();
               } 
               ex=(aux.getDato().getPlaca()==placa);
            }else{
               JOptionPane.showMessageDialog(null, "No esta");
           }
        }
        return ex;
    }
    
    public String toString(){
        String s="";
        Nodo_Carro aux=cabeza;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getNext();
        }
        return s;
    }
}
