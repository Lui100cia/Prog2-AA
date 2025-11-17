package GradeHistorique;


import java.time.LocalDate;

public class Student {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String telephone;
    private String groupe;
    private Tutor tuteur;

    public Student(int id, String nom, String prenom, LocalDate dateNaissance,
                   String email, String telephone, String groupe, Tutor tuteur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.groupe = groupe;
        this.tuteur = tuteur;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
}

