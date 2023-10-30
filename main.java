public class Main {
    public static void main(String[] args) {
        Ecole ecole1 = new Ecole();
        Ecole ecole2 = new Ecole();

        Etudiant3eme etudiant3A1 = new Etudiant3eme(1, "Alice", 15.0);
        EtudiantAlternance etudiantAlt1 = new EtudiantAlternance(2, "Bob", 1000.0);

        ecole1.ajouterEtudiant(etudiant3A1);
        ecole1.ajouterEtudiant(etudiantAlt1);

        System.out.println(ecole1);
        System.out.println("Moyenne des étudiants 3A: " + ecole1.getMoyenneDes3A());
        System.out.println("Moyenne des salaires des alternants: " + ecole1.moyenneSalaireAlternants());

        ecole1.changerEcole(etudiantAlt1, ecole2);
        System.out.println(ecole1);
        System.out.println(ecole2);
    }
}