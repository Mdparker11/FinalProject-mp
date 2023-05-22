package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    { // show the courses that student can enroll to
        // print the array of course classes
        //TODO implement this method
        if(!isAttendingCourse(course.getCode())) {
            courses.add(course);
        }

    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }
            // show students info that applied for the different course
            // when student is approve for Course print Student(id, name, email, birthday)

    public boolean isAttendingCourse( String courseCode )
    {           // make a if statment
        // if student is not attending this course return it as false
        //TODO implement this method
        for(Course course: courses){
            if(courses.getCode().equals(courseCode)){
                return true;
            }
        }
        System.out.println("Student has already been enrolled in course!" +courseCode);

        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() +", " +courses+"}";
    }
}
