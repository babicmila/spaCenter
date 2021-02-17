package rs.ac.metropolitan.spa.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Istorija {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int istorijaId;
    private List<Kupon> listaKupona;

    public Istorija() {
    }

    public Istorija(int brOtkazanihTretmana, List<Kupon> listaKupona) {
        this.listaKupona = listaKupona;
    }

    public int getIstorijaId() {
        return this.istorijaId;
    }

    public void setIstorijaId(int istorijaId) {
        this.istorijaId = istorijaId;
    }

    public List<Kupon> getListaKupona() {
        return this.listaKupona;
    }

    public void setListaKupona(List<Kupon> listaKupona) {
        this.listaKupona = listaKupona;
    }

    public void azurirajIstoriju(Kupon kupon) {
        this.listaKupona.add(kupon);
    }

    @Override
    public String toString() {
        return "ID istorije: " + getIstorijaId();
    }
}
