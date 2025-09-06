class Base{
    int x;
    Base(){
        System.out.println("HI bro, i am from BASE class");
    }

    Base(int a){
        System.out.println("the value of a is : "+a);
    }

    public void setX(int n){
        x = n;
    }

    public int getX(){
        return x;
    }

}


class Derived extends Base{
    int y;
    Derived(){
        System.out.println("HI bro, i am from DERIVED class");
    }
    
    Derived(int a,int b){
        super(a);
        System.out.println("the value of b is : "+b);
    }

    public void setY(int n){
        y = n;
    }

    public int getY(){
        return y;
    }

}


public class Inheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        // b.setX(7);
        // System.out.println(b.getX());
        Derived c = new Derived();
        Derived d = new Derived(4,5);

    }
}
 