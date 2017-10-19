/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Commande;

/**
 *
 * @author plazma33
 */
public interface ICommandeService extends IServices<Commande, Integer> {
    
    @Override
    public void add(Commande t);

    @Override
    public void delete(Integer r);

    @Override
    public List<Commande> getAll();

    @Override
    public Commande getById(Integer r);
 
    @Override
    public void update(Commande t);
    
    
    
}
