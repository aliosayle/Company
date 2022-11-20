/*
 * Ali Osseili
 * CSCI300
 * OOP with java
 * Section
 * Assignment 2
 */

public class Job
{
    private String jobName;
    private double salary;

    public Job(String jobName, double salary)
    {
        this.jobName = jobName;
        this.salary = salary;
    }

    public String getJobName()
    {
        return jobName;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setJobName(String jobName) 
    {
        this.jobName = jobName;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public String toString()
    {
        return jobName + ", Salary: " + salary;
    }
}