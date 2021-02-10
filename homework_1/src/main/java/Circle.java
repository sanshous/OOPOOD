public class Circle {
    double radius;
    Circle(double x) {
        if (x > 0){
            this.radius = x;
        }
        else System.out.println("Radius can't be negative.");
    }
    public double get_square(){
        return 3.14 * radius * radius;
    }
}
