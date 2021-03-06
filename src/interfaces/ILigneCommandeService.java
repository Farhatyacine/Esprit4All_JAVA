/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.LigneCommande;
import models.Menu;
import models.User;

/**
 *
 * @author plazma33
 */
public interface ILigneCommandeService extends IServices<LigneCommande, Integer> {
    @Override
    public void add(LigneCommande t);

    @Override
    public void delete(Integer r);
    
    public List<LigneCommande> GetCommandMeals(User u);

    @Override
    public List<LigneCommande> getAll();
    
    @Override
    public LigneCommande getById(Integer r);
    
    @Override
    public void update(LigneCommande t);
    
    
    public void delete(LigneCommande t);
    
    public List<LigneCommande> getByCommande(Integer t);
    
    public List<LigneCommande> getByMenuId(Integer t);
    
    public int TestExist(LigneCommande t);
    
        //public void update(LigneCommande t1,LigneCommande t2);
    
    public void delete_by_commandeId(Integer r);
    
    
}
