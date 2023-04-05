package com.demo.demo.students;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Naomi",
                        24,
                        LocalDate.of(2000, Month.FEBRUARY, 5),
                        "naomi@gmail.com"
                )
        );
    }
}