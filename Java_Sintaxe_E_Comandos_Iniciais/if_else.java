import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o valor do PS5 (ou digite '0' para parar): ");
            int n1 = scanner.nextInt();

            if (n1 != 0) {
                System.out.println("Digite o quanto voce tem: ");
                int n2 = scanner.nextInt();

                if (n1 > n2) {
                    System.out.println("Não tem dinheiro " );
                } else if (n1 < n2) {
		            System.out.println("Tem bastante dinheiro dinheiro " );	
		        }else {
		            System.out.println("Pode comprar um PS5");	
		        }
            } else {
                System.out.println("Jogar xadrez em casa");
                continuar = false;
            }
        }
    }
}

