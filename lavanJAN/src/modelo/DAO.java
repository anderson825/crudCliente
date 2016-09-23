/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nesto
 */
public class DAO {
    
    
    
    
    public DAO(){
        
    }
    
    
    public boolean insert(Cliente c){
        try{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lavanJANPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return true;
        }catch(Exception e){
            
            return false;
        }
    }
    
    
    public Cliente search(int cedula){
        Cliente salida = null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lavanJANPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        salida = em.find(Cliente.class,cedula);
        em.getTransaction().commit();
        return salida;
    }
    
    
    
}
