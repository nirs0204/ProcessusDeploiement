package model;
import java.util.*;

public class Employer{
    public int id_employee;
    public String nom;
    public String prenom;
    public Date date_naissance;
    public int genre;
    public int niv_etude;
    public Employer() {
    }

    public Employer( int id_employee,String nom, String prenom, Date date_naissance, int genre, int niv_etude) {
        setId_employee(niv_etude);
        setnom(nom);
        setprenom(prenom);
        setdate_naissance(date_naissance); 
        setgenre(genre);
        setniv_etude(niv_etude);
    }
    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getNom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }
    public void setdate_naissance(Date date_naissance) {
        try {    
        Date dateActuel=new Date();
        int diff = dateActuel.getYear() - date_naissance.getYear();
        if (diff >= 18) {
            this.date_naissance = date_naissance;
        } else {
            throw new Exception("Age incompatible");
        }  
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

    public int getGenre() {
        return genre;
    }

    public void setgenre(int genre) {
        this.genre = genre;
    }

    public int getNiv_etude() {
        return niv_etude;
    }

    public void setniv_etude(int niv_etude) {
        this.niv_etude = niv_etude;
    }

}
