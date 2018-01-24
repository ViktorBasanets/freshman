import classes.Group;
import classes.Students;
import classes.children.Professor;
import classes.children.Student;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Students allStudents =  new Students(
                new Student[] {
                        new Student("Angelina", "Pavlenko"), new Student("Andriy", "Tkachenko"),
                        new Student("Anna", "Umanez"), new Student("Artyom", "Serdyuk"),
                        new Student("Bogdan", "Bondarenko"), new Student("Veronica", "Mazailo"),
                        new Student("Victoria", "Kononetz"), new Student("Vladislav", "Polishchuk"),
                        new Student("Danilo", "Bondarchuk"), new Student("Denis", "Kovalenko"),
                        new Student("Diana", "Durdinetz"), new Student("Dmytro", "Kirilenko"),
                        new Student("Egor", "Shevchenko"), new Student("Elizabeth", "Romenetz"),
                        new Student("Ilya", "Tymoshenko"), new Student("Katerina", "Emeets"),
                        new Student("Cyril", "Tarasyuk"), new Student("Kristina", "Svidrigailo"),
                        new Student("Maxim", "Savchuk"), new Student("Maria", "Kolomiets"),
                        new Student("Nikita", "Hytruk"), new Student("Nazar", "Kravchuk"),
                        new Student("Natalia", "Kompaniets"), new Student("Alexander", "Ivanenko"),
                        new Student("Oleksandra", "Styigailo"), new Student("Sophia", "Kravchenko"),
                        new Student("Ulyana", "Minyailo"), new Student("Julia", "Stepanets") } );

        Group groupFreshman = new Group("Prefix2018", allStudents);
        groupFreshman.setHeadman( allStudents.chooseHeadman() );

        Professor professor = new Professor("Vasil", "Kravtsov", groupFreshman);

        Students presentStudents =  new Students( new Student[] {
                new Student("Angelina", "Pavlenko"), new Student("Andriy", "Tkachenko"),
                new Student("Anna", "Umanez"), new Student("Artyom", "Serdyuk"),
                new Student("Bogdan", "Bondarenko"), new Student("Veronica", "Mazailo"),
                new Student("Victoria", "Kononetz"), new Student("Vladislav", "Polishchuk"),
                new Student("Cyril", "Tarasyuk"), new Student("Kristina", "Svidrigailo"),
                new Student("Maxim", "Savchuk"), new Student("Maria", "Kolomiets"),
                new Student("Nikita", "Hytruk"), new Student("Nazar", "Kravchuk"),
                new Student("Natalia", "Kompaniets"), new Student("Alexander", "Ivanenko"),
                new Student("Ulyana", "Minyailo"), new Student("Julia", "Stepanets") } );

        ArrayList<String> missingStudents = professor.rollCall(presentStudents);

        System.out.println("The headman is  " + allStudents.chooseHeadman().getFullName());

        int counter = 1;
        System.out.println(" -= Missing students =-");
        for(String name : missingStudents)
        {
            System.out.println(counter++ + "). " + name);
        }

    }
}
