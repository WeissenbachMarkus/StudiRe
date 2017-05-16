/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.MediumProducer;
import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import model.Medium;
import util.Events.Added;

/**
 *
 * @author markus
 */
@Named
@Dependent
public class AddMediaController implements Serializable {

    @Inject
    @Added
    private Event<Medium> eventMedium;

    @Inject
    private MediumProducer mediumProducer;

    public String saveMedium() {
        eventMedium.fire(mediumProducer.getMedium());
        return Pages.ALL_MEDIA;
    }

    public MediumProducer getMediumProducer() {
        return mediumProducer;
    }

    public void setMediumProducer(MediumProducer mediumProducer) {
        this.mediumProducer = mediumProducer;
    }
    
    

    public String cancel() {
        return Pages.ALL_MEDIA;
    }
}
