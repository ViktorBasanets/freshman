package classes.children;

import classes.parents.Person;

import java.util.Locale;
import java.util.Random;

// This class represents the student
public class Student extends Person
{
    // This fields needed for choice criterion
    double academicPerformance;
    double socialActivity;
    double communicability;
    double initiative;
    double organizationalAbilities;

    // Constructor
    public Student(String firstName, String lastName)
    {
        // Calling the base class constructor
        super(firstName, lastName);

        /****** Hardcode which initializing fields the random values ******/
        Random rand = new Random();
        double min = 4.0, max = 12.0;

        this.academicPerformance = min + rand.nextDouble() * (max - min);
        this.socialActivity = min + rand.nextDouble() * (max - min);
        this.communicability = min + rand.nextDouble() * (max - min);
        this.initiative = min + rand.nextDouble() * (max - min);
        this.organizationalAbilities = min + rand.nextDouble() * (max - min);
        /******************************************************************/
    }

    // Properties, Getters and Setters
    public double getAcademicPerformance()
    {
        return academicPerformance;
    }

    public void setAcademicPerformance(double academicPerformance)
    {
        this.academicPerformance = academicPerformance;
    }

    public double getSocialActivity()
    {
        return socialActivity;
    }

    public void setSocialActivity(double socialActivity)
    {
        this.socialActivity = socialActivity;
    }

    public double getCommunicability()
    {
        return communicability;
    }

    public void setCommunicability(double communicability)
    {
        this.communicability = communicability;
    }

    public double getInitiative()
    {
        return initiative;
    }

    public void setInitiative(double initiative)
    {
        this.initiative = initiative;
    }

    public double getOrganizationalAbilities()
    {
        return organizationalAbilities;
    }

    public void setOrganizationalAbilities(double organizationalAbilities)
    {
        this.organizationalAbilities = organizationalAbilities;
    }

    // Method, which needed for testing
    public void show()
    {
        System.out.println( getFullName() + ", " +
                String.format(Locale.ENGLISH, "%.1f", getAcademicPerformance()) + ", " +
                String.format(Locale.ENGLISH,"%.1f", getSocialActivity()) + ", " +
                String.format(Locale.ENGLISH,"%.1f", getCommunicability()) + ", " +
                String.format(Locale.ENGLISH,"%.1f", getInitiative()) + ", " +
                String.format(Locale.ENGLISH,"%.1f", getOrganizationalAbilities())
        );
    }
}
