public class breack_ex {
    public static void main(String[] args) {
        double valortotal=30000;
        int j=1;
        do {
            double valorparcela=valortotal/j;
            if(valorparcela>=1000){
                System.out.println("parcela "+j+" ou "+valorparcela);
            }else{
                break;
            }        
            j++;
        } while (j<=valortotal);
    }
}
