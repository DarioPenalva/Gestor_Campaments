package CampamentPackage.domain;

public class Recepta {
    private int id;
    private int id_alergen;
    private String nom;
    private String descripcio;
    private int pax;
    public Recepta() {}

    public Recepta(int id, int id_alergen, String nom, String descripcio, int pax) {
        this.id = id;
        this.id_alergen = id_alergen;
        this.nom = nom;
        this.descripcio = descripcio;
        this.pax = pax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_alergen() {
        return id_alergen;
    }

    public void setId_alergen(int id_alergen) {
        this.id_alergen = id_alergen;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }
}
