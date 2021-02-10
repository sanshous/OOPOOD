public class Rectangle {
    double width;
    double length;
    Rectangle(double x, double y){
        if (x > 0 && y >0 ){
            this.length = x;
            this.width = y;
        }
        else System.out.println("Sizes can't be negative.");
    }
    public double get_square(){
        return width * length;
    }
}
