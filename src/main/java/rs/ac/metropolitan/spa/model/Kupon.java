package rs.ac.metropolitan.spa.model;

import javax.persistence.Entity;

@Entity
public class Kupon {
    private int kuponId;
    private String sifraKupona;
    public Korisnik korisnik;
    public Tretman tretman;

    public Kupon() {
    }

    public Kupon(String sifraKupona, Korisnik korisnik, Tretman tretman) {
        this.sifraKupona = sifraKupona;
        this.korisnik = korisnik;
        this.tretman = tretman;

    }

    public int getKuponId() {
        return this.kuponId;
    }

    public void setKuponId(int kuponId) {
        this.kuponId = kuponId;
    }

    public String getSifraKupona() {
        return this.sifraKupona;
    }

    public void setSifraKupona(String sifraKupona) {
        this.sifraKupona = sifraKupona;
    }

    public Korisnik getKorisnik() {
        return this.korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Tretman getTretman() {
        return this.tretman;
    }

    public void setTretman(Tretman tretman) {
        this.tretman = tretman;
    }

}