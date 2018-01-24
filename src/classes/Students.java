package classes;

import classes.children.Student;

public class Students
{
    private Student [] students;

    public Students(Student[] students)
    {
        this.students = students;
    }

    public Student [] getStudents()
    {
        return students;
    }

    public void setStudents(Student[] students)
    {
        this.students = students;
    }

    public Student chooseHeadman()
    {
        Student headman = students[0];
        double max = criterion(headman);
        for(Student student : getStudents())
        {
            double temp = criterion(student);
            if(max < temp) {
                headman = student;
                max = temp;
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
