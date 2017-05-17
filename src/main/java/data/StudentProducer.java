/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import model.Student;

/**
 *
 * @author markus
 */
@RequestScoped
public class StudentProducer implements Serializable {

    private Student student;
    private int year, uni, number;

    public StudentProducer() {
        this.student = new Student();
        this.uni = 30;
        this.number = 313;

    }

    @Inject
    private StudentList list;

    @PostConstruct
    public void init() {
      
        year = Calendar.getInstance().get(Calendar.YEAR)-2000;

        number = this.number + list.getStudentCount();
    }

    public void setMatrikelnumber() {
        String tempNumber = "" + year + uni + number;
        student.setMatrikelnumber(Long.parseLong(tempNumber));
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
