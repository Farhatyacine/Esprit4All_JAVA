/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Revision;

/**
 *
 * @author asus
 */
public interface IServiceRevision extends IServices<Revision,Integer> { 

    @Override
    public void add(Revision t);

    @Override
    public Revision getById(Integer r);

    @Override
    public List<Revision> getAll();


    @Override
    public void delete(Integer r);

    @Override
    public Revision search(Revision t);
    
           public Revision search2(Integer r );

 
}
