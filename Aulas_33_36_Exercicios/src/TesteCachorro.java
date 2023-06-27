public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Rex");
        cachorro1.setRaca("Labrador");
        System.out.println("Nome: " + cachorro1.getNome());
        System.out.println("Raça: " + cachorro1.getRaca());
        cachorro1.latir();
        cachorro1.latirRepetido(3);
        
        Cachorro cachorro2 = new Cachorro("Fido");
        System.out.println("Nome: " + cachorro2.getNome());
        System.out.println("Raça: " + cachorro2.getRaca());
        cachorro2.latir();
        cachorro2.latirRepetido(-2);
        
        Cachorro cachorro3 = new Cachorro("Vira-lata", "Bob");
        System.out.println("Nome: " + cachorro3.getNome());
        System.out.println("Raça: " + cachorro3.getRaca());
        cachorro3.latir();
        cachorro3.latirRepetido(150);
    }
}
