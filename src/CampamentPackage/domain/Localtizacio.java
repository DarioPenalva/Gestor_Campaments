package CampamentPackage.domain;

public class Localtizacio {
    private int id;
    private int id_DetallsLocalitzacio;
    private String nom;
    private String direccio;
    private String municipi;
    public Localtizacio() {}

    public Localtizacio(int id, int id_DetallsLocalitzacio, String nom, String direccio, String municipi) {
        this.id = id;
        this.id_DetallsLocalitzacio = id_DetallsLocalitzacio;
        this.nom = nom;
        this.direccio = direccio;
        this.municipi = municipi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_DetallsLocalitzacio() {
        return id_DetallsLocalitzacio;
    }

    public void setId_DetallsLocalitzacio(int id_DetallsLocalitzacio) {
        this.id_DetallsLocalitzacio = id_DetallsLocalitzacio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getMunicipi() {
        return municipi;
    }

    public void setMunicipi(String municipi) {
        this.municipi = municipi;
    }
}
