package com.example.UniversityEventManagement.EventManagementModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    private int EventId;
    private String eventname;
    private String location;
    private String eventdate;

    private String Starttime;
    private String endtime;
}
