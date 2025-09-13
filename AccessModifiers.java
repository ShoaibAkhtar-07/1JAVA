class C1 {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}

public class AccessModifiers {
    public static void main(String[] args){
        C1 c1 = new C1();
        //c1.meth1();
        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);
        // System.out.println(c1.d);

    }
}