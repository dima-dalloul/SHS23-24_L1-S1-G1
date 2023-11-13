import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] noms = new String[100];
        String[] numeros = new String[100];

        noms[0] = "DUPONT";
        numeros[0] = "0612345678";

        noms[1] = "MARTIN";
        numeros[1] = "0798765432";

        noms[2] = "_FIN";
        numeros[2] = "_FIN";

        Scanner s = new Scanner(System.in);
        String interaction = "";

        while(!interaction.equals("q")){
            System.out.print("(a)jouter (r)echerche (l)ister (q)uitter :");
            interaction = s.nextLine();

            if(interaction.equals("a")){
                System.out.print("Nom à ajouter ?");
                String nomAjout = s.nextLine();
                System.out.print("Numéro à ajouter ?");
                String numeroAjout = s.nextLine();

                ajouter(noms, numeros, nomAjout, numeroAjout);
            } else if(interaction.equals("r")){
                System.out.print("Nom recherché ?");
                String nomRecherche = s.nextLine();

                System.out.println(rechercher(noms, numeros, nomRecherche));
            } else if(interaction.equals("l")){
                afficherContenu(noms, numeros);
            } else if(interaction.equals("q")){
                System.out.print("Au revoir");
            }
        }
    }

    private static void afficherContenu(String[] noms, String[] numeros) {
        for(int i = 0; i < noms.length && noms[i] != null; i++){
            if(noms[i] != "_FIN"){
                System.out.println(noms[i] + " " + numeros[i]);
            }
        }
    }

    private static String rechercher(String[] noms, String[] numeros, String nomRecherche) {
        for(int i = 0; i < noms.length && noms[i] != null; i++){
            if(noms[i].equals(nomRecherche))
                return numeros[i];
        }

        return "Aucun numéro trouvé";
    }

    private static void ajouter(String[] noms, String[] numeros, String nomAjout, String numeroAjout) {
        int i=0;
        while (!noms[i].equals("_FIN") && !noms[i].equals(nomAjout)){
            i++;
        }

        if (!noms[i].equals("_FIN")) {
            System.out.println(nomAjout + " est déjà dans l'annuaire.");
        } else {
            if (i == noms.length)
                System.out.println("Le tableau est plein.");
            else {
                noms[i+1] = "_FIN";
                numeros[i+1] = "_FIN";
                noms[i] = nomAjout;
                numeros[i] = numeroAjout;
            }
        }
    }
}