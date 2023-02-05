package ClassesAndObjects;

public class Employee {
    String firstname;
    String lastname;
    double monthlySalary;

    public Employee(String firstname, String lastname, int monthlySalary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.monthlySalary = monthlySalary;
        if (monthlySalary < 0){
            this.monthlySalary = 0.0;
        }

    }
    public void getRaise(double percentage) {
        this.monthlySalary += this.monthlySalary * (percentage / 100);
    }
    public double yearlySalary(){
        return monthlySalary * 12;
    }

    public String displayYearlySalary(){
        return firstname + " yearly salary is " + yearlySalary();
    }


}
