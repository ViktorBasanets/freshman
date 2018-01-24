package classes;

import classes.children.Student;

// This class is needed to identify
// the missing students by the professor
public class Group
{
    String groupName;
    Students allStudents;
    Student headman;

    // Constructor
    public Group(String groupName, Students students)
    {
        this.groupName = groupName;
        this.allStudents = students;
        this.headman = new Student("", "");
    }

    // Properties Getter and Setter
    public String getGroupName()
    {
        return groupName;
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public Students getAllStudents()
    {
        return allStudents;
    }

    public void setAllStudents(Students allStudents)
    {
        this.allStudents = allStudents;
    }

    public Student getHeadman()
    {
        return headman;
    }

    public void setHeadman(Student headman)
    {
        this.headman = headman;
    }


}
