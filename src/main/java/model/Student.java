/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author markus
 */
public class Student {
    
   private long matrikelnumber;
    private String firstname,lastname,adresse,location;
    private Integer postCode;

    public Student() {
    }

    
    public Student(long matrikelnumber, String firstname, String lastname, String adresse, String location, Integer postCode) {
        this.matrikelnumber = matrikelnumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.adresse = adresse;
        this.location = location;
        this.postCode = postCode;
    }
    

    
    public long getMatrikelnumber() {
        return matrikelnumber;
    }

    public void setMatrikelnumber(long matrikelnumber) {
        this.matrikelnumber = matrikelnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
    
    
}
