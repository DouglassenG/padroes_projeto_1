package model;

// CARRO ESPORTIVO
// Essa classe implementa a interface Carro.
// É um dos "produtos concretos" da nossa fábrica.

public class CarroEsportivo implements Carro {

    @Override
    public String getNome() {
        return "Carro Esportivo Turbo";
    }

    @Override
    public String getTipo() {
        return "Esportivo";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=================================");
        System.out.println("  CARRO ESPORTIVO TURBO");
        System.out.println("  Tipo: " + getTipo());
        System.out.println("  2 portas, baixo, aerodinamico");
        System.out.println("  Velocidade maxima: 300 km/h");
        System.out.println("=================================");
    }
}