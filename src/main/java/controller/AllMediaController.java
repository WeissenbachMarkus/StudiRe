/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.MediumProducer;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import model.Medium;
import util.Events.Deleted;

/**
 *
 * @author markus
 */
@SessionScoped
@Named
public class AllMediaController implements Serializable {

    @Inject
    @Deleted
    private Event<Medium> deleteMediumEvent;
    
    @Inject
    MediumProducer mediumProducer;
    
    private Medium mediumToDelete;

    public String addMedium() {
        
       // mediumProducer.prepareAdd();
        return Pages.ADD_MEDIA;
    }

    public String deleteMedium() {
        deleteMediumEvent.fire(mediumToDelete);
        return Pages.ALL_MEDIA;
    }

    public void toDelete(Medium medium) {
        this.mediumToDelete = medium;
    }

}
