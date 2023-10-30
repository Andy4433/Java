public class CondicionalSwitch {
    public static void main(String[] args) {
        
        String diaf="FDS";
        String diautil="dia util";

        byte dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Domingo- "+diaf);
                break;
            case 2:
                System.out.println("Segunda- "+diautil);
                break;
            case 3:
                System.out.println("Terça- "+diautil);
                break;
            case 4:
                System.out.println("Quarta- "+diautil);
                break;
            case 5:
                System.out.println("Quinta- "+diautil);
                break;
            case 6:
                System.out.println("Sexta- "+diautil);
                break;
            case 7:
                System.out.println("Sabado- "+diaf);
                break;
            default:
                System.out.println("opção invalida");
                break;
        }

    }
}
