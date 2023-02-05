package ClassesAndObjects;

class Car {
    public String model;
    public int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void start() {
        System.out.println( model + " started");
    }

    public void stop() {
        System.out.println(model + " stopped");
    }

    public void move() {
        System.out.println(model+ " is moving");
    }
}
