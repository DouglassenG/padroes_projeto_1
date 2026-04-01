public class SemContratosFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Car(120, "gasolina", "cinza");  // econômico premium
            case "B":
                return new Car(100, "gasolina", "preto");  // econômico
            default:
                return new Car(100, "gasolina", "preto");  // econômico
        }
    }
}
