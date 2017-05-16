/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;
import model.Medium;
import service.IserviceMockMedia;
import util.Events.Added;
import util.Events.Deleted;

/**
 *
 * @author markus
 */
@Named
@SessionScoped
public class MediaList implements Serializable {

    private List<Medium> media;

    /* @PostConstruct
    public void init () 
    {
        media=getMedia();
    }
    @Inject
    IserviceMockMedia serviceMedia;
     */
    public MediaList() {
        this.media = new ArrayList<>();
        media.add(new Medium("Music", "CD"));
        media.add(new Medium("Film", "DVD"));
    }

    public List<Medium> getMedia() {
        return media;
    }

    public void addMedia(@Observes @Added Medium medium) {
        getMedia().add(medium);
    }

    public void removeMedia(@Observes @Deleted Medium medium) {
        getMedia().remove(medium);
    }

}
