public class Ecole {
private String name;
}
public int getname() {
       return name;
}

public void setname(String name) {
       this.name = name;
}
public Etudiant (String n) {
    this.name=n;
}
public Etudiant[] etudiants;

    public Ecole() {
        etudiants = new Etudiant[500];
    }
public void ajouterEtudiant(Etudiant e) {
if (nombreEtudiants < e.length) {
            etudiants[nombreEtudiants] = e;
            nombreEtudiants++;
        } else {
            System.out.println("L'école est pleine. Impossible d'ajouter plus d'étudiants.");
        }
 }
public int rechercher Etudiant(Etudiant e)
{
    for (i=0 , i<nombreEtudiants , i++)
    if (etudiant[i]=e)
    {
    return e
    }
    else {
        return -1;
    }
}
public void ajouterEtudiant(Etudiant e) {
    for (i=0 , i<nombreEtudiants , i++) {
        if (etudiant[i]=e)
        {
            return ('il existe un etudiant');

        }
        else {
            return ajouterEtudiant();
        }
    }
    }
   @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ecole: \n");
        for (Etudiant etudiant : etudiants) {
            sb.append(etudiant.toString()).append("\n");
        }
        return sb.toString();
    }

    public void changerEcole(Etudiant etd, Ecole nouvelleEcole) {
        if (etudiants.contains(etd)) {
            etudiants.remove(etd);
            nouvelleEcole.ajouterEtudiant(etd);
        }
    }





