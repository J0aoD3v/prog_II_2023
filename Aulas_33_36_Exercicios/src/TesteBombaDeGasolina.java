public class TesteBombaDeGasolina {
    public static void main(String[] args) {
        BombaDeGasolina bomba = new BombaDeGasolina();
        System.out.println("Status da bomba: " + bomba.status());

        bomba.abastecerPorLitro(50);
        System.out.println("Litros vendidos: " + bomba.getLitrosVendidos());
        System.out.println("Valor vendido: " + bomba.getValorVendas());
        System.out.println("Status da bomba: " + bomba.status());

        bomba.abastecerPorDinheiro(100.0);
        System.out.println("Litros vendidos: " + bomba.getLitrosVendidos());
        System.out.println("Valor vendido: " + bomba.getValorVendas());
        System.out.println("Status da bomba: " + bomba.status());
    }
}
