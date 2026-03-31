package model;

// CARRO SUV
// Outro "produto concreto" que implementa a interface Carro.
// Diferente do esportivo, o SUV tem outras características.

public class CarroSUV implements Carro {

    @Override
    public String getNome() {
        return "SUV Familia Adventure";
    }

    @Override
    public String getTipo() {
        return "SUV";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=================================");
        System.out.println("  SUV FAMILIA ADVENTURE");
        System.out.println("  Tipo: " + getTipo());
        System.out.println("  4 portas, alto, espacoso");
        System.out.println("  Velocidade maxima: 200 km/h");
        System.out.println("=================================");
    }
}