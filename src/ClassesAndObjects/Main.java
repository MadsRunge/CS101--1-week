package ClassesAndObjects;



public class Main {
    public static void main(String[] args) {
        Car volvo = new Car("Volvo", 10000);
        Driver james = new Driver("James", 25);
        volvo.move();
        james.drive();

        Employee nelson = new Employee("Nelson", "Smith", 20000);
        Employee paul = new Employee("Paul", "McCartney", 50000);

        System.out.println(paul.displayYearlySalary());
        System.out.println(nelson.displayYearlySalary());

        nelson.getRaise(10.00);
        paul.getRaise(10.00);

        System.out.println(nelson.yearlySalary());
        System.out.println(paul.yearlySalary());

    }
}