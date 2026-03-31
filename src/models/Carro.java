package model;

// INTERFACE CARRO
// Essa é a "planta" que todo carro deve seguir.
// Qualquer tipo de carro que a gente criar precisa ter esses métodos.

public interface Carro {

    String getNome();

    String getTipo();

    void exibirDetalhes();
}