package com.berkayerol.controller;

import com.berkayerol.dto.DtoStudent;
import com.berkayerol.dto.DtoStudentIU;
import com.berkayerol.entites.Student;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudentById(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
