class Circle {
    public int radius;

    Circle(int r){
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}

class Cylinder extends Circle{
    public int height;

    Cylinder(int r,int h){
        super(r);
        this.height = h;
    }

    public double voulme(){
        return Math.PI*this.radius*this.radius*this.height;
    }

    
}

public class OopsPractice {
    public static void main(String[] args){
        Circle cir = new Circle(4);
        // cir.radius = 4;
        System.out.println(cir.area());
        Cylinder cyl = new Cylinder(4,8);
        System.out.println(cyl.voulme());

    }
    
}
