// import java.util.*;
// public class Pattern {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the no.of ROWS : ");
//         int r = sc.nextInt();
//         System.out.print("Enter the no.of COLUMNS : ");
//         int c = sc.nextInt();

//         for(int i = 1;i<= r;i++){
//             for(int j =1;j<=c;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.*;
public class Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the no.of COLUMNS : ");
        int c = sc.nextInt();

        for(int i = 1;i<=r;i++){
            if(i == 1 || i == r){
                for(int j = 1; j <= c;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int j=1;j<=c-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}