// import java.util.*;
// public class Functions {
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the a value : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the b value : ");
//         int b = sc.nextInt();
//         System.out.println("The sum of given 2 number is "+sum(a,b));
        
//     }
// }


public class Functions {
    public static void primeOrNot(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
            count++;
            }
        }
        if(count == 2){
            System.out.println("Given number is a prime number");
        }
        else{
            System.out.println("Given number is not a prime number");
        }

    }
    public static void main(String[] args) {
        primeOrNot(5);
    }
}
