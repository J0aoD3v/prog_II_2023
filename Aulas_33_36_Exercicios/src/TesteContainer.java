public class TesteContainer {
    public static void main(String[] args) {
        Container container1 = new Container();
        container1.setCapacidade(50.0);
        container1.setOcupado(false);
        System.out.println("Capacidade: " + container1.getCapacidade());
        System.out.println("Ocupado: " + container1.isOcupado());
        System.out.println("Ocupou o container? " + container1.ocupar(30.0));
        System.out.println("Ocupado: " + container1.isOcupado());

        Container container2 = new Container(100.0, true);
        System.out.println("Capacidade: " + container2.getCapacidade());
        System.out.println("Ocupado: " + container2.isOcupado());
        System.out.println("Ocupou o container? " + container2.ocupar(120.0));
    }
}
