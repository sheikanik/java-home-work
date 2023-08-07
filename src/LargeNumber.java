import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int A=1;
        int B=3;
        int C=6;
        System.out.println("Enter three number: ");
          A=number.nextInt();
          B=number.nextInt();
          C=number.nextInt();

        if (A >= B && A >= C){
            System.out.println("A is greater number");
        }else if(B >=A && B>=C){
            System.out.println("B is greater number");
        }else if( C>=A && C>=B){
            System.out.println("C is greater Number");
        }else{
            System.out.println("error");
        }
    }
}
