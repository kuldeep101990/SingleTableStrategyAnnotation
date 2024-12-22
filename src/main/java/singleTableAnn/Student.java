package singleTableAnn;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("S")
public class Student extends Person {
    
    @Column(name = "MAJOR")
    private String major;
    
    @Column(name = "GPA")
    private Double gpa;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}
