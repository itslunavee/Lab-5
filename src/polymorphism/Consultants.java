
package polymorphism;

/**
This class represents the Consultant class of miller. A Consultant is a miller who is paid for every hour worked.
*/
// TO DO: TASK 1 - YOUR CODE GOES HERE TO DECLARE THE CONSULTANT CLASS AND ITS VARIABLES.
public class Consultants extends Millers{
	private double consultantWage;
/**
   TO DO: TASK 2 - This portion of your code constructs an hourly paid consultant with a given name and biweekly wage.
   @param name the name of this consultant
   @param wage the consultant wage per hour 
*/
// YOUR CODE FOR YOUR CONSULTANT GOES HERE!!
	
public Consultants(String name, double wage) {
	setName(name);
	this.consultantWage = wage;
}


// TO DO: TASK 3 - THIS PORTION OF YOUR CODE COMPUTES THE 

@Override public double biWeeklyPay(int hoursWorked){
   double pay = hoursWorked * consultantWage;

// In this part of your code, an overtime amount is added if the Consultant works for more than 76 hours bi-weekly.
// Review this portion of code carefully to include the code to fully satisfy this condition.
  
// SOME CODE GOES HERE BEFORE THE CODE BELOW:
   
   if(hoursWorked > 76) {
   pay = pay + ((hoursWorked - 76) * 0.5) * consultantWage;
   }
   
   return pay;
}

}

