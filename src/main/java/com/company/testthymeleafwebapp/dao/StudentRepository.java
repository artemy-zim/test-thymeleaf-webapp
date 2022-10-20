package com.company.testthymeleafwebapp.dao;

import com.company.testthymeleafwebapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
