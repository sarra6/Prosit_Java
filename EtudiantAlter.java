public class EtudiantAlter extends Etudiant 
{
   private int salaire;
}
public int getsalaire() {
       return salaire;
}

public void setsalaire(String salaire) {
       this.salaire = salaire;
}
public void ajouterUneAbsence() {
salaire -= 50;
}
public String toString() {
        return "EtudiantAlter{" +
                "salaire=" + salaire +
                '}';
    }
public float moyenneSalaireAlternants(){
    float y=0;
    int k=0;

    for (int i = 0; i < nbEtudiant; i++) {

        if (E[i] instanceof EtudiantAlter){

            y+=((EtudiantAlter)E[i]).getSalaire();
            k++;
        }
    }
    return w=y/k;

}