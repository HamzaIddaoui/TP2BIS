
import java.util.Arrays;
import java.util.Scanner;

public class MainChambre {

    private Chambre[] Tab;

    public MainChambre() {
        this.Tab = new Chambre[3];
    }

    public static Chambre SaisirChambre(Scanner sc) throws PrixException,CapacityException{
        int n,cap,cat;
        float p;
        System.out.println("Saisir numero : ");
        n = sc.nextInt();
        System.out.println("Saisir capacite : ");
        cap = sc.nextInt();
        if ((cap < 1)||(cap > 4)) throw new CapacityException();
        System.out.println("Saisir categorie : ");
        cat = sc.nextInt();
        System.out.println("Saisir prix : ");
        p = sc.nextFloat();
        if (p <= 0) throw new PrixException();
        Chambre chambre = new Chambre(n,cat,p,cap,Etat.L);
        return chambre;
    }


    public void SaisirTableau(Scanner sc) throws PrixException, CapacityException{
        for (int i = 0; i < this.Tab.length; i++)
            this.Tab[i] = SaisirChambre(sc);
    }

    public void AfficherParCategorie(int category) {
        for ( Chambre chambre : this.Tab ) {
            if(chambre.get_Categorie() == category) System.out.println(chambre);
        }
    }

    public int IndiceMin(int i, int j){
        int min_capacite;
        int indice;
        indice = i;
        min_capacite = this.Tab[i].get_Capacite();
        for (int k = i; k < j+1; k++) {
            if(this.Tab[k].get_Capacite() < min_capacite) {
                min_capacite = this.Tab[k].get_Capacite();
                indice = k;
            }
        }
        return indice;
    }

    public void EchangerIndice(int i, int j) {
        Chambre chambretmp;
        chambretmp = this.Tab[i];
        this.Tab[i] = this.Tab[j];
        this.Tab[j] = chambretmp;
    }

    public void TrierParCapacity() {
        Chambre chambretmp;
        int min;
        for (int i = 0; i < this.Tab.length; i++) {
            min = IndiceMin(i,this.Tab.length-1);
            EchangerIndice(i,min);
        }

    }

    @Override
    public String toString() {
        return "MainChambre{" +
                "Tab=" + Arrays.toString(Tab) +
                '}';
    }

    public static void main(String[] args)
    {
        MainChambre mainchambre = new MainChambre();
        Scanner sc = new Scanner(System.in);
        try {
            mainchambre.SaisirTableau(sc);
            mainchambre.AfficherParCategorie(6);
            mainchambre.TrierParCapacity();
            System.out.println(mainchambre);

        } catch (Exception e ) {
            System.out.println(e);
        }



    }

}
