package objetos;
public class Carro {
    private int placa;
    private String marca;
    private String modelo;
    private double anio;
    private String color;
    private String cilindraje;
    private String ccombustible;
    private int pasajeros;
    private double precio;
    //lista circular

    public Carro(int placa, String marca, String modelo, double anio, String color, String cilindraje, String ccombustible, int pasajeros, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.cilindraje = cilindraje;
        this.ccombustible = ccombustible;
        this.pasajeros = pasajeros;
        this.precio = precio;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
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

    public double getAnio() {
        return anio;
    }

    public void setAnio(double anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCcombustible() {
        return ccombustible;
    }

    public void setCcombustible(String ccombustible) {
        this.ccombustible = ccombustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
