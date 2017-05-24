/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import model.Student;
import util.TestQualifier.MyService;

/**
 *
 * @author markus
 */
@RequestScoped
@MyService
public class serviceMockStudent implements IserviceMockStudents {

    @Override
    public List<Student> mockStudents() {
        List<Student> media = new ArrayList<>();
        media.add(new Student(1730312, "Markus", "Weissenbach", "Ing-Ballerstr. 4", "Imst", 6460 ));
        media.add(new Student(1730313, "Max","Muster","Straße","Ort",3333));

        return media;
    }

}
