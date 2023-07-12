package CampamentPackage.domain;

import java.sql.Date;

public class Campament {
    private int id;
    private String nom;
    private Date dataInici;
    private Date dataFinal;
    private String descripcio;
    public Campament() {}

    public Campament(int id, String nom, Date dataInici, Date dataFinal, String descripcio) {
        this.id = id;
        this.nom = nom;
        this.dataInici = dataInici;
        this.dataFinal = dataFinal;
        this.descripcio = descripcio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
}
