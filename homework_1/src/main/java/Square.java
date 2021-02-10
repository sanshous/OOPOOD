public class Square {
    double length;
    Square(double x){
        if (x > 0){
            this.length = x;
        }
        else System.out.println("Length can't be negative.");
    }
    public double get_square(){
        return length * length;
    }
}
