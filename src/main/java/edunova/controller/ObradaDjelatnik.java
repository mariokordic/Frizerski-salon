/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Djelatnik;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author mkordic
 */
public class ObradaDjelatnik extends Obrada<Djelatnik>{

    @Override
    public List<Djelatnik> read() {
        return session.createQuery("from Djelatnik").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
      kontrolaCreate();        
    }

    @Override
    protected void kontorlaUpdate() throws EdunovaException {
        kontorlaUpdate();
          
    }

    @Override
    protected void kontorlaDelete() throws EdunovaException {
    }
    
  

    
    
}
