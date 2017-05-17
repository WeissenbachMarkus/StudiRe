/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.StudentProducer;
import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import model.Student;
import util.Events.Added;

/**
 *
 * @author markus
 */
@Named
@Dependent
public class AddStudentController implements Serializable {

    @Inject
    @Added
    private Event<Student> eventMedium;

    @Inject
    private StudentProducer studentProducer;

    public String saveMedium() {       
        studentProducer.setMatrikelnumber();
        eventMedium.fire(studentProducer.getStudent());
        return Pages.INDEX;
    }

    public StudentProducer getStudentProducer() {
        return studentProducer;
    }

    public void setMediumProducer(StudentProducer mediumProducer) {
        this.studentProducer = mediumProducer;
    }
    

    public String cancel() {
        return Pages.INDEX;
    }
}
