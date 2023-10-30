public class Etudiant  {
    private int id;
    private String nom;
    private String prenom;
    private float moyenne;
}
public Etudiant (int i , String n , String p , float m) {
    this.id=i;
    this.name=n;
    this.prenom=p;
    this.moyenne=m;
}
public int getIdentifiant() {
       return identifiant;
   }

   public void setIdentifiant(int identifiant) {
       this.identifiant = identifiant;
   }


   public String getNom() {
       return nom;
   }

   public void setNom(String nom) {
       this.nom = nom;
   }


   public String getPrenom() {
       return prenom;
   }

   public void setPrenom(String prenom) {
       this.prenom = prenom;
   }
   

   public float getMoyenne() {
       return moyenne;
   }

   public void setMoyenne(int moyenne) {
       this.moyenne = moyenne;
   }
@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		return id == other.id && Objects.equals(nom, other.nom);
	}
    
public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
