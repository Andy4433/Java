public class Array_Matrizes02 {
    public static void main(String[] args) {
        int[][] arrayInt=new int[3][];
        int[][] arrayInt2={{0,0},{1,2,3},{1,2,3,4,5,6}};
        arrayInt[0]=new int[2];
        arrayInt[1]=new int[4];
        arrayInt[2]=new int[3];
   

        for(int[] arrayBase: arrayInt2){
            System.out.println("\n----------------------------------------------");
            for(int num: arrayBase){
                System.out.print(num +" ");
            }
        }
         System.out.println("\n----------------------------------------------");
    }
}
