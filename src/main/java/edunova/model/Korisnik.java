/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mkordic
 */
@Entity(name="korisnik")
public class Korisnik  extends Entitet{

        private String ime;
	private String prezime;
	private String brojMobitela;
	private String adresa;
	private String grad;
	private String drzava;
	private int postanskiBroj;
	private char spol; 

 
        public String getIme() {
            return ime;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public void setPrezime(String prezime) {
            this.prezime = prezime;
        }

        public String getBrojMobitela() {
            return brojMobitela;
        }

        public void setBrojMobitela(String brojMobitela) {
            this.brojMobitela = brojMobitela;
        }

        public String getAdresa() {
            return adresa;
        }

        public void setAdresa(String adresa) {
            this.adresa = adresa;
        }

        public String getGrad() {
            return grad;
        }

        public void setGrad(String grad) {
            this.grad = grad;
        }

        public String getDrzava() {
            return drzava;
        }

        public void setDrzava(String drzava) {
            this.drzava = drzava;
        }

        public int getPostanskiBroj() {
            return postanskiBroj;
        }

        public void setPostanskiBroj(int postanskiBroj) {
            this.postanskiBroj = postanskiBroj;
        }

        public char getSpol() {
            return spol;
        }

        public void setSpol(char spol) {
            this.spol = spol;
        }
        
        
}
