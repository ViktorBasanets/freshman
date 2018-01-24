package classes;

import classes.children.Student;

public class Group
{
    String groupName;
    Students allStudents;
    Student headman;

    public Group(String groupName, Students students)
    {
        this.groupName = groupName;
        this.allStudents = students;
        this.headman = new Student("", "");
    }

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
