public class Array_foreach {
    public static void main(String[] args) {
        String [] nomes=new String[]{"anderson","Mateus","Maria","Anna"};
        int [] numeros=new int[3];
        int[] numeros2={1,2,3,4,5,6};
        int [] numeros3=new int[]{1,2,3,4,5};
        for(int i=0 ;i<numeros2.length;i++){
            System.out.println(numeros2[i]);
        }
        for(int i=0;i<numeros3.length;i++){
            System.out.println(numeros3[i]);
        }
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        for(String nick:nomes){
            System.out.println(nick);
        }
    }
}
