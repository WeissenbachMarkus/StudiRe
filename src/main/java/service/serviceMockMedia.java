/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import model.Medium;

/**
 *
 * @author markus
 */
@RequestScoped 
public class serviceMockMedia implements IserviceMockMedia {

    
    
    @Override
    public List<Medium> mockMedia() {
        List<Medium> media = new ArrayList<>();
        media.add(new Medium("Music", "CD"));
        media.add(new Medium("Film", "DVD"));

        return media;
    }

}
