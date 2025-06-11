package com.berkayerol.services.impl;

import com.berkayerol.dto.DtoCourse;
import com.berkayerol.dto.DtoStudent;
import com.berkayerol.dto.DtoStudentIU;
import com.berkayerol.entites.Course;
import com.berkayerol.entites.Student;
import com.berkayerol.repository.StudentRepository;
import com.berkayerol.services.IStudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        DtoStudent dtoStudent = new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU,student);

        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent,dtoStudent);
        return dtoStudent;
    }

    @Override
    public List<DtoStudent> getAllStudents() {
        List<DtoStudent> dtoList = new ArrayList<>();
        List<Student> studentList = studentRepository.findAllStudents();
        for(Student student: studentList) {
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(student,dtoStudent);
            dtoList.add(dtoStudent);
        }
        return dtoList;
    }

    @Override
    public DtoStudent getStudentById(Integer id) {
        DtoStudent dtoStudent = new DtoStudent();
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }
        Student dbStudent = optional.get();
        BeanUtils.copyProperties(dbStudent, dtoStudent);

        if(dbStudent.getCourses()!=null && !dbStudent.getCourses().isEmpty()) {
            for(Course course:dbStudent.getCourses()) {
                DtoCourse dtoCourse = new DtoCourse();
                BeanUtils.copyProperties(course, dtoCourse);

                dtoStudent.getCourses().add(dtoCourse);
            }
        }
        return dtoStudent;

    }

    @Override
    public void deleteStudentById(Integer id) {
       Optional<Student> optional =  studentRepository.findStudentById(id);
       if(optional.isPresent()) { //sunulcak veri varsa
           studentRepository.delete(optional.get());
       }

    }

    @Override
    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU){
        DtoStudent dtoStudent = new DtoStudent();
        Optional<Student> optional =  studentRepository.findStudentById(id);
        if(optional.isPresent()) {
            Student dbStudent = optional.get();

            dbStudent.setFirstName(dtoStudentIU.getFirstName());
            dbStudent.setLastName(dtoStudentIU.getLastName());
            dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());

            Student updatedStudent = studentRepository.save(dbStudent);

            BeanUtils.copyProperties(updatedStudent,dtoStudent);
            return dtoStudent;
       }
       return null;
    }

    }

