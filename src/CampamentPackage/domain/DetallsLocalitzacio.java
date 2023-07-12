package CampamentPackage.domain;

public class DetallsLocalitzacio {
    private int id;
    private boolean teFred;
    private boolean teFoc;
    private boolean teForn;
    private boolean teElectricitat;
    private boolean teAiguaPotable;
    private boolean teBotigues;
    private boolean teAccesCarretera;
    public DetallsLocalitzacio() {}

    public DetallsLocalitzacio(int id, boolean teFred, boolean teFoc, boolean teForn, boolean teElectricitat, boolean teAiguaPotable, boolean teBotigues, boolean teAccesCarretera) {
        this.id = id;
        this.teFred = teFred;
        this.teFoc = teFoc;
        this.teForn = teForn;
        this.teElectricitat = teElectricitat;
        this.teAiguaPotable = teAiguaPotable;
        this.teBotigues = teBotigues;
        this.teAccesCarretera = teAccesCarretera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTeFred() {
        return teFred;
    }

    public void setTeFred(boolean teFred) {
        this.teFred = teFred;
    }

    public boolean isTeFoc() {
        return teFoc;
    }

    public void setTeFoc(boolean teFoc) {
        this.teFoc = teFoc;
    }

    public boolean isTeForn() {
        return teForn;
    }

    public void setTeForn(boolean teForn) {
        this.teForn = teForn;
    }

    public boolean isTeElectricitat() {
        return teElectricitat;
    }

    public void setTeElectricitat(boolean teElectricitat) {
        this.teElectricitat = teElectricitat;
    }

    public boolean isTeAiguaPotable() {
        return teAiguaPotable;
    }

    public void setTeAiguaPotable(boolean teAiguaPotable) {
        this.teAiguaPotable = teAiguaPotable;
    }

    public boolean isTeBotigues() {
        return teBotigues;
    }

    public void setTeBotigues(boolean teBotigues) {
        this.teBotigues = teBotigues;
    }

    public boolean isTeAccesCarretera() {
        return teAccesCarretera;
    }

    public void setTeAccesCarretera(boolean teAccesCarretera) {
        this.teAccesCarretera = teAccesCarretera;
    }
}
