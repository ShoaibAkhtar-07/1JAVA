public class varArgs {
    // static int sum (int a,int b){
    //     return a + b;
    // }
    // static int sum (int a,int b,int c){
    //     return a + b + c;
    // }
    // static int sum (int a,int b,int c,int d){
    //     return a + b + c + d ;
    // }
    public static int sum(int ...arr){
        // if we use static int sum(int a,int ...arr) and if we don't pass any argument in sum() then it will through an error 
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args){
        // System.out.println("the sum of 4 and 5 is : " +sum(4,5));
        // System.out.println("the sum of 4,5 and 6 is : " +sum(4,5,6));
        // System.out.println("the sum of 4,5,6 and 7 is : " +sum(4,5,6,7));
        System.out.println("the sum of 4 and 5 is : " +sum(4,5));
        System.out.println("the sum of 4,5,6 and 7 is : " +sum(4,5,6,7));

        
    }
}