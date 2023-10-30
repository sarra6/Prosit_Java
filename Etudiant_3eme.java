public class Etudiant_3eme extends Etudiant 
{
    private String branche;
}
public int getbranche() {
       return branche;
   }

   public void setbranche(String branche) {
       this.branche = branche;
   }
public Etudiant (String b) {
    this.branche=b;
}
public void ajouterUneAbsence() {
 moyenne -= 0.5;
}
public float moyenneSalaireAlternants(){
    float y=0;
    int k=0;

    for (int i = 0; i < nbEtudiant; i++) {

        if (E[i] instanceof EtudiantAlternance){

            y+=((EtudiantAlternance)E[i]).getSalaire();
            k++;
        }
    }
    return w=y/k;

}

