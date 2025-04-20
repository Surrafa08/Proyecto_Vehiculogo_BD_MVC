package modelo;

public class Carro {
    private String placa;
    private String marca;
    private String ano;
    private String color;
    private String combustible;
    private String caracteristicas;

    public Carro(String placa, String marca, String ano, String color, String combustible, String caracteristicas) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.color = color;
        this.combustible = combustible;
        this.caracteristicas = caracteristicas;
    }
    
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getAno() { return ano; }
    public String getColor() { return color; }
    public String getCombustible() { return combustible; }
    public String getCaracteristicas() { return caracteristicas; }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", ano='" + ano + '\'' +
                ", color='" + color + '\'' +
                ", combustible='" + combustible + '\'' +
                ", caracteristicas='" + caracteristicas + '\'' +
                '}';
    }
}
