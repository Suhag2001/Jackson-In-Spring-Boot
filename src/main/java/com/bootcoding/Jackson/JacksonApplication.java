package com.bootcoding.Jackson;

import com.bootcoding.Jackson.Model.Student;
import com.bootcoding.Jackson.repo.StudentRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.util.Optional;


@SpringBootApplication
public class JacksonApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JacksonApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Suhag Mohinkar");
        s1.setCity("Chandrapur");
        Student s2 = repo.save(s1);


        // Below Code print the student object into List formate
//		 Optional<Student> student = repo.findById(1);
//		System.out.println( student);

        //Below code print the student object into JSON formate by using jackson

//        ObjectMapper Obj = new ObjectMapper();
//
//        try {
//            // Getting organisation object as a json string
//            String jsonStr = Obj.writeValueAsString(s2);
//            // Displaying JSON String on console
//            System.out.println(jsonStr);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //Below code for print the student object into xml formate

        XmlMapper xmlMapper = new XmlMapper();

        try {
            String employeeXml = xmlMapper.writeValueAsString(s1);
            System.out.println(employeeXml);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }


}
