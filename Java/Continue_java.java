public class Continue_java {
    public static void main(String[] args) {
        double valortotal=30000;
        for (int parcela = (int) valortotal; parcela >= 1; parcela--) {
            double valorparcela=valortotal/parcela;
            if (valorparcela<1000) {
                continue;
            }
            System.out.println("Parcela "+ parcela + "x R$:"+ valorparcela);
        }
    }
}
