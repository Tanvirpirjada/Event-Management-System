package com.example.UniversityEventManagement.EventManagementModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int Student_id;
    private String First_name;
    private String Last_name;
    private int Age;
    private String Department;

}
