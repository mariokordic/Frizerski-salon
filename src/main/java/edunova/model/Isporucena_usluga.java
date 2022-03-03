/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author mkordic
 */
@Entity(name = "isporucena_usluga")
public class Isporucena_usluga extends Entitet {
    @ManyToOne
    private Usluga usluga;
    @ManyToOne
    private Termin termin;
    private int kolicina;
    private BigDecimal ukupnaCijena;

    public Usluga getUsluga() {
        return usluga;
    }

    public void setUsluga(Usluga usluga) {
        this.usluga = usluga;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public BigDecimal getUkupnaCijena() {
        return ukupnaCijena;
    }

    public void setUkupnaCijena(BigDecimal ukupnaCijena) {
        this.ukupnaCijena = ukupnaCijena;
    }
    
    
}
