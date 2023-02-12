package com.example.UniversityEventManagement.EventmanagementService;

import com.example.UniversityEventManagement.EventManagementModel.Event;

public interface IEventService {

    public Event getaeventByDate(String date);

    public void AddEvent(Event event);

    public void UpdateEvent(String date, Event event);

    public void DeleteEvent(String date);
}
