package com.example.UniversityEventManagement.EventmanagementController;

import com.example.UniversityEventManagement.EventManagementModel.Event;
import com.example.UniversityEventManagement.EventManagementModel.Student;
import com.example.UniversityEventManagement.EventmanagementService.IEventService;
import com.example.UniversityEventManagement.EventmanagementService.IStudentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/v1")
public class EventController {

    @Autowired
    private IEventService eventservice;

    @Autowired
    private IStudentservice studentservice;

    @GetMapping("findAll")
    public List<Student> Findall(){
        return studentservice.Findall();
    }

    @GetMapping("findbyid/id/{id}")
    public  Student findbyid(@PathVariable int id){
        return studentservice.FindByid(id);
    }
    @PostMapping("AddStudent")
    public void Addstudent(@RequestBody Student student){
        studentservice.addstudent(student);
    }

    @DeleteMapping("deleteStudent/id/{id}")
    public  void Deletestudent(@PathVariable int id){
        studentservice.deleteStudent(id);
    }


    @PutMapping("Upadatestudent/id/{id}")
    public void upadatestudent(@PathVariable int id, @RequestBody Student student){
        studentservice.UpdateStudent(id,student);
    }


    @GetMapping("findbyDate/date/{date}")
    public Event findbydate(@PathVariable String date){
        return eventservice.getaeventByDate(date);
    }

    @PostMapping("AddEvent")
    public void Addevent(@RequestBody Event event ){
        eventservice.AddEvent(event);
    }

    @PutMapping("updateEvent/date/{date}")
     public void UpdateEvent(@PathVariable String date, @RequestBody Event event){
        eventservice.UpdateEvent(date,event);
    }

    @DeleteMapping("deleteevent/date/{date}")
    public void DeleteEvent(@PathVariable String date){
        eventservice.DeleteEvent(date);
    }

}
