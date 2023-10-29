public class operador_ternario {
    public static void main(String[] args) {
        double salario = 6000;
        String menssagem = "tenho mais de 3000";
        String naodoar = "Não tenho mais de 3000";
        String resultado=salario>5000 ? menssagem:naodoar;
        int idade= 15;
        String maiordeidade= idade <15 ? "menor de idade": idade >= 15 && idade < 18 ?"jovem":"maior de idade";
        
        
        //sem operador ternario
        // if(salario<5000){
        //     resultado = menssagem;
        // }else{
        //     resultado=naodoar;
        // }
        System.out.println(resultado);
        System.out.println(maiordeidade);
    }
}
