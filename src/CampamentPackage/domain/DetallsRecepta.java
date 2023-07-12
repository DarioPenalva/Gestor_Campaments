package CampamentPackage.domain;

import java.sql.Time;

public class DetallsRecepta {
    private int id_recepta;
    private boolean necessitaFred;
    private boolean necessitaFoc;
    private boolean necessitaForn;
    private boolean menjarFresc;
    private boolean menjarConservable;
    private boolean serveixFred;
    private boolean serveixCalent;
    private Time tempsElaboracio;
    private boolean esPostre;
    public DetallsRecepta() {}

    public DetallsRecepta(int id_recepta, boolean necessitaFred, boolean necessitaFoc, boolean necessitaForn, boolean menjarFresc, boolean menjarConservable, boolean serveixFred, boolean serveixCalent, Time tempsElaboracio, boolean esPostre) {
        this.id_recepta = id_recepta;
        this.necessitaFred = necessitaFred;
        this.necessitaFoc = necessitaFoc;
        this.necessitaForn = necessitaForn;
        this.menjarFresc = menjarFresc;
        this.menjarConservable = menjarConservable;
        this.serveixFred = serveixFred;
        this.serveixCalent = serveixCalent;
        this.tempsElaboracio = tempsElaboracio;
        this.esPostre = esPostre;
    }

    public int getId_recepta() {
        return id_recepta;
    }

    public void setId_recepta(int id_recepta) {
        this.id_recepta = id_recepta;
    }

    public boolean isNecessitaFred() {
        return necessitaFred;
    }

    public void setNecessitaFred(boolean necessitaFred) {
        this.necessitaFred = necessitaFred;
    }

    public boolean isNecessitaFoc() {
        return necessitaFoc;
    }

    public void setNecessitaFoc(boolean necessitaFoc) {
        this.necessitaFoc = necessitaFoc;
    }

    public boolean isNecessitaForn() {
        return necessitaForn;
    }

    public void setNecessitaForn(boolean necessitaForn) {
        this.necessitaForn = necessitaForn;
    }

    public boolean isMenjarFresc() {
        return menjarFresc;
    }

    public void setMenjarFresc(boolean menjarFresc) {
        this.menjarFresc = menjarFresc;
    }

    public boolean isMenjarConservable() {
        return menjarConservable;
    }

    public void setMenjarConservable(boolean menjarConservable) {
        this.menjarConservable = menjarConservable;
    }

    public boolean isServeixFred() {
        return serveixFred;
    }

    public void setServeixFred(boolean serveixFred) {
        this.serveixFred = serveixFred;
    }

    public boolean isServeixCalent() {
        return serveixCalent;
    }

    public void setServeixCalent(boolean serveixCalent) {
        this.serveixCalent = serveixCalent;
    }

    public Time getTempsElaboracio() {
        return tempsElaboracio;
    }

    public void setTempsElaboracio(Time tempsElaboracio) {
        this.tempsElaboracio = tempsElaboracio;
    }

    public boolean isEsPostre() {
        return esPostre;
    }

    public void setEsPostre(boolean esPostre) {
        this.esPostre = esPostre;
    }
}
