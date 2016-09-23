/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavanjan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Cliente;

/**
 *
 * @author Mauro
 */
public class LavanJAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lavanJANPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Cliente c = new Cliente();
        c.setCedula(123);
        c.setNombre("je");
        c.setApellido("qwqw");
        c.setDireccion("sasas");
        c.setEmail("asas");
        em.persist(c);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
