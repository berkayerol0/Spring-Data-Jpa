package com.berkayerol.repository;

import com.berkayerol.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = "from Student", nativeQuery = false)
    List<Student> findAllStudents();

    @Query(value = "from Student s WHERE s.id= :studentId", nativeQuery = false)
    Optional<Student> findStudentById(Integer studentId);




}
