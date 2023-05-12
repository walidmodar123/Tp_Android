package com.example.tp1_android;

import android.graphics.Bitmap;

import java.util.List;

public class Etudiant {
    private int id;
    private String nom,prenom,classe,phone;
    private Bitmap photo;
    private List<Notes> notes;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Bitmap getPhoto() {
        return photo;
    }

    public String getClasse() {
        return classe;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPhoto(Bitmap photo) {
        this.photo = photo;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

    public Etudiant(int id, String nom, String prenom, String classe, String phone, Bitmap photo,List<Notes> notes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.phone = phone;
        this.photo = photo;
        this.notes = notes;
    }
}
