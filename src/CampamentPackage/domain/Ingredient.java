package CampamentPackage.domain;

public class Ingredient {
    private int id;
    private int id_tenda;
    private String nom;
    private int quantitat;
    private String unitat;
    private float preu;
    public Ingredient() {}

    public Ingredient(int id, int id_tenda, String nom, int quantitat, String unitat, float preu) {
        this.id = id;
        this.id_tenda = id_tenda;
        this.nom = nom;
        this.quantitat = quantitat;
        this.unitat = unitat;
        this.preu = preu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_tenda() {
        return id_tenda;
    }

    public void setId_tenda(int id_tenda) {
        this.id_tenda = id_tenda;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public String getUnitat() {
        return unitat;
    }

    public void setUnitat(String unitat) {
        this.unitat = unitat;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }
}
