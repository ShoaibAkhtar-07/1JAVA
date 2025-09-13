abstract class Shape {
    int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1() {
        return dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

    
    public abstract double area();
}

class Circle extends Shape {
    Circle(int dim1){
        super(dim1,-1);   
    }
    public double area(){
        return Math.PI *this.dim1*this.dim1; 
    }
}

class Sphere extends Shape {
    Sphere(int dim1){
        super(dim1,-1);   
    }
    public double area(){
        return 4*Math.PI*this.dim1*this.dim1; 
    }
}

class Cylinder extends Shape {
    Cylinder(int dim1,int dim2){
        super(dim1,dim2);   
    }
    public double area(){
        return (2*Math.PI*this.dim1)*(this.dim1 + this.dim2); 
    }
}

class Rectangle extends Shape {
    Rectangle(int dim1,int dim2){
        super(dim1,dim2);   
    }
    public double area(){
        return this.dim1*this.dim2; 
    }
}


public class ShapesAreas {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape s = new Sphere(4);
        Shape cy = new Cylinder(3, 7);
        Shape r = new Rectangle(6, 8);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Sphere Area: " + s.area());
        System.out.println("Cylinder Area: " + cy.area());
        System.out.println("Rectangle Area: " + r.area());


    }
    
}
