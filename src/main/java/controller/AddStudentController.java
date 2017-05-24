/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import service.StudentProducerService;
import java.io.Serializable;
import javax.enterprise.context.Dependent;
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
    private Event<Student> eventAddStudent;

    @Inject
    private StudentProducerService studentProducer;

    public String saveStudent() {          
        eventAddStudent.fire(studentProducer.getStudent());
        return Pages.INDEX;
    }

    public StudentProducerService getStudentProducer() {
        return studentProducer;
    }

    public void setMediumProducer(StudentProducerService mediumProducer) {
        this.studentProducer = mediumProducer;
    }
    

    public String cancel() {
        return Pages.INDEX;
    }
}
