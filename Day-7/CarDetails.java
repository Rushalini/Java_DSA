public class CarDetails {
    int year;
    String model;
    String make;
    CarDetails(int year, String model, String make){
        this.year = year;
        this.model = model;
        this.make = make;
    }
    void displayinfo(){
        System.out.println("Car Details:");
        System.out.println("Year: " + year +", Model: " + model + ", Make: " + make);
    }
    public static void main(String[] args) {
        CarDetails car1 = new CarDetails(2021, "Corolla", "Toyota");
        car1.displayinfo();
    }
}
