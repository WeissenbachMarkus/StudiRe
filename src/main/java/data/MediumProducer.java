/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Medium;

/**
 *
 * @author markus
 */

@RequestScoped
public class MediumProducer implements Serializable {

    private Medium medium;

    public MediumProducer() {
        this.medium = new Medium();
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

}
