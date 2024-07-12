import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int salary= sc.nextInt();
        if(salary>=1000)
        {
            salary=salary +300;
            System.out.println(salary);

        }
        else
            System.out.println("invalid salary");





    }
}
