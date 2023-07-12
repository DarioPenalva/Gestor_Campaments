package CampamentPackage.domain;

public class MenuDiari {
    private int id;
    private int desdejuni;
    private int esmorcar;
    private int dinar;
    private int dinarPostre;
    private int berenar;
    private int sopar;
    private int soparPostre;
    public MenuDiari() {}

    public MenuDiari(int id, int desdejuni, int esmorcar, int dinar, int dinarPostre, int berenar, int sopar, int soparPostre) {
        this.id = id;
        this.desdejuni = desdejuni;
        this.esmorcar = esmorcar;
        this.dinar = dinar;
        this.dinarPostre = dinarPostre;
        this.berenar = berenar;
        this.sopar = sopar;
        this.soparPostre = soparPostre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDesdejuni() {
        return desdejuni;
    }

    public void setDesdejuni(int desdejuni) {
        this.desdejuni = desdejuni;
    }

    public int getEsmorcar() {
        return esmorcar;
    }

    public void setEsmorcar(int esmorcar) {
        this.esmorcar = esmorcar;
    }

    public int getDinar() {
        return dinar;
    }

    public void setDinar(int dinar) {
        this.dinar = dinar;
    }

    public int getDinarPostre() {
        return dinarPostre;
    }

    public void setDinarPostre(int dinarPostre) {
        this.dinarPostre = dinarPostre;
    }

    public int getBerenar() {
        return berenar;
    }

    public void setBerenar(int berenar) {
        this.berenar = berenar;
    }

    public int getSopar() {
        return sopar;
    }

    public void setSopar(int sopar) {
        this.sopar = sopar;
    }

    public int getSoparPostre() {
        return soparPostre;
    }

    public void setSoparPostre(int soparPostre) {
        this.soparPostre = soparPostre;
    }
}
