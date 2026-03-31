package model;

// INTERFACE MOTOR
// Assim como o Carro, o Motor também é um "produto" da nossa fábrica.
// Cada tipo de fábrica vai criar um motor diferente.

public interface Motor {

    String getTipoMotor();

    int getPotencia(); // em cavalos (cv)

    void exibirEspecificacoes();

}