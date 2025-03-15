
package polymorphism;

/**
This class represents the employee class of miller who is paid a regular bi weekly amount of their salary.
*/

// TO DO: TASK 1 - DECLARE YOUR CLASS AND ANY VARIABLES HERE.
public class Employees extends Millers{
private double annualPay;

/**
   Constructs an employee with a given name and an annual pay.
   @param name the name of this employee
   @param pay the annual pay of the employee
 */
public Employees(String name, double pay)
{
   setName(name);
   annualPay = pay;
}

// TO DO: TASK - This portion of your code computes the pay for this category of miller.

// YOUR CODE GOES IN HERE.
@Override public double biWeeklyPay(int hoursWorked) {
 return annualPay/26;
}


}