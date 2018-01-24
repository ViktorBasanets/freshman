package classes.parents;

public class Person
{
    String firstName;
    String lastName;
    String fullName;

    // Constructor
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        fullName = firstName + " " + lastName;
    }

    // Properties setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // Property getter
    public String getFullName()
    {
        return fullName;
    }
}
