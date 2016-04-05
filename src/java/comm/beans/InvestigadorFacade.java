/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.beans;

import comm.Investigador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JhGomezR
 */
@Stateless
public class InvestigadorFacade extends AbstractFacade<Investigador> {
    @PersistenceContext(unitName = "Web_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InvestigadorFacade() {
        super(Investigador.class);
    }
    
}
