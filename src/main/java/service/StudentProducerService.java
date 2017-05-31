/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import data.StudentList;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Student;
import util.Events.Added;

/**
 *
 * @author markus
 */
@Stateless
public class StudentProducerService implements Serializable {

    private Student student;
    private int year, uni, number;

    @Inject
    private EntityManager entityManager;

    public StudentProducerService() {
        this.student = new Student();
        this.uni = 30;
        this.number = 312;
    }

    @Inject
    private StudentList list;

    @PostConstruct
    public void init() {

        year = Calendar.getInstance().get(Calendar.YEAR) - 2000;
        number = this.number + list.getStudentCount();
    }

    public void setMatrikelnumber(@Observes @Added Student student) {
        String tempNumber = "" + year + uni + number;
        student.setMatrikelnumber(Long.parseLong(tempNumber));
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void addstudent(@Observes @Added Student student) {
        System.out.println("Hey");
        entityManager.persist(student);
    }

    public void deleteCampaign(Student student) {
        Student managedStudent = entityManager.find(Student.class,
                student.getMatrikelnumber());
        entityManager.remove(managedStudent);
    }

    @Produces
    @Named
    public List<Student> getAllStudents() {
        TypedQuery<Student> query = entityManager.createNamedQuery(Student.findAll, Student.class);
        List<Student> students = query.getResultList();
        return students;
    }
}
