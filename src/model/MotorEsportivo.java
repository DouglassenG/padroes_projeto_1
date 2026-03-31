package model;

// MOTOR ESPORTIVO
// Motor potente feito para o carro esportivo.
// Implementa a interface Motor.

public class MotorEsportivo implements Motor {

    @Override
    public String getTipoMotor() {
        return "V8 Turbo";
    }

    @Override
    public int getPotencia() {
        return 450; // 450 cavalos
    }

    @Override
    public void exibirEspecificacoes() {
        System.out.println("  Motor: " + getTipoMotor());
        System.out.println("  Potencia: " + getPotencia() + " cv");
        System.out.println("  Combustivel: Gasolina Premium");
    }
}