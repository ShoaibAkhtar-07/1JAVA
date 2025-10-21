import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){
        return "I am to string";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
public class TryExceptionClass {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if (a<9){
            try {
                throw new MyException();    
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
}
