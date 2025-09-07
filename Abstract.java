//Abstract is a method that is declared without any implementation

abstract class parent{

    public void sayHello1(){
        System.out.println("hello");
    }
    abstract public void sayHello();
    abstract public void greet();
}

class child1 extends parent{
    @Override
    public void sayHello(){
        System.out.println("hello, man"); //we should create both the abstact method in child class. or else, it will through an error
        //if we want to create a concrete class we should override all the abstract method from the parent class... 
    }

    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}

abstract class child2 extends parent { //override all the methods from the abstract class or make the class as abstract class .
    public void scold(){
        System.out.println("I will not greet you");
    }
    
}


public class Abstract {
    public static void main(String[] args){
        child1 abs = new child1(); //we can create a object from the class which override the methods of abstract class.. 
        abs.greet();
        // parent pr = new parent();
        // pr.sayHello();   // It will through an error. because, we cant create an object of abstract class directly 
        // child2 cl2 = new child2();
        // cl2.scold();

    }
}
