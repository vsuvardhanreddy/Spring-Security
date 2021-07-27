package com.spring.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/v1/student")
public class StudentController {

    public static final List<Student> studentList = Arrays.asList(new Student(1, "Suvardhan"),
                                                new Student(2,"Sravanthi"));


    @Cacheable(value = "student", key = "Student")
    @GetMapping("{studentId}")
    public Student findList(@PathVariable Integer studentId){
        System.out.println("method is called");
        return studentList.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("given "+studentId+"is not in the voter list"));
    }
}
