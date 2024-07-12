
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        System.out.println("enter the salary of student");
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
        if (salary >= 1000) {
            System.out.println("student is over 1000");
            salary=salary-100;
            System.out.println("now your salary is "+ salary);


        }
        else if (salary >= 2000) {
            System.out.println("student is over 2000");
            salary=salary-300;
            System.out.println("now your salary is "+salary);


        }
        else if (salary >= 3000) {
            System.out.println("student is over 3000");
            salary=salary-500;
            System.out.println("now your salary is "+salary);
        }
        else {
            System.out.println("student is over 5000");
        }


        }

}
