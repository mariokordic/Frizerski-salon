/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Korisnik;
import edunova.util.EdunovaException;
import edunova.util.TelefonProvjera;
import java.util.List;

/**
 *
 * @author mkordic
 */
public class ObradaKorisnik extends Obrada<Korisnik>  {


    @Override
    public List<Korisnik> read() {
        return session.createQuery("from Korisnik").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaBrojTelefona();
    }

    @Override
    protected void kontorlaUpdate() throws EdunovaException {
        kontrolaBrojTelefona();
    }

    @Override
    protected void kontorlaDelete() throws EdunovaException{
    }
    
    private void kontrolaBrojTelefona() throws EdunovaException{
        if(!TelefonProvjera.ispravanBroj(entitet.getBrojMobitela())){
            throw new EdunovaException("Molim unesiteti ispravavan broj Vašeg mobitela");
        }
    }
    
}
