package metodos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import objetos.Cliente;
import objetos.Nodo_Cliente;

public class cola {
    private Nodo_Cliente frente;
    private Nodo_Cliente ultimo;

    public cola() {
    }
    
    public void encola(Cliente c){
        Nodo_Cliente d =new Nodo_Cliente(c);
        if(frente == null){ // la cola esta vacia
            frente=d;
            ultimo=d;
        }else{
            ultimo.setAtras(d);
            ultimo=d;
        }
    }
    
    public List buscarJuegos(){
        List<Cliente> lista = new ArrayList();
        Nodo_Cliente aux=frente;
        while(aux!=null){  
                Cliente cliente = new Cliente();
                cliente.setCedula(aux.getDato().getCedula());
                cliente.setNombre(aux.getDato().getNombre());
                cliente.setCorreo(aux.getDato().getCorreo());
                cliente.setFecha(aux.getDato().getFecha());
                cliente.setCategoria(aux.getDato().getCategoria());
                lista.add(cliente);
                aux=aux.getAtras();
            }
        return lista;    
    }
    
    public List buscar(String cedula){
        List<Cliente> lista = new ArrayList();
        Nodo_Cliente actual=frente;
        if(frente!=null){
            if(encuentra(cedula)){
                while(actual!=null){
                    if(actual.getDato().getCedula().equals(cedula)){
                        Cliente cliente = new Cliente();
                        cliente.setCedula(actual.getDato().getCedula());
                        cliente.setNombre(actual.getDato().getNombre());
                        cliente.setCorreo(actual.getDato().getCorreo());
                        cliente.setFecha(actual.getDato().getFecha());
                        cliente.setCategoria(actual.getDato().getCategoria());
                        lista.add(cliente);
                    }
                    actual=actual.getAtras();
                }
            }else{
                System.out.println("Dato NO encontrado");
            }
        }else{
            System.out.println("cola nula");
        }
        return lista;
    }
    
    public boolean encuentra(String cedula){
        Nodo_Cliente posicion = frente;
        boolean ex =false;
        if(frente!=null){
            while(ex != true && posicion != null){
                if(posicion.getDato().getCedula().equals(cedula)){
                    ex = true;
                }else{
                    posicion=posicion.getAtras();
                }
            }
        }else{
            System.out.println("vacia");
        }
        return ex;
    }
    
    public void b (String cedula) {
        //String code = JOptionPane.showInputDialog(null, "Código: ","Juego a eliminar",JOptionPane.QUESTION_MESSAGE);
        Nodo_Cliente actual=frente;
        Nodo_Cliente Aux = null;
        if(frente!=null){
            if(encuentra(cedula)){
                while(actual!=null){
                    if(actual.getDato().getCedula().equals(cedula)){
                        if(actual==frente){
                            frente=frente.atras;
                        }else if(actual==ultimo){
                            Aux.atras=null;
                            ultimo=Aux;
                        }else{
                            Aux.atras=actual.atras;
                        }
                        System.out.println("Nodo eliminado");
                    }
                    Aux=actual;
                    actual=actual.getAtras();
                         }
            }else{
                System.out.println("Dato NO encontrado");
            }
        } else{
            System.out.println("Cola vacia");
        }
    }

    public void modificar(Cliente dato,String ced){
        Nodo_Cliente actual = new Nodo_Cliente();
        actual=frente;
        if(frente!=null){
            if(encuentra(ced)){
                while(actual!=null){
                    if (actual.getDato().getCedula().equals(ced)) {
                        actual.getDato().setCedula(dato.getCedula());
                        actual.getDato().setNombre(dato.getNombre());                        
                        actual.getDato().setCorreo(dato.getCorreo());
                        actual.getDato().setFecha(dato.getFecha());
                        actual.getDato().setCategoria(dato.getCategoria());
                    }
                    actual=actual.getAtras();
                }
            }else{
                System.out.println("No encontrado");
            } 
        }else{
            System.out.println("No cola");
        }
    }
    
    public String toString(){
        String s="";
        Nodo_Cliente aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}
