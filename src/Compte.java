import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choix;
        do {
            System.out.println("_______Menu_______");
            System.out.println("1. Gérer les clients");
            System.out.println("2. Gérer les comptes");
            System.out.println("3. Gérer les opération");
            System.out.println("4. Effectuer un filtrage");
            System.out.println("Entrer votre choix");
            choix = scan.nextInt();
            switch (choix) {
                case 1:
                    Client.GestionClient();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (choix != 0);
    }
}
