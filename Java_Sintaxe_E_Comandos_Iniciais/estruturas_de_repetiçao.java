public class estruturas_de_repetiçao {
    public static void main(String[] args) {
        // while, do while, for
        System.out.println("loop while:");
        int count=0;
        while(count<=10){
            System.out.println(count);
            count++; // mesma coisa que count=count+1; ou count+=1;
        }

        System.out.println("\nloop do-while:");
        int i =0;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        System.out.println("\nloop for:");
        for(int x =0; x<=10;x++){
            System.err.println(x);
        } // for é bastante usado em Arrays
    }
}
