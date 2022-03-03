/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.util.EdunovaException;
import edunova.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author mkordic
 */
public abstract class Obrada<T> {
    
    protected Session session;
    protected T entitet;
    
    public abstract List<T> read();
    protected abstract void kontrolaCreate() throws EdunovaException;
    protected abstract void kontorlaUpdate() throws EdunovaException;
    protected abstract void kontorlaDelete() throws EdunovaException;
    
    public Obrada(){
        session = HibernateUtil.getSession();
    }
    
    public T create() throws EdunovaException{
        kontrolaCreate();
        save();
        return entitet;  
    }
    
    public T update() throws EdunovaException{
      kontorlaUpdate();
      save();
      return entitet;
    }
    
    public void delate() throws EdunovaException{
        kontorlaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }
    private void save(){
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
    public T getEntitet(){
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
   
    
}
