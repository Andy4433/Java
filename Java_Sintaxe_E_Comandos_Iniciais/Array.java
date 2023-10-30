public class Array {
    public static void main(String[] args) {
        // []<-- mostra que esta sendo um array
        // array usamos para declar variaveis do tipo references
        // variavei do tipo reference podemos inicializar como null, variaveis do tipo primitivo não podem.
        // ex= int[]idade=null;
        // para byte, short, int, double, float, long = 0
        // para char ="\u0000"
        // booleano false
        // Strnig=null
        int[]idades=new int[4];
        idades[0]=15;
        idades[1]=18;
        idades[2]=(int) 30f;
        for(int i =0;i<=idades.length;i++){
            System.out.println(idades[i]);
        }

    }
}
