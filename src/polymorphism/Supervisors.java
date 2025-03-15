
package polymorphism;

/**
 * This class represents a supervisor, who is an employee class miller with an added bi-weekly bonus.
 */
public class Supervisors extends Employees {
    private double biWeeklyBonus = 300;

    /**
     * Constructs a supervisor with a given name, annual pay, and bi-weekly bonus.
     * @param name the name of this supervisor
     * @param pay the annual pay of the supervisor
     * @param bonus the bi-weekly bonus
     */
    public Supervisors(String name, double pay, double bonus) {
        super(name, pay);
        this.biWeeklyBonus = bonus;
    }

    /**
     * Calculates the bi-weekly pay for the supervisor, which includes their base pay with the added bi-weekly bonus.
     * @return the bi-weekly pay including the bonus
     */
    @Override
    public double biWeeklyPay(int hoursWorked) {
        // Calculate the base pay from the superclass and add the bi-weekly bonus
        return super.biWeeklyPay(hoursWorked) + biWeeklyBonus;
    }
}




