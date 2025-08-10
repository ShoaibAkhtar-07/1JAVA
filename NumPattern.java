// import java.util.*;
// public class NumPattern {
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number : ");
//     int n = sc.nextInt();
//     for(int i =1;i <= n;i++){
//         for(int j = 1;j<=i;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }
    
// }


import java.util.*;
public class NumPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for pattern : ");
        int n = sc.nextInt();
        for(int i = n; i>=1 ; i--){
            for(int j = 1; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}