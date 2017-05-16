/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import model.Medium;


/**
 *
 * @author markus
 */
@RequestScoped 
public interface IserviceMockMedia {
    
    public List<Medium> mockMedia();
    
}
