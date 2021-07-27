package com.spring.Controller;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

//@Entity
@Data
//@Table(name = "Voter_data")
public class Student implements Serializable {
//    @Id
    public final int studentId;
    public final String studentName;
}
