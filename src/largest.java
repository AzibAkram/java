import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE 1st NUMBER ");
        int a= sc.nextInt();
        System.out.println("enter the largest number");
        int b = sc.nextInt();
        System.out.println( " enter the 3rd number");
        int c = sc.nextInt();
        int max = a;
        if(b>max);
        {
            max=b;
        }
        if(c>max){
            max=c;
        }
            System.out.println("the largest number is the :"+max);


    }
}

