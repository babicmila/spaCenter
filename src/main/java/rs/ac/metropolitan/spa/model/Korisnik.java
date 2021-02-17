package rs.ac.metropolitan.spa.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Korisnik {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int korisnikId;
   private String ime;
   private String prezime;
   private String adresa;
   private String grad;
   private String brojTelefona;
   private String email;
   public Rola rola;
   public Istorija istorija;

   public Korisnik(String ime, String prezime, String adresa, String grad, String brojTelefona, String email) {
      this.ime = ime;
      this.prezime = prezime;
      this.adresa = adresa;
      this.grad = grad;
      this.brojTelefona = brojTelefona;
      this.email = email;
      this.rola = Rola.KLIJENT;
      System.out.println("Setovanje istorije korisniku");
      setIstorija(istorija);
      System.out.println("Istorija je podesena sa ID-em: " + istorija.toString());
   }

   public int getKorisnikId() {
      return this.korisnikId;
   }

   public void setKorisnikId(int korisnikId) {
      this.korisnikId = korisnikId;
   }

   public String getIme() {
      return this.ime;
   }

   public void setIme(String ime) {
      this.ime = ime;
   }

   public String getPrezime() {
      return this.prezime;
   }

   public void setPrezime(String prezime) {
      this.prezime = prezime;
   }

   public String getAdresa() {
      return this.adresa;
   }

   public void setAdresa(String adresa) {
      this.adresa = adresa;
   }

   public String getGrad() {
      return this.grad;
   }

   public void setGrad(String grad) {
      this.grad = grad;
   }

   public String getBrojTelefona() {
      return this.brojTelefona;
   }

   public void setBrojTelefona(String brojTelefona) {
      this.brojTelefona = brojTelefona;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Rola getRola() {
      return this.rola;
   }

   public void setRola(Rola rola) {
      this.rola = rola;
   }

   public Istorija getIstorija() {
      return this.istorija;
   }

   public void setIstorija(Istorija istorija) {
      this.istorija = istorija;
   }

   public void rezervisiTretman() {
      // TODO Auto-generated method stub

   }

   public void otkaziRezervaciju() {
      // TODO Auto-generated method stub

   }

   public void zahtevajMagazin() {
      // TODO Auto-generated method stub

   }

   public void prikaziIstoriju() {
      // TODO Auto-generated method stub

   }

   public void pogledajProfil() {
      // TODO Auto-generated method stub

   }

   public List<Tretman> pretraziTretmane() {
      // TODO Auto-generated method stub
      return null;
   }

   public void generisiIzvestaj() {
      // TODO Auto-generated method stub

   }

   public List<Korisnik> pretraziKorisnika() {
      // TODO Auto-generated method stub
      return null;
   }

   public void kreirajAkciju() {
      // TODO Auto-generated method stub

   }

   public void kreirajTretman() {
      // TODO Auto-generated method stub

   }

   public void kreriajTermin() {
      // TODO Auto-generated method stub

   }

   public void kreirajKorisnika() {
      // TODO Auto-generated method stub

   }

   public void azurirajTretman() {
      // TODO Auto-generated method stub

   }

   public void azurirajTermin() {
      // TODO Auto-generated method stub

   }

   public void azurirajKorisnika() {
      // TODO Auto-generated method stub

   }

   public void azurirajAkciju() {
      // TODO Auto-generated method stub

   }

   public void obrisiTretman() {
      // TODO Auto-generated method stub

   }

   public void obrisiKorisnika() {
      // TODO Auto-generated method stub

   }

   public void obrisiTermin() {
      // TODO Auto-generated method stub

   }

   public void obrisiAkciju() {
      // TODO Auto-generated method stub

   }

}