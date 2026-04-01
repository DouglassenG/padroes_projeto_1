public class Demo {
    public static void main(String[] args) {
        Customer cliente = new Customer("B", true);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.isApproved()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}
