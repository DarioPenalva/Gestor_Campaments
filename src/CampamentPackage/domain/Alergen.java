package CampamentPackage.domain;

public class Alergen {
    private int id;
    private boolean gluten = false;
    private boolean carn = false;
    private boolean fruitSec = false;
    private boolean cacahuet = false;
    private boolean ou = false;
    private boolean lactosa = false;
    private boolean proteinaLlet = false;
    private boolean marisc = false;
    private boolean peix = false;
    private boolean soja = false;
    private boolean mostassa = false;
    private boolean sessam = false;
    private boolean tremussos = false;
    private boolean sulfits = false;
    private boolean diabetic = false;
    private boolean api = false;
    public Alergen() {}

    public Alergen(int id, boolean gluten, boolean carn, boolean fruitSec, boolean cacahuet, boolean ou, boolean lactosa, boolean proteinaLlet, boolean marisc, boolean peix, boolean soja, boolean mostassa, boolean sessam, boolean tremussos, boolean sulfits, boolean diabetic, boolean api) {
        this.id = id;
        this.gluten = gluten;
        this.carn = carn;
        this.fruitSec = fruitSec;
        this.cacahuet = cacahuet;
        this.ou = ou;
        this.lactosa = lactosa;
        this.proteinaLlet = proteinaLlet;
        this.marisc = marisc;
        this.peix = peix;
        this.soja = soja;
        this.mostassa = mostassa;
        this.sessam = sessam;
        this.tremussos = tremussos;
        this.sulfits = sulfits;
        this.diabetic = diabetic;
        this.api = api;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public boolean isCarn() {
        return carn;
    }

    public void setCarn(boolean carn) {
        this.carn = carn;
    }

    public boolean isFruitSec() {
        return fruitSec;
    }

    public void setFruitSec(boolean fruitSec) {
        this.fruitSec = fruitSec;
    }

    public boolean isCacahuet() {
        return cacahuet;
    }

    public void setCacahuet(boolean cacahuet) {
        this.cacahuet = cacahuet;
    }

    public boolean isOu() {
        return ou;
    }

    public void setOu(boolean ou) {
        this.ou = ou;
    }

    public boolean isLactosa() {
        return lactosa;
    }

    public void setLactosa(boolean lactosa) {
        this.lactosa = lactosa;
    }

    public boolean isProteinaLlet() {
        return proteinaLlet;
    }

    public void setProteinaLlet(boolean proteinaLlet) {
        this.proteinaLlet = proteinaLlet;
    }

    public boolean isMarisc() {
        return marisc;
    }

    public void setMarisc(boolean marisc) {
        this.marisc = marisc;
    }

    public boolean isPeix() {
        return peix;
    }

    public void setPeix(boolean peix) {
        this.peix = peix;
    }

    public boolean isSoja() {
        return soja;
    }

    public void setSoja(boolean soja) {
        this.soja = soja;
    }

    public boolean isMostassa() {
        return mostassa;
    }

    public void setMostassa(boolean mostassa) {
        this.mostassa = mostassa;
    }

    public boolean isSessam() {
        return sessam;
    }

    public void setSessam(boolean sessam) {
        this.sessam = sessam;
    }

    public boolean isTremussos() {
        return tremussos;
    }

    public void setTremussos(boolean tremussos) {
        this.tremussos = tremussos;
    }

    public boolean isSulfits() {
        return sulfits;
    }

    public void setSulfits(boolean sulfits) {
        this.sulfits = sulfits;
    }

    public boolean isDiabetic() {
        return diabetic;
    }

    public void setDiabetic(boolean diabetic) {
        this.diabetic = diabetic;
    }

    public boolean isApi() {
        return api;
    }

    public void setApi(boolean api) {
        this.api = api;
    }
}
