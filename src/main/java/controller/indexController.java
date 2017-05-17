/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author markus
 */
@SessionScoped
@Named
public class indexController  implements Serializable{
    
     
    public String addStudent() {
       
        return Pages.ADD_STUDENT;
    }


    public String showStudents( ) {
        return Pages.ALL_STUDENTS;
    }
}
