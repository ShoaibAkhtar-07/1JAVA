interface AnimalSound {
    int a = 7;
    public void sound();
    private void animalhome(){
        System.out.println("forest");
    }
    default void  asdf(){
        animalhome();
    }
}

interface AnimalFood  {
    public void food();
}

class Dog implements AnimalSound,AnimalFood{
    public void sound(){
        System.out.println("Bow Bow");
    }
    public void food(){
        System.out.println("Flesh ");

    }
}

class Cat implements AnimalSound,AnimalFood{
    public void sound(){
        System.out.println("Meow Meow");
    }
    public void food(){
        System.out.println("Milk");
    }
}


public class Interface {
    public static void main(String[] args){


        Cat anc = new Cat();
        anc.asdf();
        anc.sound();
        anc.food();
        System.out.println(anc.a);

        Dog and = new Dog();
        and.sound();
        and.food();
        System.out.println(and.a);
    }
}
