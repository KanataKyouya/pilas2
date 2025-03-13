public class Vehiculo {
    private String Marca;
    private String Color;
    private Double Precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String color, Double precio) {
        Marca = marca;
        Color = color;
        Precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

}