/*
 * Ali Osseili
 * CSCI300
 * OOP with java
 * Section
 * Assignment 2
 */

import javax.sql.rowset.serial.SerialArray;

public class Person
{
    private String name;
    private Job job;
    private static int jobsCount = 0;
    private static double totalSalary = 0;


    public Person(String name, Job job) 
    {
        this.name = name;
        this.job = job;
        jobsCount += 1;
        totalSalary += job.getSalary();

    }

    public String getName() 
    {
        return name;
    }


    public Job getJob() 
    {
        return job;
    }


    public static int getJobsCount() 
    {
        return jobsCount;
    }


    public static double getTotalSalary()
    {
        return totalSalary;
    }

    public void setJob(Job job)
    {
        this.job = job;
        totalSalary = totalSalary - this.job.getSalary() + job.getSalary();
    }

    public String toString() 
    {
        return "Name: " + name + ", Job: " + job.toString();
    }
     
}