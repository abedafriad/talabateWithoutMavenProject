/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Ville;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Abed
 */
@Stateless
public class VilleFacade extends AbstractFacade<Ville> {

    @PersistenceContext(unitName = "TalabatWithoutMavenPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VilleFacade() {
        super(Ville.class);
    }
    
}
