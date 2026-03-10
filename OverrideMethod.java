class HumanBeing {
    public double walk(double distance, double time) {
        double speed = distance / time;
        return speed;
    }
}

class Athlete extends HumanBeing {
    public double walk(double distance, double time) {
        double speed = distance / time;
        speed = speed * 2;
        return speed;
    }
}

public class OverrideMethod {
    public static void main(String[] args) {
        Athlete a = new Athlete();
        double result = a.walk(10, 20);
        System.out.println(result);
    }
}