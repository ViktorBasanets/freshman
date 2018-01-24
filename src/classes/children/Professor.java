package classes.children;

import classes.Group;
import classes.Person;
import classes.Students;

import java.util.ArrayList;

public class Professor extends Person
{
    ArrayList<Group> groups = new ArrayList<>(0);

    public Professor(String firstName, String lastName, Group group)
    {
        super(firstName, lastName);
        groups.add(group);
    }

    public void add(Group group)
    {
        groups.add(group);
    }

    public ArrayList<String> rollCall(Students presentStudents)
    {
        ArrayList<String> missingStudents = new ArrayList<>();

        for(Group group : groups)
        {
            for(Student i : group.getAllStudents().getStudents())
            {
                boolean found = false;

                if(i != null)
                {
                    for(Student j : presentStudents.getStudents())
                    {
                        if(j != null && i.getFullName().equals(j.getFullName()))
                        {
                            found = true;
                            break;
                        }
                    }
                }

                if(found == false)
                    missingStudents.add(i.getFullName());
            }
        }

        return missingStudents;
    }
}
