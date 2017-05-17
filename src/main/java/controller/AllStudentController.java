/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.StudentProducer;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import model.Student;
import util.Events.Deleted;

/**
 *
 * @author markus
 */
@SessionScoped
@Named
public class AllStudentController implements Serializable {

    @Inject
    @Deleted
    private Event<Student> deleteStudentEvent;
    
    private Student studentToDelete;

    public String addStudent() {
        
       // mediumProducer.prepareAdd();
        return Pages.ADD_STUDENT;
    }

    public String deleteStudent() {
        deleteStudentEvent.fire(studentToDelete);
        return Pages.ALL_STUDENTS;
    }

    public void toDelete(Student student) {
        this.studentToDelete = student;
    }

}
