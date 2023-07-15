package com.bootcoding.Jackson.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Student_Table")
public class Student {

    @Id
    private int id;
    private  String  name ;
    private  String city ;

}
