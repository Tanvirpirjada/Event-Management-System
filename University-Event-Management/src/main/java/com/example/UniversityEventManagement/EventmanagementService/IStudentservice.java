package com.example.UniversityEventManagement.EventmanagementService;

import com.example.UniversityEventManagement.EventManagementModel.Student;

import java.util.List;

public interface IStudentservice {

    public List<Student> Findall();

    public  Student FindByid(int id);

    public void addstudent(Student student);

    public void UpdateStudent(int id, Student student);

    public void deleteStudent(int id);
}
