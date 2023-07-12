package CampamentPackage.domain;

import java.sql.Time;

public class HoraMenjada {
    private int id_menu;
    private Time desdejuni;
    private Time esmorcar;
    private Time dinar;
    private Time berenar;
    private Time sopar;
    public HoraMenjada() {}

    public HoraMenjada(int id_menu, Time desdejuni, Time esmorcar, Time dinar, Time berenar, Time sopar) {
        this.id_menu = id_menu;
        this.desdejuni = desdejuni;
        this.esmorcar = esmorcar;
        this.dinar = dinar;
        this.berenar = berenar;
        this.sopar = sopar;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public Time getDesdejuni() {
        return desdejuni;
    }

    public void setDesdejuni(Time desdejuni) {
        this.desdejuni = desdejuni;
    }

    public Time getEsmorcar() {
        return esmorcar;
    }

    public void setEsmorcar(Time esmorcar) {
        this.esmorcar = esmorcar;
    }

    public Time getDinar() {
        return dinar;
    }

    public void setDinar(Time dinar) {
        this.dinar = dinar;
    }

    public Time getBerenar() {
        return berenar;
    }

    public void setBerenar(Time berenar) {
        this.berenar = berenar;
    }

    public Time getSopar() {
        return sopar;
    }

    public void setSopar(Time sopar) {
        this.sopar = sopar;
    }
}
