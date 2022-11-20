/*
 * Ali Osseili
 * CSCI300
 * OOP with java
 * Section
 * Assignment 2
 */


import java.util.*;

public class driver
{
    public static void main(String[]args)
    {
        
        Person max = null;     // person with maxiumum salary
        Scanner scan = new Scanner(System.in);
        Person[] persons = new Person[4];
        

        for(int i = 0; i < persons.length; i++)
        {
            System.out.print("Enter the name, job, and salary: ");
            String n = scan.next();             // gets the person's name
            String j = scan.next();             // gets the job's name
            double s = scan.nextDouble();       // gets the salary
            Job job = new Job(j, s);            // creates a new job with a name and salary
            persons[i] = new Person(n, job);    // creats a new person with a name and a job
        }

        System.out.print("The salaries of each of the persons are: ");
        for(int i = 0; i < persons.length; i++)    
        {
            double s = persons[i].getJob().getSalary();
            System.out.print(s + ", "); 
            try
            {
                if(s > max.getJob().getSalary())    //might generate an exception
                max = persons[i];
            }
            catch(Exception e)
            {
               max = persons[i]; 
            }
            
        }
        System.out.println("\n");
        System.out.println("The person with the max salary is: " + max.getName());
        System.out.println("The total salary is " + Person.getTotalSalary());
        System.out.println("The average of all salaries is: " + Person.getTotalSalary() / persons.length + "\n");

        System.out.println("The description of all the persons:");
        for(int i = 0; i < persons.length; i++)
        {
            System.out.println(persons[i].toString());
        }
        System.out.print("\n");

        System.out.println("After adding 100 to the salaries of programmers:");
        for(int i = 0; i < persons.length; i++)
        {
            if(persons[i].getJob().getJobName() == "Programmer")
            {
            persons[i].getJob().setSalary(persons[i].getJob().getSalary() + 100);
            System.out.println(persons[i].toString());
            }
        }
        System.out.println("\n");

        System.out.println("After changing the job of the first person:");
        persons[0].setJob(new Job("chef", 1500));
        System.out.println(persons[0].toString());
    }
}