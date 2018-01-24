package classes.children;

import classes.Group;
import classes.parents.Person;
import classes.Students;

import java.util.ArrayList;

// This class represents the Professor
public class Professor extends Person
{
    // Each professor may be responsible for several groups,
    // but in our case only one group will be represented
    ArrayList<Group> groups = new ArrayList<>(0);

    // Constructor
    public Professor(String firstName, String lastName, Group group)
    {
        // Calling the base class constructor
        super(firstName, lastName);
        groups.add(group);
    }


    public void add(Group group)
    {
        groups.add(group);
    }

    // This method identifies missing students
    // and returns this list in ArrayList<String> form
    public ArrayList<String> rollCall(Students presentStudents)
    {
        ArrayList<String> missingStudents = new ArrayList<>();

        for(Group group : groups) // In our case with one group
            // this cycle isn't needed, but it isn't so in the general case
        {
            for(Student i : group.getAllStudents().getStudents()) // in our case
                // we can remove the upper cycle and replace group to group[0]
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
