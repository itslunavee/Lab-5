# Lab-5
Lab Description (Problem Scenario)
Stoneware Corporation is a multi million-dollar company that has hundreds of millers across
Edmonton. A challenging fact with Stoneware Corporation’s system is that the company does
not compute the pay of every miller in the same way. The reason is that payments received
depends on the category of the miller. Despite the fact that the millers’ pay is not computed in
the same way, every miller receives their pay on the same day bi-weekly.
As a student of CST8284, you have been requested to develop a payment system that takes
care of each category of miller by ensuring that every miller is paid based on their category
through the same payment system.
Stoneware Corporation requires that the category of the millers to be considered are:
1. Millers paid per hour – This category of millers are called Consultants. Note that the bi-
weekly pay for this category of millers is calculated as the product of the hoursWorked
and consultantWage.
Your code should consider the fact also that whenever a consultant works for more than
76 hours bi-weekly, there is an overtime amount added to the pay.
2. Millers who are paid a particular amount despite the number of hours they have worked
are referred to as Employees. Note that the bi-weekly pay for this category of workers is
computed by dividing the annual pay of the employee by the number of bi-weeks per
year (assume that the number of weeks in the year is 52 weeks).
3. Millers who are part of employees, but supervise other employees are called
Supervisors. Apart from their pay, supervisors are also entitled to an additional bonus
amount bi-weekly. Note that the bi-weekly pay for the supervisor is computed exactly
as that of the employees, but with a bi-weekly bonus amount added to the supervisor.
In this lab, you are provided the following files:
• Stoneware Corporations’ Class named Millers.java.
• Sample output to show what your output should look like.
You are required to (tasks towards grading):
1. Review the relationship between all the categories of millers as stated in the problem
scenario.
2. Review the Millers.java and the sample output files provided. You will need to
understand the code/output, any issues, and therefore should determine what to do
subsequently (in the other classes as would be required).
3. Make a sketch diagram to show the relationship between all the classes as elaborated
in the problem scenario.
4. List the additional classes that you are required to create (names only).
5. Create the required additional classes by Stoneware Corporation using the empty code
shells that have been provided for you.
6. Create a driver class named MillersTest for this pay system. The driver class will contain
your main method. In this class you must implement an array to capture the different
categories of millers. Also, provide the possibility for users of this system to enter more
millers.
7. Your output should show that when executed, your program runs polymorphically and
computes the pay for each category of millers in the system.
