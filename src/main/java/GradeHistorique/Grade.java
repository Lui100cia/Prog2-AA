package GradeHistorique;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Student etudiant;
    private Exam examen;
    private double valeur;
    private List<String> historique = new ArrayList<>();

    public Grade(Student etudiant, Exam examen, double valeurInitiale) {
        this.etudiant = etudiant;
        this.examen = examen;
        this.valeur = valeurInitiale;
        historique.add("Note initiale : " + valeurInitiale + " à " + Instant.now());
    }

    public void changerValeur(double nouvelleValeur, String motif) {
        historique.add("Changement de " + valeur + " à " + nouvelleValeur + " (" + motif + ") - " + Instant.now());
        this.valeur = nouvelleValeur;
    }

    public double getValeur() { return valeur; }
    public Exam getExamen() { return examen; }
    public Student getEtudiant() { return etudiant; }
}

