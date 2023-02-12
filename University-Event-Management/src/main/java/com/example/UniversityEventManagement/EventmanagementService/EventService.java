package com.example.UniversityEventManagement.EventmanagementService;

import com.example.UniversityEventManagement.EventManagementModel.Event;
import com.example.UniversityEventManagement.EventManagementModel.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements IEventService,IStudentservice{

    private static final List<Student> students=new ArrayList<>();

    private static final List<Event> events=new ArrayList<>();
     static int count=0; static int eventcount=0;
    static{
        students.add(new Student(++count,"Pirjada","Tanvir",23,"electrical"));
        students.add(new Student(++count,"Hasnain","Pirjada",25,"Mechanical"));
        students.add(new Student(++count,"Shristi","Gupta",23,"Cs"));
        students.add(new Student(++count,"Tejasvi","Chauhan",22,"it"));


        events.add(new Event(++eventcount,"Singing","Iit,mumbai","08-10-2015","9:00 AM","3:00 PM"));
        events.add(new Event(++eventcount,"Dancing","Iit,Delhi","10-7-2015","9:00 AM","1:00 PM"));
        events.add(new Event(++eventcount,"Ted_talk","Iit,gandhinagar","20-1-2016","10:00 AM","2:00 PM"));
        events.add(new Event(++eventcount,"sport","Iit,Khadakpur","15-2-2016","11:00 AM","5:00 PM"));
    }






    @Override
    public  Event getaeventByDate(String date) {
        for(Event event: events){
            if(event.getEventdate().equals(date)){
                return event;
            }
        }
        return null;
    }

    @Override
    public void AddEvent(Event event) {
              events.add(event);
    }

    @Override
    public void UpdateEvent(String date, Event newevent) {
         Event event=getaeventByDate(date);
          event.setEventId(newevent.getEventId());
          event.setEventname(newevent.getEventname());
          event.setLocation(newevent.getLocation());
          event.setEventdate(newevent.getEventdate());
          event.setStarttime(newevent.getStarttime());
          event.setEndtime(newevent.getEndtime());

    }

    @Override
    public void DeleteEvent(String date) {
      Event event=getaeventByDate(date);
      events.remove(event);
    }

    @Override
    public List<Student> Findall() {
        return students;
    }

    @Override
    public Student FindByid(int id) {
        for(Student student:students){
            if(student.getStudent_id()==id){
                return student;
            }
        }
        return null;
    }

    @Override
    public void addstudent(Student student) {
        students.add(student);
    }

    @Override
    public void UpdateStudent(int id, Student student) {
         Student newstudent=FindByid(id);

         newstudent.setStudent_id(student.getStudent_id());
         newstudent.setFirst_name(student.getFirst_name());
         newstudent.setLast_name(student.getLast_name());
         newstudent.setAge(student.getAge());
         newstudent.setDepartment(student.getDepartment());
    }

    @Override
    public void deleteStudent(int id) {
       Student student=FindByid(id);
       students.remove(student);
    }
}
