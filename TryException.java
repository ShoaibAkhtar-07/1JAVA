import java.util.*;
public class TryException {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 4;
        marks[2] = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of array : ");
        int ind = sc.nextInt();

        System.out.println("Enter the Number by which you want to divide : ");
        int num = sc.nextInt();
        try{
            System.out.println("I am in level 1 try and  exception");
            try{
                System.out.println("The value at array index which you have entered is : "+marks[ind]);
                System.out.println("division of array  value by given number : "+marks[ind]/num);
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}