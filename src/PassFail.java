import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int marks = input.nextInt();
        String check= marks >= 33 ? "pass": "fail";

        System.out.println("Print the results: "+check);
    }
}
