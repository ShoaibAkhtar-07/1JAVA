import java.util.*;
public class NumPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of rows : ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j = 1; j<=r-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
