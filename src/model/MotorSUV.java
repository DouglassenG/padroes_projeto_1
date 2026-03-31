package model;

// MOTOR SUV
// Motor robusto feito para o SUV.
// Implementa a interface Motor.

public class MotorSUV implements Motor {

    @Override
    public String getTipoMotor() {
        return "4 Cilindros Diesel";
    }

    @Override
    public int getPotencia() {
        return 200; // 200 cavalos
    }

    @Override
    public void exibirEspecificacoes() {
        System.out.println("  Motor: " + getTipoMotor());
        System.out.println("  Potencia: " + getPotencia() + " cv");
        System.out.println("  Combustivel: Diesel");
    }
}