package com.berkayerol.services;

import com.berkayerol.dto.DtoStudent;
import com.berkayerol.dto.DtoStudentIU;
import com.berkayerol.entites.Student;

import java.util.List;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student); //3'lü olarak aldım 2'li olarak dönüyorum

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudentById(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
