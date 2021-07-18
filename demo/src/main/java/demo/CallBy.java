package demo;

public class CallBy {
    private double percent;

    public static void raiseSalary(double x) {
        x = 3 * x;
    }

    public static void raise(CallBy x){
        raiseSalary(10);
    }

    public static void main(String[] args) {
        double percent = 10;
        raiseSalary(percent);
        System.out.println(percent);
    }
}
