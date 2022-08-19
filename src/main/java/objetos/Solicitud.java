package objetos;

public class Solicitud {
    private int dias;
    private int pasajeros;
    private String marca;
    private String modelo;
    private int año;

    public Solicitud(int dias, int pasajeros, String marca, String modelo, int año) {
        this.dias = dias;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Solicitud() {
        }
    
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
