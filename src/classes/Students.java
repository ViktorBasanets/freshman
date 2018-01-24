package classes;

import classes.children.Student;

/*****************************************************
    This class is defined for the further forming
    of a students group with some specific methods
    such as the one that determines the headman
    according to his personal qualities.

    But in my opinion in this context,
    we can do without it :)
******************************************************/

public class Students
{
    // Students list
    private Student [] students;

    // Constructor
    public Students(Student[] students)
    {
        this.students = students;
    }

    // Properties Getter and Setter
    public Student [] getStudents()
    {
        return students;
    }

    public void setStudents(Student[] students)
    {
        this.students = students;
    }

    // Selection algorithm by the max value
    // of the criterion
    public Student chooseHeadman()
    {
        Student headman = students[0];
        double maxValue = criterion(headman);
        for(Student student : getStudents())
        {
            double temp = criterion(student);
            if(maxValue < temp) {
                headman = student;
                maxValue = temp;
            }
        }
        return headman;
    }

    // Simple algorithm for calculating the criterion
    private double criterion(Student student)
    {
        return student.getAcademicPerformance()
                * student.getSocialActivity()
                * student.getOrganizationalAbilities()
                * student.getInitiative()
                * student.getCommunicability() / 5;
    }
}
