package com.spring.Controller;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Data
//@Table(name = "Voter_data")
public class Voter {
//    @Id
    public final int voterId;
    public final String voterName;
}
