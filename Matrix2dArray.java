import java.util.Scanner;
public class Matrix2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.of ROWS : ");
        int rows = sc.nextInt();
        System.out.print("enter the no.of COLUMNS : ");
        int col = sc.nextInt();

        int [][] matrix = new int[rows][col];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int sum = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                sum+= matrix[i][j];
            }
        }
        System.out.print(sum);
    }
}
