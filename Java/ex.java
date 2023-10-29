public class ex {
    public static void main(String[] args) {
        double salario_anual=7000;
        double primeirafaixa = 9.70/100;
        double segundafaixa = 37.35/100;
        double terceirafaixa = 49.50/100;
        double valorimposto;

        if (salario_anual<=34712) {
            valorimposto = salario_anual*primeirafaixa;
        }else if (salario_anual>=34713&&salario_anual<=68587) {
            valorimposto=salario_anual*segundafaixa;
        }else{
            valorimposto=salario_anual*terceirafaixa;
        }
        System.out.println(valorimposto);
    }
}
