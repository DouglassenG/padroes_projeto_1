public class ContratosFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Car(300, "eletrico", "vermelho");   // premium
            case "B":
                return new Car(200, "gasolina", "azul");       // padrão
            default:
                return new Car(150, "gasolina", "branco");     // básico
        }
    }
}
