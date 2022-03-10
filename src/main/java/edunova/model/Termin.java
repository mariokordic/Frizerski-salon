/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author mkordic
 */
@Entity
public class Termin extends Entitet{
    @ManyToOne
    private Djelatnik djelatnik;
    @ManyToOne
    private Korisnik korisnik;
    private Date datumIvrijeme;
    private String napomena;

    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Date getDatumIvrijeme() {
        return datumIvrijeme;
    }

    public void setDatumIvrijeme(Date datumIvrijeme) {
        this.datumIvrijeme = datumIvrijeme;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
    
    
    
}
