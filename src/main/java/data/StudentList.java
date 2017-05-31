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
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import model.Student;
import util.Events.Added;
import util.Events.Deleted;
import util.TestQualifier;
import util.TestQualifier.MyService;
import service.IserviceMockStudents;
import service.StudentProducerService;

/**
 *
 * @author markus
 */
@SessionScoped
public class StudentList implements Serializable {

    private List<Student> students;

    @Inject
    @MyService
    IserviceMockStudents serviceStudent;
    
    @Inject
    StudentProducerService service;
    
    @PostConstruct
    public void init() {
       // students = serviceStudent.mockStudents();
       students.addAll(service.getAllStudents());
    }

    
    @Named
    @Produces
    public List<Student> getStudents() {
        return students;
    }
    
    
    @Produces
    public int getStudentCount()
    {
       return students.size();
    }
    

    public void addStudent(@Observes @Added Student student) {
      /*  System.out.println("hey");
        getStudents().add(student);*/
    }

    public void removeStudent(@Observes @Deleted Student student) {
        getStudents().remove(student);
    }

}
