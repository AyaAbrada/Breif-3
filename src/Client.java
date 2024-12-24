import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private static int compteur;
    int Id;
    String Nom;
    String Prenom;
    String Email;
    String Adresse;
    int Telephone;

    static ArrayList<Client> client = new ArrayList<>();

    public int getId() {

        return Id;
    }
    public void setId(int id) {

        this.Id = id;
    }
    public String getNom() {

        return Nom;
    }
    public void setNom(String nom) {

        Nom = nom;
    }
    public String getPrenom() {

        return Prenom;
    }
    public void setPrenom(String prenom) {

        Prenom = prenom;
    }
    public String getEmail() {

        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getAdresse() {

        return Adresse;
    }
    public void setAdresse(String adresse) {

        Adresse = adresse;
    }
    public int getTelephone() {

        return Telephone;
    }
    public void setTelephone(int telephone) {
        Telephone = telephone;
    }
    public Client( String nom, String prenom, String email, String adresse, int telephone) {
        this.Id = compteur;
        Nom = nom;
        Prenom = prenom;
        Email = email;
        Adresse = adresse;
        Telephone = telephone;
        compteur++;
    }

    public static void GestionClient() {
        int choix;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("_______Gestion des clients_______");
            System.out.println("1. Ajouter client");
            System.out.println("2. Afficher client");
            System.out.println("Entrer votre choix");
            choix = scan.nextInt();
            switch (choix) {
                case 1:
                    AjouterClients();
                    break;
                case 2:
                    AfficherClients();
                    break;
            }
        } while (choix != 0);
    }
    public static void AjouterClients(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer le nom du client");
        String nom = scan.next();
        System.out.println("Entrer le prénom du client");
        String prenom = scan.next();
        System.out.println("Entrer l'Email du client");
        String email = scan.next();
        System.out.println("Entrer l'adresse du client");
        String adresse = scan.next();
        scan.nextLine();
        System.out.println("Entrer le numéro de téléphone du client");
        int telephone = scan.nextInt();

        Client CLIENT = new Client (nom, prenom, email, adresse, telephone);
        client.add(new Client(nom ,  prenom,  email,  adresse, telephone));

        }

    public static void AfficherClients(){
        if (client.isEmpty()) {
            System.out.println("Aucun client a afficher");
        }else {
           for (Client CLIENT : client){
               System.out.println(" Nom: " + CLIENT.getNom() + " Prénom " + CLIENT.getPrenom() + " Email: " + CLIENT.getEmail() + " Adresse: " + CLIENT.getAdresse() + " Numéro de téléphone " + CLIENT.getTelephone() + " Id: " + CLIENT.getId());

            }


        }

    }
    }

