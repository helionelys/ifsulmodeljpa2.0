/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsul.testes;

import br.com.ifsul.modelo.Pais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Administrator
 */
public class TesteAlterarPais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("IFSULModelPU");
        EntityManager em = emf.createEntityManager();
        Pais p = em.find(Pais.class, 2);
        p.setNome("Argentina");
        p.setIso("ARG");
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
    
}
